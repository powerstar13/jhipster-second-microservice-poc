package backend.jshong.poc.jhipster.secondmicroservice.web.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/second")
@Slf4j
public class SecondResource {

    @GetMapping("/hello")
    public String hello() {
        log.info("Hello from SecondResource");
        return "Hello from SecondResource";
    }
}
