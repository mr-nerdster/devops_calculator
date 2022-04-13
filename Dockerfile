FROM openjdk:8
MAINTAINER Akshat Jain mukul.darklord@gmail.com
COPY ./target/devops_calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "devops_calculator-1.0-SNAPSHOT.jar"]
