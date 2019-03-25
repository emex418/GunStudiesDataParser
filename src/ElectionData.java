public class ElectionData {
    int demVotes, gopVotes;
    public ElectionData(String data){
        parseCountyData(data);
    }

    private void parseCountyData(String data) {
        String[] vars = data.split(",");
        this.demVotes = (int)Double.parseDouble(vars[1]);
        this.gopVotes = (int)Double.parseDouble(vars[2]);
    }

    public int getDemVotes() {
        return demVotes;
    }

    public int getGopVotes() {
        return gopVotes;
    }
}
