package com.chandana.hello.helloclient;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.chandana.hello.service.HelloService;

public class Activator implements BundleActivator {

	 ServiceReference<?> serviceReference;
	 
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		serviceReference= context.getServiceReference(HelloService.class.getName());
		HelloService helloService =(HelloService)context.getService(serviceReference);
        System.out.println(helloService.helloMethods());
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		context.ungetService(serviceReference);
	}

}
