package com.example.Bipolar_Assignment;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertTrue;

public class HtmlFileTest {

    @Test
    public void testHelloWorldPresenceInHtmlFile() throws IOException {
        // Load the HTML file from the resources folder
        InputStream htmlStream = getClass().getClassLoader().getResourceAsStream("index.html");
        Document document = Jsoup.parse(htmlStream, "UTF-8", "");

        // Check if the word "Hello World" is present in the HTML file
        assertTrue("The word 'Hello World' is not present in the HTML file",
                document.text().contains("Hello World"));
    }
}
