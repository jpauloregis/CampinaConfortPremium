/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plus;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Paulo
 */
public class datas {
    public static Date now() {
        return new Date();
    }
       
    public static Date isToday(Date date){
        return (date == null) ? datas.now() : date;        
    }
    
    public static String getDate(Date date, String format){
        return new SimpleDateFormat(format).format(date);
    }
    
    public static String getDate(Date date) {
        return DateFormat.getDateInstance().format(datas.isToday(date));
    }

    public static String getShortDate(Date date) {
        return DateFormat.getDateInstance(DateFormat.SHORT).format(datas.isToday(date));
    }

    public static String getMediumDate(Date date) {
        return DateFormat.getDateInstance(DateFormat.MEDIUM).format(datas.isToday(date));
    }

    public static String getLongDate(Date date) {
        return DateFormat.getDateInstance(DateFormat.LONG).format(datas.isToday(date));
    }

    public static String getFullDate(Date date) {
        return DateFormat.getDateInstance(DateFormat.FULL).format(datas.isToday(date));
    }
}
