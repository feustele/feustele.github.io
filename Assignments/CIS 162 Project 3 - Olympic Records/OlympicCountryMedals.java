import java.io.*;
import java.util.Comparator;
import java.util.ArrayList;

public class OlympicCountryMedals implements Comparable {
    String city;
    int year;
    String countryCode;
    int goldMedals;
    int silverMedals;
    int bronzeMedals;
    public OlympicCountryMedals(int year, String city, String countryCode, int goldMedals,int silverMedals, int bronzeMedals){
        this.year = year;
        this.city = city;
        this.countryCode = countryCode;
        this.goldMedals = goldMedals;
        this.silverMedals = silverMedals;
        this.bronzeMedals = bronzeMedals;
    }
    public String getCity() {
        return city;
    }
    public int getYear(){ 
        return year;
    }
    public String getCountryCode(){
        return countryCode;
    }
    public int getGoldMedals(){
        return goldMedals;
    }
    public int getSilverMedals(){
        return silverMedals;
    }
    public int getBronzeMedals(){ 
        return bronzeMedals;
    }
    public String toString(){
        String currentString = (year + " " + city + ", " + countryCode + ", Gold: " + goldMedals + ", Silver: " + silverMedals + ", Bronze: " + bronzeMedals);
        return currentString;
    }
    public int compareTo(Object other){
        OlympicCountryMedals m = (OlympicCountryMedals) other;
        return m.goldMedals - goldMedals;
    }
    public ArrayList <OlympicCountryMedals> topTenCountriesGoldMedals(int year){
        searchCountryMedalsByYear(year);
        Collections.sort(OlympicMedalistsDatabase.medalsbyyear);
        OlympicMedalistsDatabase.medalsbyyear();
    }
}

