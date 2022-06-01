package edu.skku.map.crimenotification.data.source.remote;

import kotlin.jvm.functions.Function1;

public interface KakaoRemoteDataSource {

    void getSearchList(String location, Function1 callback);
}
