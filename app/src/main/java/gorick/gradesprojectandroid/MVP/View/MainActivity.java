package gorick.gradesprojectandroid.MVP.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import javax.inject.Inject;

import gorick.gradesprojectandroid.MVP.Presenter.MyApplication;
import gorick.gradesprojectandroid.MVP.Presenter.Presenters.MainPresenter;
import gorick.gradesprojectandroid.MVP.Presenter.Response.GradeResponse;
import gorick.gradesprojectandroid.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewGrade;
    private RecyclerView.LayoutManager layoutManager;


    @Inject
    GradeResponse gradeResponse;

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewGrade = (RecyclerView) findViewById(R.id.notas);
        layoutManager = new LinearLayoutManager(this);
        recyclerViewGrade.setLayoutManager(layoutManager);
        recyclerViewGrade.setHasFixedSize(true);

        MyApplication.getMainComponent().injectIntoMainActivity(this);// informando ao dagger sobre o uso de um component e a necessidade de injetar dependência


    }
}
