package TallerJava;
/*
13.	Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercise13 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        DateTimeFormatter formatterYear = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter formatterHour = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.print(formatterYear.format(localDate) + " ");
        System.out.println(formatterHour.format(localTime));
    }

}
