package edu.skku.map.crimenotification.network.api;

import edu.skku.map.crimenotification.network.response.CriminalResponse;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SheetApi {

    @GET("api/v1/d1skgjsjp83q0")
    @NotNull
    Call<List<CriminalResponse>> getSheetCriminals();
}
