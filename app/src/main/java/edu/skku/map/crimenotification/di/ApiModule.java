package edu.skku.map.crimenotification.di;

import edu.skku.map.crimenotification.network.api.KakaoApi;
import edu.skku.map.crimenotification.network.api.SheetApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
@InstallIn(SingletonComponent.class)
public class ApiModule {

    @Singleton
    @Provides
    public static KakaoApi provideKakaoService() {
        return new Retrofit.Builder()
                .baseUrl("https://dapi.kakao.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(KakaoApi.class);
    }

    @Singleton
    @Provides
    public static SheetApi provideSheetService() {
        return new Retrofit.Builder()
                .baseUrl("https://sheetdb.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(SheetApi.class);
    }
}
