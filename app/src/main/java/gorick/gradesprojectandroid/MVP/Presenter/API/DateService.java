package gorick.gradesprojectandroid.MVP.Presenter.API;

import gorick.gradesprojectandroid.MVP.Model.DateModel;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by sg-0036936 on 07/03/2017.
 */

public interface DateService {

    @GET("users/{username}")
    Observable<DateModel> getDate(@Path("username") String userName);

}
