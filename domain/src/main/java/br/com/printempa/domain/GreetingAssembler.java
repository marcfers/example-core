package br.com.example.domain;

import org.springframework.stereotype.Component;

import br.com.example.api.GreetingDto;

@Component
final class GreetingAssembler {

	GreetingDto toDto(final GreetingEntity entity) {
		final GreetingDto dto = new GreetingDto();
		dto.id = entity.getId();
		dto.content = entity.getContent();
		return dto;
	}

}
