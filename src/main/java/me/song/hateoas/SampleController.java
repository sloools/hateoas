package me.song.hateoas;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class SampleController {

    private static final String TEMPLATE = "Hello, %s! ";

    @RequestMapping("/sample")
    public HttpEntity<Sample> getSample(@RequestParam(value = "name", defaultValue = "Song") String name){
        Sample sample = new Sample(name);

        sample.add(linkTo(methodOn(SampleController.class).getSample(name)) // WebMvcLinkBuilder 클래스에서 제공하는 메서드를 활용하여 sample 객체에 링크를 생성
                .withSelfRel() // self 링크 생성
        );

        return new ResponseEntity<>(sample, HttpStatus.OK);
    }

    @GetMapping("/sampleData")
    public ResponseEntity sampleData(@RequestParam(value = "name", defaultValue = "Song") String name){
        Sample sample = new Sample(String.format(TEMPLATE, name));
        return new ResponseEntity<>(sample, HttpStatus.OK);
    }

}