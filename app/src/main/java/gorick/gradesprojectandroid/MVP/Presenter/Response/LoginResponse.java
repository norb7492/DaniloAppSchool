package gorick.gradesprojectandroid.MVP.Presenter.Response;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

import gorick.gradesprojectandroid.MVP.Model.UserModel;
import gorick.gradesprojectandroid.MVP.Presenter.API.UserService;
import gorick.gradesprojectandroid.MVP.View.PreLoginActivity;
import retrofit2.Retrofit;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by sg-0036936 on 06/03/2017.
 */

public class LoginResponse {

    @Inject
    UserModel userModel;

    @Inject
    Retrofit retrofit;

    public void sendUser() {
        userModel.getRa();
        userModel.getPassword();

        //rxJava
        UserService userService = retrofit.create(UserService.class);
        Observable<userModel> githubUser = userService.setUser(userModel.getRa(), userModel.getPassword(), userModel.getState());
        githubUser.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .map(user -> "Github Username: " + "here i can put the json objects")
                .subscribe(userInfo -> Log.d("Output", userInfo));
    }

    public void receiveUser() {


    }
    public boolean validadeUser() {
        //compare the sendUser with the receiveUser
        return false;
    }

}
