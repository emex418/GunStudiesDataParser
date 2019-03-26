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

        String[] rows = electionData.split("\n");


        for (int i = 0; i < rows.length; i++) {

        }
    }

    public static void initializeData(String electionFile, String educationFile, String crimeFile) {

        counties.add(new County(electionFile, educationFile, crimeFile));
    }
    //TODO: makes cvs file, runs dataManager with String from CVS files
    //TODO: run here the County constructors with each line you loop through
}
