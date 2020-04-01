package com.vladis1350.controller;

import com.vladis1350.bean.UniqueWordCounter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("counter")
public class UniqueWordCounterController {
    private UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();

    @GetMapping("/list")
    public Map<String, Integer> getListMap() {
        return uniqueWordCounter.getUniqueWordList();
    }

    @GetMapping("/add")
    public Map<String, Integer> add(@RequestParam(name="key") String key) {
        uniqueWordCounter.addWord(key);
        uniqueWordCounter.printWordsFrequency();
        return uniqueWordCounter.getUniqueWordList();
    }

    @GetMapping
    public String getMostFrequentWord() {
        return uniqueWordCounter.getMostFrequentWord();
    }
}
