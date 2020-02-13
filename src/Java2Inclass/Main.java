package Java2Inclass;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
	calcTimes();
    }
    public static void calcTimes(){
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("MM/dd/yyy");
        //The Joshua Tree    9 March 1987
        //Rattle and Hum     10 October 1988
        LocalDate joshTree = LocalDate.of(1987, 3, 9);
        LocalDate rattlenHum = LocalDate.of(1988,10,10);
        LocalDate current = LocalDate.now();
        Period thenToNow = Period.between(joshTree, current);
        System.out.println("Time from The Joshua Tree till now");
        System.out.println("Days: " + thenToNow.getDays());
        System.out.println("Months: " + thenToNow.getMonths());
        System.out.println("Years: " + thenToNow.getYears());
        System.out.println("-------------------------------------------------------");

        Period betweenEm = Period.between(joshTree, rattlenHum);
        System.out.println("Time between the two Albums");
        System.out.println("Days: " + betweenEm.getDays());
        System.out.println("Months: " + betweenEm.getMonths());
        System.out.println("Years: " + betweenEm.getYears());
        System.out.println("--------------------------------------------------------");

        LocalDate nextAlbum = rattlenHum.plus(betweenEm);
        System.out.println("Date of final release: " + nextAlbum.format(df1));
    }
}
