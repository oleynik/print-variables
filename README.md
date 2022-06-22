# Print Variables

## Overview
This project read all Environment Variables and System Properties and print them to the System Output.
The main purpose of this project is to test passing Variables and Proprties.

## FAQ
### How to build the Project?
This Project uses [Gradle](https://gradle.org/) as a build tool. To build this project is enough to run next command: `gradle clean build`.

### How to run the Project?
This project uses [Spring Boot](https://spring.io/projects/spring-boot) which means that to run the project need to run next command: `gradle bootRun`.

### How to create Docker Image?
This project is suitable for building Docker Image out of the box. To do that need to run `docker build .` command from the root folder of the project.