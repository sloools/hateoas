package me.song.hateoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * RESTful (Representational State Transfer) 하다는 것은 단순히 json으로 표현된 자원을 말하는 것이 아니다.
 * 우리가 일반적으로 알고 있는 HTTP API에서 self-descriptive messaage와 HATEOAS가 추가되어야 진정한 REST API라고 할 수 있다.
 * self-descriptive messaage란, message 내용으로 온전히 해석이 가능하다는 뜻이고,
 *
 * HATEOAS란, 애플리케이션 상태는 항상 하이퍼링크를 이용해 전이되어야 한다는 뜻이다.
 * 즉, 서버에서 현재 상태에 따라 접근 가능한 자원인 서비스에 대한 링크를 걸어두어 클라이언트에게 제공하여 상태기반행위를 데이터와 분리하는 방식이다.
 * 예를 들어, 클라이언트가 서버의 주문 프로세스에 접근한다고 가정했을 때, 응답으로 주문 프로세스에서 접근 가능한 링크(ex.주문가능수량, 주문취소 등)를 받아 이를 기반으로 개발하는 것을 의미한다.
 *
 * 이는 독리적 진화와 상호 운용성을 해치지 않는다.
 * 서버가 수정될 때 클라이언때 또한 변경하지 않아도 정상적으로 작동할 수 있다.
 *
 *
 */
@SpringBootApplication
public class HateoasApplication {

    public static void main(String[] args) {
        SpringApplication.run(HateoasApplication.class, args);
    }

}
