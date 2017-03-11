package gorick.gradesprojectandroid.MVP.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import gorick.gradesprojectandroid.Dagger2.Component.DaggerGradeComponent;
import gorick.gradesprojectandroid.Dagger2.Component.GradeComponent;
import gorick.gradesprojectandroid.R;

public class MainActivity extends AppCompatActivity {

    @Inject
    GradeComponent gradeComponent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciar o dagger 2
        gradeComponent = DaggerGradeComponent.builder()
                .build();
        gradeComponent.inject(MainActivity.this);//passar o contexto para o componente
    }
}
