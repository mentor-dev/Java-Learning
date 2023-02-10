import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();
                         
    public static void main(String[] args) {
        final String PATTERN = "e d.M.yy HH:mm:ss.n VV";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATTERN);
        System.out.println(dtf.format(zonedDateTime));
    }
}