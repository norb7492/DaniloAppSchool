package gorick.gradesprojectandroid.Dagger2.Component;

import dagger.Component;
import gorick.gradesprojectandroid.Dagger2.Module.PresenterModule;
import gorick.gradesprojectandroid.Dagger2.Module.ResponseModule;
import gorick.gradesprojectandroid.Dagger2.Module.RetrofitModule;
import gorick.gradesprojectandroid.Dagger2.Module.UserLoginModule;
import gorick.gradesprojectandroid.Dagger2.Scope.PerActivity;
import gorick.gradesprojectandroid.MVP.View.PreLoginActivity;

/**
 * Created by sg-0036936 on 07/03/2017.
 */

@PerActivity
@Component(modules = {PresenterModule.class, UserLoginModule.class, RetrofitModule.class, ResponseModule.class})
public interface UserLoginComponent {

    void injectIntoPreLoginActivity(PreLoginActivity preLoginActivity);

}