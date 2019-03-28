public class County {
    String state, name;
    int fips;
    String electionData;
    String educationData;
    String crimeData;

    public County(String fips, String name, String state, String electionData, String eduData, String crimeData){
        this.fips = Integer.parseInt(fips);
        this.name = name;
        this.state = state;
        this.electionData = new ElectionData(electionData).toString();
        this.educationData = new EducationData(eduData).toString();
        this.crimeData = new CrimeData(crimeData).toString();
    }

    @Override
    public String toString() {
        return  state +
                ", " + name +
                ", " + fips +
                ", " + electionData +
                ", " + educationData +
                ", " + crimeData
                ;
    }

}
