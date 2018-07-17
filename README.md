
-------------------------------------------------------------------------------

RUN
	$ ./mvnw clean install
	$ ./mvnw -f service/pom.xml spring-boot:run


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

