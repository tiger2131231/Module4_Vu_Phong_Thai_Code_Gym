package com.example.bai2ss1_module4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {

    private static final Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("world", "thế giới");
        dictionary.put("book", "quyển sách");
        dictionary.put("computer", "máy tính");
        dictionary.put("java", "ngôn ngữ lập trình Java");
    }

    @GetMapping("/dictionary")
    public String showForm() {
        return "index";
    }

    @PostMapping("/dictionary")
    public String translate(@RequestParam("word") String word, Model model) {
        String result = dictionary.get(word.toLowerCase());
        if (result != null) {
            model.addAttribute("word", word);
            model.addAttribute("result", result);
        } else {
            model.addAttribute("message", "Không tìm thấy từ: " + word);
        }
        return "index";
    }
}