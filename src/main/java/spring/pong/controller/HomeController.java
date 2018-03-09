package spring.pong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sean on 09/03/2018.
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Ping Pong";
    }

}
