package br.com.example.domain;

interface GreetingRepository {

	GreetingEntity findOne(long identifier);

	GreetingEntity save(final GreetingEntity entity);

}
