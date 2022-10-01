# syntax=docker/dockerfile:1

FROM openjdk:17
EXPOSE 8085
ADD target/student-management-system.jar .
ENTRYPOINT ["java","-jar","/student-management-system.jar"]

