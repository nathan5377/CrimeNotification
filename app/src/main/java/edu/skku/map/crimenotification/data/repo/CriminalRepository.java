package edu.skku.map.crimenotification.data.repo;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import edu.skku.map.crimenotification.room.entity.CriminalEntity;
import kotlin.jvm.functions.Function1;

public interface CriminalRepository {

    void getRemoteCriminals(
            @NotNull Function1 onSuccess,
            @NotNull Function1 onFailure
    );

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
