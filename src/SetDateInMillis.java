import java.util.GregorianCalendar;

public class SetDateInMillis {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        calendar.setTimeInMillis(1234567898765L);

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1;
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Год: " + year);
        System.out.println("Месяц: " + month);
        System.out.println("День: " + day);
    }
}
