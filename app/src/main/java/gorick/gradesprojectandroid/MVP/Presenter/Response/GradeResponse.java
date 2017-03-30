package gorick.gradesprojectandroid.MVP.Presenter.Response;

import android.util.Log;

import java.text.DecimalFormat;

import javax.inject.Inject;

import gorick.gradesprojectandroid.MVP.Presenter.API.GradeService;
import gorick.gradesprojectandroid.MVP.Presenter.MyApplication;
import gorick.gradesprojectandroid.MVP.Presenter.Presenters.MainPresenter;
import retrofit2.Retrofit;
import rx.Observer;
import rx.Subscription;
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
    MainPresenter mainPresenter;

    public void getGradeRx() {

        MyApplication.getMainComponent().injectIntoGradeResponse(this);// informando ao dagger sobre o uso de um component e a necessidade de injetar dependência

        Subscription getGrade = retrofit
                .create(GradeService.class)
                .getGrade()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .map(model -> {
                    // transform model
                    DecimalFormat grades = model.getGrades();
                    return grades;
                    //return new Integer(grades.size());
                })
                .subscribe(new Observer<DecimalFormat>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i(TAG, "saporra vai me matar ainda");
                    }

                    @Override
                    public void onNext(DecimalFormat grades) {
                        Log.i(TAG, "caralhoooooo " + grades);
                        //mainPresenter.setListGrades(grades);
                    }
                });
    }
}