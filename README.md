#zipkin-sleuth-server
zipkin-sleuth-server

### zipkin

For building and starting an instance of Zipkin for checking out Zipkin locally. There are three options: 
using Java, Docker or running from source. in this project we use java.

If you have Java 8 or higher installed, the quickest way to get started is to fetch the latest release as a 
self-contained executable jar:

````
curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar
````
zipkin UI will be at this address http://localhost:9411/zipkin/

### sleuth
This library makes it possible to identify logs pertaining to a specific job, thread, or request. Sleuth integrates 
effortlessly with logging frameworks like Logback and SLF4J to add unique identifiers that help track and diagnose issues using logs.

if you want to use sleuth and zipkin in toy project u must add this maven dependencies :

````
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-zipkin</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-sleuth</artifactId>
</dependency>
````
After you step up zipkin and sleuth, you can trace your requests in zipkin.
