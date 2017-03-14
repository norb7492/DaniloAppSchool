package gorick.gradesprojectandroid;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.RenamingDelegatingContext;
import android.util.Log;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import gorick.gradesprojectandroid.MVP.Model.UserModel;
import gorick.gradesprojectandroid.MVP.Presenter.SharedPreferences.LoginPreference;

import static com.bumptech.glide.gifdecoder.GifHeaderParser.TAG;
import static org.hamcrest.core.Is.is;

/**
 * Created by sg-0036936 on 13/03/2017.
 */

@RunWith(AndroidJUnit4.class)
public class LoginPreferenceTest {

    Context mMockContext;
    LoginPreference loginPreference;
    String ra = "ra666";
    String password = "passwordwhatever";

    @Before
    public void setUp() {
        mMockContext = new RenamingDelegatingContext(InstrumentationRegistry.getTargetContext(), "test_");
    }

    @Test
    public void addNewLogin() {
        loginPreference.addLogin("54785", "password", mMockContext);
    }

    @Test
    public void cleanNewLogin(){
        loginPreference.cleanLogin(mMockContext);
        Assert.assertNotNull(Log.d(TAG, "getNewLogin: " + (loginPreference.getLogin(mMockContext).toString())));
    }

    @Test
    public void getNewLogin(){
        Assert.assertNotNull(Log.d(TAG, "getNewLogin: " + (loginPreference.getLogin(mMockContext).toString())));
    }

}
