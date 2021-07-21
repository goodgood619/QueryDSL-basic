# QueryDSL Sample Study

QueryDSL 관련 예제

출처 : [관련예제](https://engkimbs.tistory.com/828)

주의 사항
1. 실행을 하기전에 앞서, mvn package 혹은 install 명령을 사용해 QueryDSL 관련 클래스를 만들어 줘야합니다.   
   위치는 `target/generated-sources/java` 이하에 만들어집니다.  
   QueryDSL 관련 클래스를 사용해야 하기 때문에, 위의 위치를 `Mark Directory를 Source Root로 설정`해줘야 합니다.  
   출처 : [문제해결](https://velog.io/@woo0_hooo/Spring-Boot%EC%99%80-QueryDSL-%EC%97%B0%EB%8F%99%ED%95%98%EA%B8%B0)
2. junit5 이상부터는 타사 라이브러리를 제공하지 않기 때문에, 따로 import를 해줘야 합니다.  
   출처 : [문제해결](https://aonee.tistory.com/2)


