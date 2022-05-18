# Web Service의 이해

> HTTP는 REST(Representional State Transfer) 개념을 바탕으로 설계하였다.
 
<br>

# RESTful 아키텍처 스타일
- 모든 리소스는 URI로 식별한다. (URI: 어느 위치에 어떤 자료까지 포함하는 데이터)
- 모든 리소스는 다중 표현을 가질 수 있다.
- 모든 리소스는 표준 HTTP 메소드로 접근/변경/생성/삭제(POST, GET, PUT, DELETE) 할 수 있다.
- 서버는 상태 정보를 갖지 않는다.

> RESTful API를 설계한다는 것은 사용자에게 제공하고자 하는 리소스에 대한 접근을 명확하고 쉽게 만든다는 의미이다.

<br>

# RESTful API Naming

| Resource       | POST(create)   | GET(read)     | PUT(update)          | DELETE(delete) |
|----------------|----------------|---------------|----------------------|----------------|
| /articles      | 새로운 article 생성 | article 목록    | articles에 대한 대량 업데이트 | 모든 articles 삭제 |
| /articles/1234 | 에러             | 특정 article 보기 | 있으면 업데이트 없으면 에러      | 삭제             |

<br>

# RESTful Service with Spring Boot 구현

## Spring MVC의 구조
- Spring MVC는 프론트 컨트롤러 패턴을 기초로한 아키텍처를 가진다.
- DispatcherServlet은 Spring MVC의 핵심으로써 프론트 컨트롤러 역할을 담당한다.
- client ⇄ DispatcherServlet ⇄ HandlerMapping (@GetMapping, @PostMapping) → Constroller

<br>

## User라는 도메인에서 CRUD를 구성해보는 예제

| Method | URL                              |
|--------|----------------------------------|
| POST   | http://localhost:8080/users      |
| GET    | http://localhost:8080/users/{id} |
| PUT    | http://localhost:8080/users/{id} |
| DELETE | http://localhost:8080/users/{id} |
| GET    | http://localhost:8080/users      |

<br>

## Server
UserController ⇄ UserServiceLogic ⇄ UserStoreLogic

<br>

### pom.xml
1. spring initializer를 이용해서 작성
    - Dependencies: springweb, lombok
2. [maven repository](https://mvnrepository.com/) 에서 gson 라이브러리 추가
   - Dependencies: gson

### 패키지
- io.namusori.rest
  - entity
  - service
  - store
  - controller

### UserRestApp.java
- @SpringBootApplication
```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserRestApp {
    public static void main(String[] args) {
        SpringApplication.run(UserRestApp.class, args);
    }
}
```

### entity/User.java
- @Getter
- @Setter
- @ToString
- new Gson().toJson(user)