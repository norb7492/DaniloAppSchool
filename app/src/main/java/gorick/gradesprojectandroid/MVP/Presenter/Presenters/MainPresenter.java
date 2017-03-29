package gorick.gradesprojectandroid.MVP.Presenter.Presenters;

import android.support.v7.widget.RecyclerView;

import java.util.List;

import gorick.gradesprojectandroid.MVP.Model.GradeModel;
import gorick.gradesprojectandroid.MVP.Presenter.Adapters.GradeAdapter;

/**
 * Created by sg-0036936 on 07/03/2017.
 */

public class MainPresenter {

    private RecyclerView recyclerViewGrade;
    private RecyclerView.Adapter adapterGrade;
    List<GradeModel> grades;
    List<GradeModel> faults;
    List<GradeModel> matters;



    public void getListGrades(){



        adapterGrade = new GradeAdapter(grades, faults, matters);
        recyclerViewGrade.setAdapter(adapterGrade);
    }
}
