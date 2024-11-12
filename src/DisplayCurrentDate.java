import java.util.GregorianCalendar;

public class DisplayCurrentDate {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // Месяц от 0 до 11, поэтому добавляем 1
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Текущий год: " + year);
        System.out.println("Текущий месяц: " + month);
        System.out.println("Текущий день: " + day);
    }
}
