package com.poly.beeshoes.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author thangncph26123
 */
public class ConvertDate {

    public static Date convertStringToDate(String dateString) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date birthDate = format.parse(dateString);
            return birthDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
