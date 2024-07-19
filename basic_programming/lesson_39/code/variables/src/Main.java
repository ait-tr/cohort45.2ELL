public class Main {

    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        long seconds = millis / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        System.out.println(millis);
        System.out.println(seconds);
        System.out.println(minutes);
        System.out.println(hours);
        System.out.println(days);
        System.out.println(years);

        System.out.println(1970 + years);
    }
}
