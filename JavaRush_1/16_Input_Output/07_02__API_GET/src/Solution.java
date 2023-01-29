import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.com.ua/api/1.0/rest/projects");
        // URL url = new URL("https://api.coingecko.com/api/v3/simple/price?ids=bitcoin&vs_currencies=usd");
        try (InputStream input = url.openStream()) {
            byte[] buffer = input.readAllBytes();
            String result = new String(buffer);
            System.out.println(result);
        }
    }
}