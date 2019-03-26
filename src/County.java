public class County {
    String state, name;
    int fips;
    ElectionData electionData;
    EducationData educationData;
    CrimeData crimeData;
    public County(String fips, String name, String state,  String electionData, String eduData, String crimeData){
        this.fips = Integer.parseInt(fips);
        this.name = name;
        this.state = state; 
        this.electionData = new ElectionData(electionData);
        this.educationData = new EducationData(eduData);
        this.crimeData = new CrimeData(crimeData);
    }

}
