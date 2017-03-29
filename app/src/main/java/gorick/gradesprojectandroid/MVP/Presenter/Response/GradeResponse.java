package gorick.gradesprojectandroid.MVP.Presenter.Response;

import android.util.Log;

import java.text.DecimalFormat;
import java.util.List;

import javax.inject.Inject;

import gorick.gradesprojectandroid.MVP.Model.GradeModel;
import gorick.gradesprojectandroid.MVP.Model.UserModel;
import gorick.gradesprojectandroid.MVP.Presenter.API.GradeService;
import retrofit2.Retrofit;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

import static android.content.ContentValues.TAG;

/**
 * Created by sg-0036936 on 06/03/2017.
 */


public class GradeResponse {

    @Inject
    Retrofit retrofit;

    @Inject
    GradeModel gradeModel;

    public void getGradeRx() {

       /* GradeService gradeService = retrofit.create(GradeService.class);
        Observable<GradeModel> gradeObservable = GradeService.getGrade("name whatever");
        gradeObservable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .map(user -> "Matéria: " + user.getMatter() + "\nNota:" + " " + user.getGrade() + "\nFaltas:" + " " + user.getFault())
                .subscribe(userInfo -> Log.d("Output", String.valueOf(userInfo))); */


        Observable<GradeModel> getGrade = (Observable<GradeModel>) retrofit
                .create(GradeService.class)
                .getGrade()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .map(model -> {
                    // transform model
                    List<DecimalFormat> grades = model.getGrades();
                    return new Integer(grades.size());
                })
                .subscribe(new Observer<DecimalFormat>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i(TAG, "onError method of observer");
                    }

                    @Override
                    public void onNext(DecimalFormat grades) {
                        gradeModel.setGrades(grades);
                    }

                });

    }
}