package gorick.gradesprojectandroid.Dagger2.Module;

import dagger.Module;
import dagger.Provides;
import gorick.gradesprojectandroid.Dagger2.Scope.PerActivity;
import gorick.gradesprojectandroid.MVP.Model.UserModel;

/**
 * Created by sg-0036936 on 14/03/2017.
 */

@Module
public class UserLoginModule {

    @Provides
    @PerActivity
    public UserModel getUser(){
        return new UserModel();
    }
}
