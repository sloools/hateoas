package me.song.hateoas;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.RepresentationModel;

public class Sample extends RepresentationModel<Sample> {

    private String name;

    @JsonCreator // setter가 아닌 생성자를 통해 Json을 Java객체로 역직렬화한다는 Jackson 어노테이션. 생성자를 통해 역직렬화 하면 불변객체화 할 수 있음
    public Sample(@JsonProperty("name") String name){ // @JsonProperty : 어느 필드에 인자를 넣어야 할 지 알려주는 어노테이션
        this.name = name;
    }

    private String getName(){
        return name;
    }

}
