package gorick.gradesprojectandroid.MVP.Presenter.API;

import gorick.gradesprojectandroid.MVP.Model.UserModel;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by sg-0036936 on 07/03/2017.
 */

public interface UserService {

    @FormUrlEncoded
    @POST("users")
    Observable<UserModel> setUser(@Field("ra") String ra, @Field("password") String password, @Field("state") String state);

    @GET("users/{id}")
    Observable<UserModel> getUser(@Path("id") String userName);

}