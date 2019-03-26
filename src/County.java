public class County {
    String state, name;
    int fips;
    ElectionData electionData;
    EducationData educationData;
    CrimeData crimeData;
    public County(String electionData, String eduData, String crimeData){
        parseIDData(eduData);
        this.electionData = new ElectionData(electionData);
        this.educationData = new EducationData(eduData);
        this.crimeData = new CrimeData(crimeData);
    }

    private void parseIDData(String data) {
        String[] vars = data.split(",");
        fips = Integer.parseInt(vars[0]);
        state = vars[1];
        name = vars[2];
    }

}
