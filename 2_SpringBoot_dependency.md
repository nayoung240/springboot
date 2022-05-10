# Spring Boot 의존성 관리

## 기본적인 웹 기반의 spring boot 프로젝트 만들기

### spring 프로젝트 생성 도구 : [spring initializr](https://start.spring.io/)

### 설정
- project - maven project
- language - java
- spring boot - 2.6.7
- packaging - jar
- java 8
- dependencies - spring web

### pom.xml
exproler → `<parent>, <dependencies>, <build>` 복사하고 붙여 넣기

- maven은 pom.xml(maven 프로젝트) 간의 상속 구조가 가능하다.
- spring-boot-starter-parent 패키지를 이용해서 dependency를 설정하는 의존성 관리

<br><br>

## spring boot 프로젝트 실행하기

### Application.java
- @SpringBootApplication

### HelloController.java
- @RestController
- @GetMapping("/hello")

<br><br>

## 포트 바꾸기

### application.yml
```aidl
spring :
  port : 80
```
