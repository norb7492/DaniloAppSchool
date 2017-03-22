package gorick.gradesprojectandroid.MVP.Presenter.Presenters;


import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

import gorick.gradesprojectandroid.MVP.Model.UserModel;
import gorick.gradesprojectandroid.MVP.View.PreLoginActivity;
import rx.Observer;

import static com.bumptech.glide.gifdecoder.GifHeaderParser.TAG;

/**
 * Created by sg-0036936 on 07/03/2017.
 */

public class PreLoginPresenter {

    @Inject
    UserModel userModel;

    Boolean response;

    public String onStateSelected(String state) {
            userModel.setState(state);
        Log.i(TAG, "onStateSelected: " + userModel.getState());
            return userModel.getState();
    }

    public boolean login(String ra, String pass){
        userModel.setRa(ra);
        userModel.setPassword(pass);
        Log.i(TAG, "onStateSelected: " + userModel.getRa() + " " + userModel.getPassword());

        Observer<String> loginObserver = new Observer<String>() {

            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                response = false;
            }

            @Override
            public void onNext(String s) {
                response = true;
            }

        };

        return response;
    }
}
