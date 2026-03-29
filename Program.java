import java.time.LocalDate;
import java.time.Period;

public class Program {

    static boolean isAdult(LocalDate birthday) {
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthday, now);

        if (period.getYears() >= 18) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2000, 6, 7);
        boolean adult = isAdult(birthday);
        System.out.println(adult);
    }
}