package gorick.gradesprojectandroid.MVP.Presenter.API;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by sg-0036936 on 07/03/2017.
 */

public interface UserService {

    @GET("users/{username}")
    Observable<UserService> getUser(@Path("username") String userName);
}
