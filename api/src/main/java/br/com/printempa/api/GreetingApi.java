package br.com.example.api;

public interface GreetingApi {

	/**
	 * Run a "Hello world!" message.
	 * 
	 * @param name a identifier for message.
	 * 
	 * @return the greeting message.
	 */
	GreetingDto run(final String name);

}
