package gorick.gradesprojectandroid.MVP.Presenter;

import android.app.Application;

import gorick.gradesprojectandroid.Dagger2.Component.DaggerMainComponent;
import gorick.gradesprojectandroid.Dagger2.Component.DaggerUserLoginComponent;
import gorick.gradesprojectandroid.Dagger2.Component.MainComponent;
import gorick.gradesprojectandroid.Dagger2.Component.UserLoginComponent;
import gorick.gradesprojectandroid.Dagger2.Module.PresenterModule;
import gorick.gradesprojectandroid.Dagger2.Module.ResponseModule;
import gorick.gradesprojectandroid.Dagger2.Module.RetrofitModule;

/**
 * Created by sg-0036936 on 25/03/2017.
 */

public class MyApplication extends Application {

    private static MainComponent mainComponent;
    private static UserLoginComponent userLoginComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initDagger();
    }

    private void initDagger() {
        mainComponent = DaggerMainComponent
                .builder()
                .presenterModule(new PresenterModule())
                .responseModule(new ResponseModule())
                .retrofitModule(new RetrofitModule())
                .build();

        userLoginComponent = DaggerUserLoginComponent
                .builder()
                .build();
    }

    public static MainComponent getMainComponent() {
        return mainComponent;
    }

    public static UserLoginComponent getUserLoginComponent(){
        return userLoginComponent;
    }
}
