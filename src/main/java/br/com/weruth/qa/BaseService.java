package br.com.weruth.qa;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Base class for new service classes.
 * 
 * @author eduardoh.c.wermuth@gmail.com.br
 *
 */
public abstract class BaseService {

	@SuppressWarnings("unchecked")
	public <T> T getClient(Class<T> port) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(port);
		factory.setAddress(getEndpoint());
		return (T) factory.create();
	}

	protected abstract String getEndpoint();
}
