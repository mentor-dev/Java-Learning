import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }                       

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        Set<LocalDateTime> resultSet = new HashSet<>();
        for (var pair : sourceMap.entrySet()) {
            LocalDate date = pair.getKey();
            List<LocalTime> list = pair.getValue();
            for (LocalTime listlTime : list) {
                LocalTime time = listlTime;
                LocalDateTime dateTime = LocalDateTime.of(date, time);
                resultSet.add(dateTime);
            }
        }
        return resultSet;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}