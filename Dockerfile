FROM openjdk:17
ADD target/CustomerDetails-0.0.1-SNAPSHOT.jar CustomerDetails-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "CustomerDetails-0.0.1-SNAPSHOT.jar"]

