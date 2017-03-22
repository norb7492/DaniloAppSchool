package gorick.gradesprojectandroid.Dagger2.Component;

import dagger.Component;
import gorick.gradesprojectandroid.Dagger2.Module.PresenterModule;
import gorick.gradesprojectandroid.Dagger2.Module.RetrofitModule;
import gorick.gradesprojectandroid.Dagger2.Module.UserLoginModule;
import gorick.gradesprojectandroid.Dagger2.Scope.PerActivity;
import gorick.gradesprojectandroid.MVP.Presenter.Presenters.PreLoginPresenter;
import gorick.gradesprojectandroid.MVP.Presenter.Response.LoginResponse;

/**
 * Created by sg-0036936 on 07/03/2017.
 */

@PerActivity
@Component(modules = {PresenterModule.class, UserLoginModule.class, RetrofitModule.class})
public interface UserLoginComponent {

    void injectPreLoginPresenterIntoPreLoginActivity(PreLoginPresenter preLoginPresenter);
    PreLoginPresenter providePreLoginPresenter();
}