FROM openjdk:17-jdk

WORKDIR /home/app/employee

COPY target/*.jar EmployeeApp.jar

ENTRYPOINT ["java", "-jar", "EmployeeApp.jar"]