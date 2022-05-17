> Sprint Boot, Spring Cloud를 이용한  마이크로 서비스 개발 기초 강의

# 강의 목표
1. 클라우드 네이티브 환경에서 엔터프라이즈 어플리케이션 개발을 위해 적용하는 주요 프레임워크와 관련 기술들에 대한 이해
2. Spring Boot를 적용한 RESTful Web Service 만들기
3. Microservices 아키텍처에 대한 기본적인 내용 학습
4. Microservices 아키텍처를 갖는 어플리케이션 개발을 위해 적용하는 Spring  Cloud 기술 학습

<br>

# Spring Boot 개요
- 독립 실행 가능한 스프링 기반 애플리케이션 쉽게 생성할 수 있게 한다.
- -jar 커맨드 또는 전통적인 war로 배포 가능한 자바 애플리케이션 생성에 사용 가능하다.
- 내장된 Tomcat, Jetty, Undertow를 이용해 WAR 배포 없이 웹 애플리케이션 실행 가능하다.
- Starter POM 파일을 제공 받아 쉽게 라이브러리 관리할 수 있다.

<br>

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

<br>

## spring boot 프로젝트 실행하기

### 환경
- JDK 8.0 (1.8) 이상
- IntelliJ
- REST client - Insomnia

### Application.java
- @SpringBootApplication

### HelloController.java
- @RestController
- @GetMapping("/hello")

<br>

## 포트 바꾸기

### application.yml
```aidl
spring :
  port : 80
```
