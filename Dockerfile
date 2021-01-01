FROM openjdk:12-alpine

WORKDIR /app

COPY build/libs/remote-debug-app-0.0.1-SNAPSHOT.jar /app

# Exposing link for intellij debugger to get attached to the docker process
ENV JAVA_TOOL_OPTIONS='-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:9000'

# Exposing remote debugging port
EXPOSE 9000

# Exposing application port
EXPOSE 8080

ENTRYPOINT ["java","-jar","remote-debug-app-0.0.1-SNAPSHOT.jar"]