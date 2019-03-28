public class EducationData {
    //variables extract percentages of people in the county that had a certain level of education from 2012 to 2016
    //someCollege is 1 to 3 years while more college is 4 or more years
    double noHighSchool, highSchool, someCollege, moreCollege;

    //columns L, M, N, O, T, U, V, W << 1970 and 1980 variables but we parsed 2016 variables because it more aligns with the other data
    public EducationData(String data) {
        parseEduData(data);
    }

    @Override
    public String toString() {
        return noHighSchool +
                ", " + highSchool +
                ", " + someCollege +
                ", " + moreCollege
                ;
    }

    private void parseEduData(String data) {
        String[] vars = data.split(",");
        int lastIndex = vars.length - 1;
        noHighSchool = Double.parseDouble(vars[lastIndex - 3]);
        highSchool = Double.parseDouble(vars[lastIndex - 2]);
        someCollege = Double.parseDouble(vars[lastIndex - 1]);
        moreCollege = Double.parseDouble(vars[lastIndex]);
    }

    public double getNoHighSchool() {
        return noHighSchool;
    }

    public double getHighSchool() {
        return highSchool;
    }

    public double getSomeCollege() {
        return someCollege;
    }

    public double getMoreCollege() {
        return moreCollege;
    }


}
