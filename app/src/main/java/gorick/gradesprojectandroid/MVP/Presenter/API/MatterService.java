package gorick.gradesprojectandroid.MVP.Presenter.API;

import gorick.gradesprojectandroid.MVP.Model.GradeModel;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by sg-0036936 on 07/03/2017.
 */

public interface MatterService {

    @GET("users/{username}")
    Observable<GradeModel> getMatter(@Path("username") String userName);

}
