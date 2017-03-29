package gorick.gradesprojectandroid.Dagger2.Module;

import dagger.Module;
import dagger.Provides;
import gorick.gradesprojectandroid.Dagger2.Scope.PerActivity;
import gorick.gradesprojectandroid.MVP.Presenter.Response.GradeResponse;
import gorick.gradesprojectandroid.MVP.Presenter.Response.LoginResponse;
import gorick.gradesprojectandroid.MVP.Presenter.Response.NotificationResponse;

/**
 * Created by sg-0036936 on 25/03/2017.
 */
@Module(includes = {UserLoginModule.class})
public class ResponseModule {

    @Provides
    @PerActivity
    public GradeResponse provideGradeResponse() {
        return new GradeResponse();
    }

    @Provides
    @PerActivity
    public LoginResponse provideLoginResponse() {
        return new LoginResponse();
    }

    @Provides
    @PerActivity
    public NotificationResponse provideNotificationResponse() {
        return new NotificationResponse();
    }

}
