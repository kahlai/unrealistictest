# Unrealistic Test

This is a (somehow) unrealistic test agains startup time for spring-boot and quarkus with 2000 entity classes.



This repository contains 2 projects, both written in java. 

One using spring framework, another using quarkus framework.

Each contains 2000 Entities and 2000 Repository (implements org.springframework.data.jpa.repository.JpaRepository) 

Both application can run as standalone, use h2 as in memory database and terminate as soon as it finish running.

## Requirements

- Java 11+
- Graalvm 20+
- Maven 3.8.1



## Compile and test spring-boot application

### Example build command

```
cd spring-boot
mvn clean package
```

### Example run command

```
java -jar ./target/sb-0.0.1-SNAPSHOT.jar
```

### Example output

```
time java -jar ./target/sb-0.0.1-SNAPSHOT.jar

real	0m56.923s
user	1m55.659s
sys	0m3.458s
```



## Compile and test quarkus application

### Example build command

```
cd quarkus
mvn clean package
```

### Example run command

```
java -jar ./target/quarkus-app/quarkus-run.jar
```

### Example output

```
time java -jar ./target/quarkus-app/quarkus-run.jar

real	0m7.346s
user	0m16.370s
sys	0m0.897s
```

