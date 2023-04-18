package com.example.resume;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String korPage(){
        return "indexKor";
    }

    @GetMapping("/eng")
    public String engPage(){
        return "indexEng";
    }

}
