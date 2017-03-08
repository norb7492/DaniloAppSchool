package gorick.gradesprojectandroid.MVP.Model;

/**
 * Created by sg-0036936 on 06/03/2017.
 */

public class GradesModel {

    private String matter;
    private String fault;
    private double grade;

    public GradesModel(String matter, String fault, double grade) {
        this.matter = matter;
        this.fault = fault;
        this.grade = grade;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public String getFault() {
        return fault;
    }

    public void setFault(String fault) {
        this.fault = fault;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
