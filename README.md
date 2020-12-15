# spring-cloud-zookeeper-example
##프로젝트 소개
Spring Cloud Zookeeper를 활용한 서비스 디스커버리 검토를 위한 프로젝트입니다.
## 필수 사항
프로젝트를 실행시키기 위해 로컬 환경에 **Zookeeper**가 **2181**포트로 구동되고 있어야합니다.
## 예제 내용
이 프로젝트는 아래의 내용에 대한 소스코드를 작성했습니다.
- Spring Cloud Zookeeper와 Zookeeper 연동
- Spring Cloud Gateway 연동
- Spring Cloud OpenFeign 연동
## 시나리오
아래의 HTTP GET 요청을 Gateway 서버에 보냅니다
```bash
$ curl localhost:9101/world/test 
This is Hello Service!!
```
요청부터 응답까지 아래의 시나리오를 이루어집니다
![zookeeper 001](https://user-images.githubusercontent.com/46879746/102187664-9e620400-3ef7-11eb-9890-9fb952ae4d17.jpeg)
