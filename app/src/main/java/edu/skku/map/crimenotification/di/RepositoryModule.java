package edu.skku.map.crimenotification.di;


import edu.skku.map.crimenotification.data.repo.CriminalRepository;
import edu.skku.map.crimenotification.data.repo.CriminalRepositoryImpl;
import edu.skku.map.crimenotification.data.repo.FirebaseRepository;
import edu.skku.map.crimenotification.data.repo.FirebaseRepositoryImpl;
import edu.skku.map.crimenotification.data.repo.KakaoRepository;
import edu.skku.map.crimenotification.data.repo.KakaoRepositoryImpl;
import edu.skku.map.crimenotification.data.source.local.CrimianlLocalDataSource;
import edu.skku.map.crimenotification.data.source.local.CrimianlLocalDataSourceImpl;
import edu.skku.map.crimenotification.data.source.remote.CriminalRemoteDataSource;
import edu.skku.map.crimenotification.data.source.remote.CriminalRemoteDataSourceImpl;
import edu.skku.map.crimenotification.data.source.remote.FirebaseRemoteDataSource;
import edu.skku.map.crimenotification.data.source.remote.FirebaseRemoteDataSourceImpl;
import edu.skku.map.crimenotification.data.source.remote.KakaoRemoteDataSource;
import edu.skku.map.crimenotification.data.source.remote.KakaoRemoteDataSourceImpl;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public abstract class RepositoryModule {

    @Singleton
    @Binds
    public abstract CriminalRepository bindCriminalRepository(
            CriminalRepositoryImpl criminalRepositoryImpl
    );

    @Singleton
    @Binds
    public abstract CriminalRemoteDataSource bindCriminalRemoteDataSource(
            CriminalRemoteDataSourceImpl criminalRemoteDataSourceImpl
    );

    @Singleton
    @Binds
    public abstract CrimianlLocalDataSource bindCrimianlLocalDataSource(
            CrimianlLocalDataSourceImpl crimianlLocalDataSourceImpl
    );

    @Singleton
    @Binds
    public abstract KakaoRepository bindKakaoRepository(
            KakaoRepositoryImpl kakaoRepositoryImpl
    );

    @Singleton
    @Binds
    public abstract KakaoRemoteDataSource bindKakaoRemoteDataSource(
            KakaoRemoteDataSourceImpl kakaoRemoteDataSourceImpl
    );

    @Singleton
    @Binds
    public abstract FirebaseRepository bindFirebaseRepository(
            FirebaseRepositoryImpl firebaseRepositoryImpl
    );

    @Singleton
    @Binds
    public abstract FirebaseRemoteDataSource bindFirebaseRemoteDataSource(
            FirebaseRemoteDataSourceImpl firebaseRemoteDataSourceImpl
    );


}
