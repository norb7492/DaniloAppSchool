package gorick.gradesprojectandroid.Dagger2.Component;

import android.content.SharedPreferences;

import dagger.Component;
import gorick.gradesprojectandroid.Dagger2.Module.UserLoginModule;
import gorick.gradesprojectandroid.Dagger2.Scope.PerActivity;
import gorick.gradesprojectandroid.MVP.Model.UserModel;

/**
 * Created by sg-0036936 on 07/03/2017.
 */

@PerActivity
@Component(modules = {UserLoginModule.class})
public interface UserLoginComponent {

    void inject(SharedPreferences sharedPreferences);
}