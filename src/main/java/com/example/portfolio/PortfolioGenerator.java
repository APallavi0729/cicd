package com.example.portfolio;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class PortfolioGenerator {

    public static void main(String[] args) throws IOException, TemplateException {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_29);
        cfg.setDirectoryForTemplateLoading(new File("src/main/resources/templates"));

        Template template = cfg.getTemplate("index.html");

        Map<String, Object> data = new HashMap<>();
        data.put("title", "My Portfolio");
        data.put("description", "This is my portfolio website");

        Writer out = new FileWriter("target/index.html");
        template.process(data, out);
    }
}