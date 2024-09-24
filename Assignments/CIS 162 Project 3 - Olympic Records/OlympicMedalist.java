import java.io.*;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Write a description of class OlympicMedalists here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OlympicMedalist implements Comparable{
    String CITY;
    int YEAR;
    String SPORT;
    String DISCIPLINE;
    String EVENT;
    String ATHLETE_NAME;
    String GENDER;
    String COUNTRY_CODE;
    String MEDAL;
    public OlympicMedalist (String input){
        String[] data = input.split(",");
        CITY = data[0];
        YEAR = Integer.parseInt(data[1]);
        SPORT = data[2];
        DISCIPLINE = data[3];
        EVENT = data[4];
        ATHLETE_NAME = data[5];
        GENDER = data[6];
        COUNTRY_CODE = data[7];
        MEDAL = data[8];
    }
    public String getCity(){
        return CITY;
    }
    public int getYear(){
        return YEAR;
    }
    public String getSport(){
        return SPORT;
    }
    public String getDiscipline(){
        return DISCIPLINE;
    }
    public String getEvent(){
        return EVENT;
    }
    public String getName() {
        return ATHLETE_NAME;
    }
    public String getGender() {
        return GENDER;
    }
    public String getCountryCode() {
        return COUNTRY_CODE;
    }
    public String getMedal(){
        return MEDAL;
    }
    public String toString(){
        String requestedString = (CITY + " " + YEAR + " " + "Country: " + COUNTRY_CODE + "Sport: " + SPORT + "Event: " + EVENT + "Name: " + ATHLETE_NAME + MEDAL);
        return requestedString;
    }
    public int compareTo(Object other) { 
    OlympicMedalist medalist = (OlympicMedalist) other; 
    return Comparator.comparing(OlympicMedalist::getYear) 
            .thenComparing(OlympicMedalist::getCountryCode) 
            .compare(this, medalist); 
    }
    public ArrayList <OlympicCountryMedals> searchCountryMedalsByYear(int year){
        
    }
}
