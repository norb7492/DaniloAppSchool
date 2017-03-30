package gorick.gradesprojectandroid.MVP.Presenter.Presenters;

import android.support.v7.widget.RecyclerView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import gorick.gradesprojectandroid.MVP.Presenter.Adapters.GradeAdapter;

/**
 * Created by sg-0036936 on 07/03/2017.
 */

public class MainPresenter {

    private RecyclerView recyclerViewGrade;
    private GradeAdapter adapterGrade;
    List<Integer> faults = new ArrayList<Integer>();


    List<String> matters = new ArrayList<String>();

    public void setListGrades(List<DecimalFormat> listGrades){
        //List<DecimalFormat> listGrades = new ArrayList<>();
        //listGrades.add(grade);
        adapterGrade = new GradeAdapter(listGrades, faults, matters);
        recyclerViewGrade.setAdapter(adapterGrade);
    }
}
