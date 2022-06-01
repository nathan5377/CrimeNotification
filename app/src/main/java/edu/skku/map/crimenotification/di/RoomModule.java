package edu.skku.map.crimenotification.di;

import android.content.Context;

import androidx.room.Room;

import edu.skku.map.crimenotification.room.dao.CriminalDao;
import edu.skku.map.crimenotification.room.database.CriminalDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class RoomModule {


    @Provides
    public CriminalDao provideCriminalDao(CriminalDatabase criminalDatabase) {
        return criminalDatabase.criminalDao();
    }

    @Singleton
    @Provides
    public CriminalDatabase provideCriminal(@ApplicationContext Context appContext) {
        return Room.databaseBuilder(
                        appContext,
                        CriminalDatabase.class,
                        "criminal_table"
                ).fallbackToDestructiveMigration()
                .build();
    }

}
