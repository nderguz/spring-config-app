package api.clientconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@EnableAutoConfiguration
public class PropertyController {

    @Value("${user.info}")
    private String info;

    @GetMapping("/info")
    public String getInfo(){
        return this.info;
    }
}
