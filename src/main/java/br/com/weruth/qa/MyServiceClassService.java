package br.com.weruth.qa;

/**
 * An example of a serice class. As a pattern I always use "Service" sufix on
 * the end of the service class name.
 * 
 * @author eduardoh.c.wermuth@gmail.com.br
 *
 */
public class MyServiceClassService extends BaseService {

	// 'endpoint.myservice' is setted on the pom.xml
	private final String endpoint = System.getProperty("endpoint.myservice");

	@Override
	protected String getEndpoint() {
		return endpoint;
	}

	public void serviceMethod() {
		/*
		 * First you need to use the BaseService.getClient to get the service
		 * client that will call the webMethods. BaseService.getCliente needs to
		 * receive portType interface stub generated by jax-ws, with this the
		 * endpoint will be set and you will be ready to call the webMethods.
		 * 
		 * Example:
		 * super.getClient(GeneratedServicePortTypeInterface.class);
		 */
	}

}