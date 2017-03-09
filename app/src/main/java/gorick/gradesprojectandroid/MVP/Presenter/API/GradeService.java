package gorick.gradesprojectandroid.MVP.Presenter.API;

import gorick.gradesprojectandroid.MVP.Model.GradeModel;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by sg-0036936 on 07/03/2017.
 * Notas e faltas API
 */

public interface GradeService {

    @GET("users/{username}")
    Observable<GradeModel> getGrade(@Path("username") String userName);
}
