package gorick.gradesprojectandroid.MVP.Model;

/**
 * Created by sg-0036936 on 06/03/2017.
 */

public class GradeModel {

    private String matter;
    private int fault;
    private double grade;

    public GradeModel(String matter, int fault, double grade) {
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

    public int getFault() {
        return fault;
    }

    public void setFault(int fault) {
        this.fault = fault;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
