package datetimedemo;

import java.time.LocalDate;

public class MyDate {

    public static void main(String[] args) {
        LocalDate date =  LocalDate.now();
        LocalDate yesteday =  date.minusDays(1);

//        System.out.println("Today: "+date);
       // System.out.println("Yestedatey: "+yesteday);
        LocalDate JediD = LocalDate.of(2004,2,9);
        System.out.println(JediD.isLeapYear());

        String da =  "2020-10-22";
        LocalDate myD = LocalDate.parse(da);
        //getYear
        System.out.println("Year: "+date.getYear());
        //getDay
        System.out.println("Day: "+date.getDayOfMonth());
        //getmONTH
        System.out.println("Month: " +date.getMonth());




    }
}
