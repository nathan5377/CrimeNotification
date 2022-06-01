package edu.skku.map.crimenotification.data.source.local;

import edu.skku.map.crimenotification.room.entity.CriminalEntity;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import kotlin.jvm.functions.Function1;

public interface CrimianlLocalDataSource {


    void getLocalCriminals(
            @NotNull Function1 onSuccess,
            @NotNull Function1 onFailure
    );

    void registerCriminalEntity(
            ArrayList<CriminalEntity> entityList,
            @NotNull Function1 result
    );

    void getCriminalEntity(
            @NotNull String name,
            @NotNull Function1 onSuccess,
            @NotNull Function1 onFailure
    );

}
