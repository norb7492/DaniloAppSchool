package gorick.gradesprojectandroid.MVP.Presenter.Response;



import android.util.Log;

import javax.inject.Inject;

import gorick.gradesprojectandroid.MVP.Model.GradeList;
import gorick.gradesprojectandroid.MVP.Presenter.API.GradeService;
import gorick.gradesprojectandroid.MVP.Presenter.MyApplication;
import gorick.gradesprojectandroid.MVP.Presenter.Presenters.MainPresenter;
import retrofit2.Retrofit;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


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

        Observable<GradeList> getGradesObservable = retrofit
                .create(GradeService.class)
                .getGrade()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());


                getGradesObservable.subscribe(new Observer<GradeList>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {



                    }

                    @Override
                    public void onNext(GradeList gradeList) {




                    }
                });

    }
}