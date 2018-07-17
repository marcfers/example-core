package br.com.example.domain;

import org.springframework.stereotype.Repository;

@Repository
final class GreetingPersistence implements GreetingRepository {

	@Override
	public GreetingEntity findOne(final long identifier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GreetingEntity save(final GreetingEntity entity) {
		// TODO Auto-generated method stub
		return entity;
	}

}
