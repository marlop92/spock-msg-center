FROM openjdk:17
#ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/spock-msg-center-0.0.1-SNAPSHOT.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
#ADD target/lib           /usr/share/myservice/lib
# Add the service itself
#ARG JAR_FILE
#ADD target/${JAR_FILE} /usr/share/myservice/spock-msg-center-0.0.1-SNAPSHOT.jar