package gorick.gradesprojectandroid.Dagger2.Module;

import dagger.Module;
import dagger.Provides;
import gorick.gradesprojectandroid.MVP.Presenter.API.DateService;
import gorick.gradesprojectandroid.MVP.Presenter.API.GradeService;
import gorick.gradesprojectandroid.MVP.Presenter.API.MatterService;
import gorick.gradesprojectandroid.MVP.Presenter.API.UserService;
import retrofit2.Retrofit;

/**
 * Created by sg-0036936 on 07/03/2017.
 */

@Module(includes = {RetrofitModule.class})
public class DataServicesModule {

    @Provides
    public DateService provideDateService(Retrofit retrofit) {
        return retrofit.create(DateService.class);
    }

    @Provides
    public GradeService provideGradeService(Retrofit retrofit) {
        return retrofit.create(GradeService.class);
    }

    @Provides
    public MatterService provideMatterService(Retrofit retrofit) {
        return retrofit.create(MatterService.class);
    }

    @Provides
    public UserService provideUserService(Retrofit retrofit) {
        return retrofit.create(UserService.class);
    }
}
