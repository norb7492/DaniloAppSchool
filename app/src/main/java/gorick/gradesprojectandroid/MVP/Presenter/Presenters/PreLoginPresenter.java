package gorick.gradesprojectandroid.MVP.Presenter.Presenters;


import android.util.Log;

import javax.inject.Inject;

import gorick.gradesprojectandroid.MVP.Model.UserModel;

import static com.bumptech.glide.gifdecoder.GifHeaderParser.TAG;

/**
 * Created by sg-0036936 on 07/03/2017.
 */

public class PreLoginPresenter {

    @Inject
    UserModel userModel;

    public String onStateSelected(String state) {
            userModel.setState(state);
        Log.i(TAG, "onStateSelected: " + userModel.getState());
            return userModel.getState();
    }

    public boolean login(String ra, String pass){
        return true;
    }
}
