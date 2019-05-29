package pers.hai.sample.dp.builder;

import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * TODO
 * <p>
 * Create Time: 2019/5/25 23:20
 * Last Modify: 2019/5/25
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class HTMLBuilder extends Builder {

    private final Logger logger = Logger.getLogger(HTMLBuilder.class);
    private String fileName;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        fileName = String.format("%s.html", title);

        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException ex) {
            logger.error(ex.getMessage());
        }

        writer.println(String.format("<html><head><title>%s</title></head></body>", title));
        writer.println(String.format("<h1>%s</h1>", title));
    }

    @Override
    public void makeString(String content) {
        writer.println(String.format("<p>%s</p>", content));
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (String item : items) {
            writer.println(String.format("<li>%s</li>", item));
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return fileName;
    }
}
