package personal.projects.entity;

import org.joda.time.Days;
import org.joda.time.LocalDate;

public class AgeCalculator {



    public int getAgeInDays(String birthDate) {
        LocalDate now = LocalDate.now();
        int diff = Math.abs(Days.daysBetween(now, LocalDate.parse(birthDate)).getDays());
        return diff;
    }

}
