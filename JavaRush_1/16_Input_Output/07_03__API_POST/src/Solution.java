import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        try (OutputStream output = connection.getOutputStream();
             InputStream input = connection.getInputStream()) {
            // output.write(0);
            output.flush();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(input));
            while (buffer.ready()) {
                System.out.println(buffer.readLine());
            }
        }
    }
}