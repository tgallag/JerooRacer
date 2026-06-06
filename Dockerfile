FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN javac src/JerooRacer.java

CMD ["java", "-cp", "src", "JerooRacer"]