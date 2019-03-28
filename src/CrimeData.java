public class CrimeData {
    //numCrimes is the number of crimes per 100000 people
    double numCrimes;
    public CrimeData(String data){
        parseCrimeData(data);
    }

    private void parseCrimeData(String data) {
        String[] vars = data.split(",");
        numCrimes = Double.parseDouble(vars[3]);
    }

    @Override
    public String toString() {
        return "" + numCrimes;
    }

    public double getNumCrimes() {
        return numCrimes;
    }
}
