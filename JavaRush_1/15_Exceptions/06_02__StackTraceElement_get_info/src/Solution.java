public class Solution {

    public static final String OUTPUT_FORMAT = "Метод %s викликано з рядка %d класу %s у файлі %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (StackTraceElement element : stackTrace) {
            String method = element.getMethodName();
            int line = element.getLineNumber();
            String className = element.getClassName();
            String file = element.getFileName();
            System.out.printf(OUTPUT_FORMAT, method, line, className, file);
        }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }                     

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}