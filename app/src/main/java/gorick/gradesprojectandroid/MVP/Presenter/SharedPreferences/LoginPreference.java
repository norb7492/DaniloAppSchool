package gorick.gradesprojectandroid.MVP.Presenter.SharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;

import gorick.gradesprojectandroid.MVP.Model.UserModel;

/**
 * Created by sg-0036936 on 13/03/2017.
 */

public class LoginPreference {

    public static void addLogin(String ra, String password, Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("text", context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("ra", ra);
        editor.putString("password", password);
        editor.apply();
    }

    public static void cleanLogin(Context context) {
        SharedPreferences settings = context.getSharedPreferences("text", Context.MODE_PRIVATE);
        settings.edit().clear().apply();
    }

    public static UserModel getLogin(Context context) {
        UserModel userModel = new UserModel();
        SharedPreferences sharedPreferences = context.getSharedPreferences("text", context.MODE_PRIVATE);
        userModel.setRa(sharedPreferences.getString("ra", ""));
        userModel.setPassword(sharedPreferences.getString("password", ""));
        return userModel;
    }
}