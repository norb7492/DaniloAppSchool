package gorick.gradesprojectandroid.Dagger2.Component;

import dagger.Component;
import gorick.gradesprojectandroid.Dagger2.Module.RetrofitModule;
import gorick.gradesprojectandroid.Dagger2.Scope.PerActivity;
import gorick.gradesprojectandroid.MVP.Presenter.Response.GradeResponse;
import gorick.gradesprojectandroid.MVP.View.MainActivity;

/**
 * Created by sg-0036936 on 06/03/2017.
 */

@PerActivity
@Component(modules = {RetrofitModule.class})
public interface GradeComponent {

    void inject(MainActivity mainActivity);
}
