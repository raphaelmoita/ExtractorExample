package com.ph.stateless.extractor;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExtractorService {

    public Extractor getExtractor(List<String> data) {
        return new Extractor(data);
    }
}
