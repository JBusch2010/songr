package com.joachen.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.PatternMatchUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Pattern;

@Controller
public class HomeController {
    // in node.js, our controllers had lines like app.get("/", (req, res) => ...)
    @GetMapping("/HelloWorld")
    public String getRoot() {
        // the return needs to match exactly the filename of a template in resources/templates
        return "HelloWorld";
    }

    @GetMapping("/capitalize/hello")
    public String getHelloCaps(@RequestParam(required=false, defaultValue = "Hello") String name, Model m) {
        // add any pieces of data that you want available in the template
        m.addAttribute("firstName", capitalize(name));
        return "HelloCaps";
    }

    @GetMapping("/reverse")
    public String getHelloReverse(@RequestParam(required=false, defaultValue = "Joachen Busch") String name, Model m) {
        // add any pieces of data that you want available in the template
        m.addAttribute("firstName", reverse(name));
        return "HelloReverse";
    }

    public String capitalize(String cap) {
        String str = cap;
        return str.toUpperCase();
    }

    public static String reverse(String sentence) {
        String[] str = sentence.split(" ");
        String reverse = new String();
        for(int i = str.length - 1; i >= 0; i--){
            reverse = reverse + str[i] + " ";
        }
        return reverse.trim();
    }
}

