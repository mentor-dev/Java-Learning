import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        final String PATTERN = "dd.MM.yyyy'р'. H'г'.m'хв'";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATTERN);
        System.out.println(dtf.format(localDateTime));
    }
}