package br.com.example.domain;

final class GreetingEntity {

    private final long id;
    private final String content;

    GreetingEntity(final long id, final String content) {
        this.id = id;
        this.content = content;
    }

    long getId() {
        return this.id;
    }

    String getContent() {
        return this.content;
    }

}
