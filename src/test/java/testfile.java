import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class testfile {

    @Test
    public void testWordPresenceInHtmlFile() throws IOException {
        // Replace "path/to/your/file.html" with the actual path to your HTML file
        File htmlFile = new File("C:\\Users\\SRINIVAS\\eclipse-workspace\\Bipolar_Assignment\\src\\main\\resources\\static\\Helloworld.html");

        // Replace "yourWord" with the word you want to check for in the HTML file
        String targetWord = "Hello World!";

        // Parse the HTML file using Soup
        Document document = Jsoup.parse(htmlFile, "UTF-8");

        // Check if the target word is present in the HTML file
        assertTrue("The word '" + targetWord + "' is not present in the HTML file",
                document.text().contains(targetWord));
    }
}
