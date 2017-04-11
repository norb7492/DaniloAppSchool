package gorick.gradesprojectandroid.MVP.Presenter.Response;

import android.util.Log;

import java.math.BigDecimal;
import java.util.Arrays;

import javax.inject.Inject;

import gorick.gradesprojectandroid.MVP.Model.GradeModel;
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

                    return model;

                })
                .subscribe(new Observer<GradeModel>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i(TAG, "saporra vai me matar ainda");
                    }

                    @Override
                    public void onNext(GradeModel grades) {

                        BigDecimal[] gradesList = new BigDecimal[grades.getReportLists().length];
                        Integer[] faultsList = new Integer[grades.getReportLists().length];
                        String[] classesList = new String[grades.getReportLists().length];

                        for (int i = 0; i < grades.getReportLists().length; i++) {
                            gradesList[i] = grades.getReportLists()[i].getGradesList();
                            faultsList[i] = grades.getReportLists()[i].getFaultList();
                            classesList[i] = grades.getReportLists()[i].getClassList();
                        }
                        Log.i(TAG, "caralhoooooo " + Arrays.asList(classesList) + Arrays.asList(gradesList) + Arrays.asList(faultsList));
                        mainPresenter.setListGrades(gradesList, faultsList, classesList);
                    }
                });
    }
}