# spring-cloud-demo
Introduction to Spring Cloud and Netflix OSS 

Demo application presenting main concepts and components of Netlix OSS wrapped in Spring Cloud project.

To start the app perform the following steps:
1. Change the spring.cloud.config.server.git.uri property in the {local-path}/demo/config-service/src/main/resources/application.properties file to your local path to the ./demo/app-config folder and run "git init", "git add ." and "git commit" commands in this folder.
2. Start ./demo/config-service, ./demo/eureka-service, ./demo/reservation-service, ./demo/reservation-client microservices by running "mvn spring-boot:run" command under each of those folders.
3. Go to localhost:8081/all-spaces or localhost:8081/reservation-service/reservations.
4. Discover more :)
