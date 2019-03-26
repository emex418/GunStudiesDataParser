import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<County> counties;

    public static void main(String[] args) {

        //break each data set into lines
        //create new County object with the inputs of each of these lines
        //add county object to ArrayList

        String electionData = Utils.readFileAsString("data/2016_Presidential_Results.csv");
        String educationData = Utils.readFileAsString("Education.csv");
        String crimeData = Utils.readFileAsString("crime_data_w_population_and_crime_rate.csv");
        initializeData(electionData, educationData, crimeData);


    }

    public static void initializeData(String electionFile, String educationFile, String crimeFile) {
        String[] electionLocs = electionFile.split("/n");
        for (String electionLine : electionLocs) {
            String[] vars = electionLine.split(",");
            String fips = vars[vars.length - 1];
            String name = vars[vars.length - 2];
            String state = vars[vars.length - 3];
            String eduLine = findEduCounty(fips);
            String crimeLine = findCrimeCounty(name, state);
            counties.add(new County(fips, name, state, electionLine, eduLine, crimeLine));
        }
    }

    private static String findCrimeCounty(String name, String state) {
        //loop through each line in crime
        //split
        //if the county name and the state are equal to the inputs return line
        // else return {0,0,0,0}
        return "";
    }

    private static String findEduCounty(String fips) {
        //see find crime but with fips
        //else return {0,0,0,0}
        return "";
    }
    //TODO: makes cvs file, runs dataManager with String from CVS files
    //TODO: run here the County constructors with each line you loop through
}
