package gorick.gradesprojectandroid.MVP.Presenter.Presenters;

import android.support.v7.widget.RecyclerView;

import java.math.BigDecimal;

import gorick.gradesprojectandroid.MVP.Presenter.Adapters.GradeAdapter;

/**
 * Created by sg-0036936 on 07/03/2017.
 */

public class MainPresenter {

    private BigDecimal[] listGrades;
    private Integer[] listFaults;
    private String[] listClasses;

    private RecyclerView recyclerViewGrade;
    private GradeAdapter adapterGrade;

    public void setListGrades(BigDecimal[] listGrades, Integer[] listFaults, String[] listClasses){

        this.listClasses = listClasses;
        this.listFaults = listFaults;
        this.listGrades = listGrades;

        //adapterGrade = new GradeAdapter(listGrades, listFaults, listClasses);
        //recyclerViewGrade.setAdapter(adapterGrade);
    }

    public BigDecimal[] getListGrades() {
        return listGrades;
    }

    public Integer[] getListFaults() {
        return listFaults;
    }

    public String[] getListClasses() {
        return listClasses;
    }
}
