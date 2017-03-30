package gorick.gradesprojectandroid.Dagger2.Component;

import dagger.Component;
import gorick.gradesprojectandroid.Dagger2.Module.PresenterModule;
import gorick.gradesprojectandroid.Dagger2.Module.ResponseModule;
import gorick.gradesprojectandroid.Dagger2.Module.RetrofitModule;
import gorick.gradesprojectandroid.Dagger2.Module.UserLoginModule;
import gorick.gradesprojectandroid.Dagger2.Scope.PerActivity;
import gorick.gradesprojectandroid.MVP.Presenter.Response.GradeResponse;
import gorick.gradesprojectandroid.MVP.View.MainActivity;

/**
 * Created by sg-0036936 on 25/03/2017.
 */
@PerActivity
@Component(modules = {PresenterModule.class, UserLoginModule.class, ResponseModule.class, RetrofitModule.class})
public interface MainComponent {

    void injectIntoMainActivity(MainActivity mainActivity);

    GradeResponse injectIntoGradeResponse(GradeResponse gradeResponse);

}