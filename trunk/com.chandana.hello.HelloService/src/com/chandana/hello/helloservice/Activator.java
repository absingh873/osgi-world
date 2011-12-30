package com.chandana.hello.helloservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.chandana.hello.service.HelloService;
import com.chandana.hello.service.impl.HelloServiceImpl;

public class Activator implements BundleActivator {
	ServiceRegistration<?> serviceRegistration;
	

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		System.out.println("Bundle Started.....!!!!!");
		HelloService service = new HelloServiceImpl();
		serviceRegistration = context.registerService(HelloService.class.getName(), service,null);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Bundle Stoped.....!!!!!");
		serviceRegistration.unregister();
	}

}
