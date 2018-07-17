
-------------------------------------------------------------------------------

Pré-requisito: Java 8 instalado

-------------------------------------------------------------------------------

RUN
	$ ./mvnw clean install
	$ ./mvnw -f service/pom.xml spring-boot:run
ou
    Executar pelo Eclipse o service/ExampleApplication.launch

Em seguida acessar a aplicação pelo Browser
    http://localhost:8080/greeting

-------------------------------------------------------------------------------

./mvnw archetype:generate -B \
        -DarchetypeGroupId=org.apache.maven.archetypes \
        -DarchetypeArtifactId=maven-archetype-quickstart \
        -DarchetypeVersion=1.1 \
        -DgroupId=br.com.example \
        -DartifactId=example-persistence \
        -Dversion=1.0-SNAPSHOT \
        -Dpackage=br.com.example.persistence

-------------------------------------------------------------------------------

