package gorick.gradesprojectandroid.Dagger2.Module;

import dagger.Module;
import dagger.Provides;
import gorick.gradesprojectandroid.Dagger2.Scope.PerActivity;
import gorick.gradesprojectandroid.MVP.Presenter.Presenters.MainPresenter;
import gorick.gradesprojectandroid.MVP.Presenter.Presenters.NotificationPresenter;
import gorick.gradesprojectandroid.MVP.Presenter.Presenters.PreLoginPresenter;

/**
 * Created by sg-0036936 on 15/03/2017.
 */

@Module(includes = {UserLoginModule.class})
public class PresenterModule {

    @Provides
    @PerActivity
    public MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }

    @Provides
    @PerActivity
    public PreLoginPresenter providePreLoginPresenter() {
        return new PreLoginPresenter();
    }

    @Provides
    @PerActivity
    public NotificationPresenter provideNotificationPresenter() {
        return new NotificationPresenter();
    }
}
