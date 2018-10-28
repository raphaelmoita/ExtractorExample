package com.ph.stateless;

import com.ph.stateless.extractor.Extractor;
import com.ph.stateless.extractor.ExtractorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class ExtractorServiceTest
{
    @Autowired
    private ExtractorService extractorService;

    @Test
    public void shouldGetTwoDifferentInstanceWhenGetExtractorIsCalled()
    {
        Extractor instance1 = extractorService.getExtractor(emptyList());
        Extractor instance2 = extractorService.getExtractor(emptyList());
        assertNotSame(instance1, instance2);
    }

    @Test
    public void shouldGetTwoDifferentValuesWhenGetFirstIsCalled()
    {
        Extractor instance1 = extractorService.getExtractor(Arrays.asList("A"));
        Extractor instance2 = extractorService.getExtractor(Arrays.asList("B"));

        assertEquals("A", instance1.getFirst());
        assertEquals("B", instance2.getFirst());
    }
}
