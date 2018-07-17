package br.com.example.domain;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.example.api.GreetingApi;
import br.com.example.api.GreetingDto;

@Service
final class GreetingService implements GreetingApi {

	private static final String TEMPLATE = "Hello, %s!";

	private final AtomicLong counter = new AtomicLong();

	private final GreetingAssembler assembler;

	private final GreetingRepository repository;

	GreetingService(final GreetingAssembler assembler, final GreetingRepository repository) {
		this.assembler = assembler;
		this.repository = repository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.example.api.Greeting#run(java.lang.String)
	 */
	@Override
	public GreetingDto run(final String name) {
		final long identifierFromCount = this.counter.incrementAndGet();
		final String content = String.format(GreetingService.TEMPLATE, name);
		GreetingEntity greetingEntity = this.repository.findOne(identifierFromCount);
		if (greetingEntity == null) {
			greetingEntity = new GreetingEntity(identifierFromCount, content);
		}
		return this.assembler.toDto(this.repository.save(greetingEntity));
	}

}
