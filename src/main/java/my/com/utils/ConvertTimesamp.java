package my.com.utils;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ConvertTimesamp {
    public static Date converStringtoDate() {
        java.util.Date date = new java.util.Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {
            String utilDate = format.format(date);
            java.util.Date dateconvert = format.parse(utilDate);
            java.sql.Date sqlDate = new java.sql.Date(dateconvert.getTime());
            return  sqlDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  null;
    }
    private static java.sql.Timestamp getCurrentTimeStamp() {

        java.util.Date today = new java.util.Date();
        return new java.sql.Timestamp(today.getTime());

    }

}
