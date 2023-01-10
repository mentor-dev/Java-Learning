import java.util.Arrays;
import java.util.Objects;

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Objects.isNull(array[i])) {
                for (int j = i + 1; j < array.length; j++) {
                    if (Objects.nonNull(array[j])) {
                        array[i] = array[j];
                        array[j] = null;
                        if (j == array.length - 1) 
                            i = array.length;
                        break;
                    }
                }
            }
        }
    }
}