import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<County> counties;

    public static void main(String[] args) {

        //break each data set into lines
        //create new County object with the inputs of each of these lines
        //add county object to ArrayList

        String electionData = Utils.readFileAsString("data/2016_Presidential_Results.csv.url");
        String educationData = Utils.readFileAsString("data/Education.csv.url");
        String crimeData = Utils.readFileAsString("data/crime_data_w_population_and_crime_rate.csv");
        initializeData(electionData, educationData, crimeData);

        for (int i = 0; i < counties.size(); i++) {
            Utils.writeDataToFile("parsedResults", counties.get(i).toString());
        }


    }

    public static void initializeData(String electionFile, String educationFile, String crimeFile) {
        String[] electionLocs = electionFile.split("/n");
        for (String electionLine : electionLocs) {
            String[] vars = electionLine.split(",");
            String fips = vars[vars.length - 1];
            String name = vars[vars.length - 2];
            String state = vars[vars.length - 3];
            String eduLine = findEduCounty(educationFile, fips);
            String crimeLine = findCrimeCounty(crimeFile, name, state);
            counties.add(new County(fips, name, state, electionLine, eduLine, crimeLine));
        }
    }

    private static String findCrimeCounty(String crimeFile, String name, String state) {
        //loop through each line in crime
        //split
        //if the county name and the state are equal to the inputs return line
        // else return "0,0,0,0"

        String[] rows = crimeFile.split("\n");
        for (int i = 0; i < rows.length; i++) {
            if (rows[i].indexOf(name) != -1 && rows[i].indexOf(state) != -1) {
                return rows[i];
            }
        }
        return "-1, -1, -1, -1";
    }

    private static String findEduCounty(String educationFile, String fips) {
        //see find crime but with fips
        //else return "0,0,0,0"
        String[] rows = educationFile.split("\n");
        for (int i = 0; i < rows.length; i++) {
            if (rows[i].indexOf(fips) != -1) {
                return rows[i];
            }
        }
        return "-1, -1, -1, -1";    }
    //TODO: makes cvs file, runs dataManager with String from CVS files
    //TODO: run here the County constructors with each line you loop through
}
