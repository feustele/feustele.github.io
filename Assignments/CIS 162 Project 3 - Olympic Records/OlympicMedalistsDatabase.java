import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
/**
 * Write a description of class OlympicMedalistsDatabase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OlympicMedalistsDatabase implements Comparable {
    public OlympicMedalistsDatabase (){
        arrayList <OlympicMedalist> medalists = new arrayList <OlympicMedalist>();
        arrayList <OlympicCountryMedals> medals = new arrayList <OlympicCountryMedals>();
    }
    public void readOlympicMedalistData(String filename) {
        try{
            FileInputStream fileByteStream = new FileInputStream(filename);
            Scanner scnr = new Scanner(fileByteStream);
            scnr.nextLine();
            while(scnr.hasNext()) {
                String data = scnr.nextLine();
                OlympicMedalist.add(data);
            }

            generateCountryTotalMedals();
            fileByteStream.close();
        }
        catch(IOException e) {
            System.out.println("Failed to read the data file: " + filename);
        }
    }
    public int countAllMedalists (){
        return OlympicMedalist.size();
    }
    public int countAllWomen(){
        femalecounter = 0;
        for (OlympicMedalist e : medalists){
            if (e.getGender() = Female){
                femalecounter++;
            }
        }
        return femalecounter;
    }
    public int countAllMen(){
        malecounter = 0;
        for (OlympicMedalist e : medalists){
            if (e.getGender() = Male){
                malecounter++;
            }
        }
        return malecounter;
    }
    public ArrayList<OlympicMedalist> getMedalistsDatabase(){
        return medalists;
    }
    public ArrayList<OlympicCountryMedals> getCountryTotalMedalsDatabase(){
        return medals;
    }
    public ArrayList <OlympicMedalist> searchMedalistsByYear(int year){
        arrayList <OlympicMedalist> yearmedalists = new arrayList <OlympicMedalist>();
        for (OlympicMedalist e : medalists){
            if ((year <= 1976 || year >= 2008)|| e.getYear(year) = 0){
                yearmedalists.setSize = 0;
            }
            else{
                if (e.getYear() = year){
                    yearmedalists.add(e_);
                }
            }
        }
        return yearmedalists;
    }
    public ArrayList <OlympicMedalist> searchMedalistsByCountry(String countryCode){
        arrayList <OlympicMedalist> countrycodemedalists = new arrayList <OlympicMedalist>();
        for (OlympicMedalist e : medalists){
            if (e.getCountryCode() = countryCode){
                countrycodemedalists.add(e);
            }
        }
        return countrycodemedalists;
    }
    public OlympicMedalist findAthlete (String name){
        arrayList <OlympicMedalist> namemedalists = new arrayList <OlympicMedalist>();
        for (OlympicMedalist e : medalists){
            if (e.equalsIgnoreCase(name)){
                namemedalists.add(e);
            }
        }
        if (namemedalists.size >= 1){
            return namemedalists[0];
        }
        else {
            return "null";
        }
    }
    public void generateCountryTotalMedals(){
        Collections.sort(on);
        TreeMap < String, int[]> totals = new TreeMap <String, int[]> ();
        for (OlympicMedalist o : on){
            String key = o.getCity() + ", " + o.getYear() + ", " + o.getCountryCode();
            if (totals.containsKey(key)){
                int[] medals = totals.get(key);
                if (o.getMedal().equals("Gold")) {
                    medals[0]++;
                }
                if (o.getMedal().equals("Silver")) {
                    medals[1]++;
                }
                if (o.getMedal().equals("Bronze")) {
                    medals[2]++;
                }
            }
            else{
                int[] medals = new int [3];
                if (o.getMedal().equals("Gold")) {
                    medals[0]++;
                }
                if (o.getMedal().equals("Silver")) {
                    medals[0]++;
                }
                if (o.getMedal().equals("Bronze")) {
                    medals[0]++;
                }
            }
            for (Map.Entry<String,int []> entry:totals.entrySet()){
                String key = entry.getKey();
                String parts[] = key.split(", ");
                int[] tot = entry.getValue();
                int year = Int.parseInt(parts[1]);
                OlympicCountryMedals i = new OlympicCountryMedals(year.parts[0], parts[2], tot[0], tot[1], tot[2]);
                ocm.add(i);
            }
        }
    }
    public int compareTo(Object other){
        Collections.sort(medalists);
        OlympicMedalist medalist = (OlympicMedalist) other;
        return Comparator.comparing(OlympicMedalist::getYear)
                .thenComparing(OlympicMedalist::getCountryCode)
                .compare(this, medalist);
    }
    public ArrayList <OlympicCountryMedals> searchCountryMedalsByYear(int year){
        arrayList <OlympicMedalist> medalsbyyear = new arrayList <OlympicMedalist>();
        for (OlympicCountryMedals e : medals){
            if (e.getYear() = year){
                medalsbyyear.add(e);
            }
        }
        return medalsbyyear;
    }
    
}
