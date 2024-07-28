package com.example.portfolio;

import org.junit.Test;
import static org.junit.Assert.*;

public class PortfolioGeneratorTest {

    @Test
    public void testGeneratePortfolio() throws IOException, TemplateException {
        PortfolioGenerator generator = new PortfolioGenerator();
        generator.main(new String[] {});

        File outputFile = new File("target/index.html");
        assertTrue(outputFile.exists());
        assertTrue(outputFile.length() > 0);
    }
}