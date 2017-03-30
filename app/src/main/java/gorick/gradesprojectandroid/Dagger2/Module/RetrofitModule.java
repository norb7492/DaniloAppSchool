package gorick.gradesprojectandroid.Dagger2.Module;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.Module;
import dagger.Provides;
import gorick.gradesprojectandroid.Dagger2.Scope.PerActivity;
import okhttp3.OkHttpClient;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.RxJavaCallAdapterFactory;

import static gorick.gradesprojectandroid.MVP.Presenter.API.UrlAPI.BASE_URL;

/**
 * Created by sg-0036936 on 06/03/2017.
 */

@Module
public class RetrofitModule {


    @Provides
    @PerActivity
    Gson provideGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        return gsonBuilder.create();
    }

    @Provides
    @PerActivity
    public OkHttpClient provideHttpClient() {
        return new OkHttpClient().newBuilder().build();
    }

    @Provides
    @PerActivity
    public Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                //converts Retrofit response into Observable
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return retrofit;
    }

}
