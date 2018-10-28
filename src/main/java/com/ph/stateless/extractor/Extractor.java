package com.ph.stateless.extractor;

import java.util.List;

public class Extractor {

    private List<String> data;

    Extractor(List<String> data)
    {
        this.data = data;
    }

    public String getFirst() {
        return data.get(0);
    }
}
