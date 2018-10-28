package com.ph.stateless;

import com.ph.stateless.extractor.Extractor;
import com.ph.stateless.extractor.ExtractorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class App {

    //@Autowired
    private ExtractorService extractorService;

    //@PostConstruct
    public void execute() {
        Extractor extractor1 = this.extractorService.getExtractor(Arrays.asList("a", "b"));

        Extractor extractor2 = this.extractorService.getExtractor(Arrays.asList("c", "d"));

        System.out.println(extractor1.getFirst() + " - " + extractor2.getFirst());
    }

    public static void main(String[] args) {
        new SpringApplication().run(App.class, args);
    }
}
