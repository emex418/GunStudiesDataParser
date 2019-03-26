public class County {
    String state, name;
    int fips;
    ElectionData electionData;
    EducationData educationData;
    CrimeData crimeData;
    public County(String fips, String name, String state,  String electionData, String eduData, String crimeData){
        this.fips = Integer.parseInt(fips);
        this.name = name;
        parseIDData(eduData);
        this.electionData = new ElectionData(electionData);
        this.educationData = new EducationData(eduData);
        this.crimeData = new CrimeData(crimeData);
    }

    private void parseIDData(String data) {
        String[] vars = data.split(",");
        state = vars[1];
    }

}
