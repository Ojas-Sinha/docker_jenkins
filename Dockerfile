FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY MaxFinder.java .
RUN javac MaxFinder.java
CMD ["java","MaxFinder"]