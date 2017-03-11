package gorick.gradesprojectandroid.MVP.Presenter.Response;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import gorick.gradesprojectandroid.Dagger2.Component.GradeComponent;
import gorick.gradesprojectandroid.MVP.Model.GradeModel;
import gorick.gradesprojectandroid.MVP.Presenter.API.GradeService;
import gorick.gradesprojectandroid.MVP.Presenter.API.UserService;
import gorick.gradesprojectandroid.R;
import retrofit2.Retrofit;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by sg-0036936 on 06/03/2017.
 */


public class GradeResponse {

    @Inject
    Retrofit retrofit;

    public void getGradeRx() {

       /* GradeService gradeService = retrofit.create(GradeService.class);
        Observable<GradeModel> gradeObservable = GradeService.getGrade("name whatever");
        gradeObservable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .map(user -> "Matéria: " + user.getMatter() + "\nNota:" + " " + user.getGrade() + "\nFaltas:" + " " + user.getFault())
                .subscribe(userInfo -> Log.d("Output", String.valueOf(userInfo))); */


        Observable<GradeModel> getGrade = (Observable<GradeModel>) retrofit
                .create(GradeService.class)
                .getGrade("usernamewhatever")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .map(user -> "Matéria" + user.getMatter() + "\nNota:" + " " + user.getGrade() + "\nFaltas:" + " " + user.getFault())
                .subscribe(userInfo -> Log.d("Output", String.valueOf(userInfo)));
    }
}