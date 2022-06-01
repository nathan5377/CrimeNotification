package edu.skku.map.crimenotification.data.repo;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import javax.inject.Inject;

import edu.skku.map.crimenotification.data.source.local.CrimianlLocalDataSource;
import edu.skku.map.crimenotification.data.source.remote.CriminalRemoteDataSource;
import edu.skku.map.crimenotification.room.entity.CriminalEntity;
import kotlin.jvm.functions.Function1;

public class CriminalRepositoryImpl implements CriminalRepository {

    private final CriminalRemoteDataSource criminalRemoteDataSource;

    private final CrimianlLocalDataSource crimianlLocalDataSource;

    @Override
    public void getRemoteCriminals(@NonNull Function1 onSuccess, @NonNull Function1 onFailure) {
        criminalRemoteDataSource.getRemoteCriminals(onSuccess, onFailure);
    }

    @Override
    public void getLocalCriminals(@NonNull Function1 onSuccess, @NonNull Function1 onFailure) {
        crimianlLocalDataSource.getLocalCriminals(onSuccess, onFailure);
    }


    @Override
    public void registerCriminalEntity(ArrayList<CriminalEntity> entityList, @NonNull Function1 result) {
        crimianlLocalDataSource.registerCriminalEntity(entityList, result);
    }

    @Override
    public void getCriminalEntity(@NonNull String name, @NonNull Function1 onSuccess, @NonNull Function1 onFailure) {
        crimianlLocalDataSource.getCriminalEntity(name, onSuccess, onFailure);
    }

    @Inject
    CriminalRepositoryImpl(
            CriminalRemoteDataSource criminalRemoteDataSource,
            CrimianlLocalDataSource crimianlLocalDataSource
    ) {
        this.criminalRemoteDataSource = criminalRemoteDataSource;
        this.crimianlLocalDataSource = crimianlLocalDataSource;
    }
}
