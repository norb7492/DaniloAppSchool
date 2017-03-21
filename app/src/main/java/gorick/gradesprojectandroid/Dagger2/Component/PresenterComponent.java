package gorick.gradesprojectandroid.Dagger2.Component;

import javax.inject.Singleton;

import dagger.Component;
import gorick.gradesprojectandroid.Dagger2.Module.PresenterModule;
import gorick.gradesprojectandroid.Dagger2.Module.UserLoginModule;
import gorick.gradesprojectandroid.Dagger2.Scope.PerActivity;
import gorick.gradesprojectandroid.MVP.Presenter.Presenters.PreLoginPresenter;
import gorick.gradesprojectandroid.MVP.View.MainActivity;
import gorick.gradesprojectandroid.MVP.View.NotificationActivity;
import gorick.gradesprojectandroid.MVP.View.PreLoginActivity;

/**
 * Created by sg-0036936 on 15/03/2017.
 */
@PerActivity
@Component(modules = {PresenterModule.class, UserLoginModule.class})
public interface PresenterComponent {

    //void injectMainPresenter(MainActivity mainActivity);
    void injectPreLoginPresenterintoPreLoginActivity(PreLoginActivity preLoginActivity);
    //void injectNotificationPresenter(NotificationActivity notificationActivity);



}
