public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.com.ua", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("URL-адреса " + url + " містить мережевий протокол " + protocol + " і домен " + domain);
        }
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("http:"))
            return "http";
        if (url.startsWith("https:"))
            return "https";        
        return "невідомий";
    }

    public static String checkDomain(String url) {
        if (url.endsWith(".com"))
            return "com";
        if (url.endsWith(".net"))
            return "net";
        if (url.endsWith(".org"))
            return "org";
        if (url.endsWith(".ua"))
            return "ua";
        return "невідомий";
    }
}