package ru.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * PHANTOMHUNTER
 **/

@Controller
public class SpringBootController {
    @RequestMapping("/")
    public @ResponseBody
    String greeting() {
        return "All right";
    }
}
