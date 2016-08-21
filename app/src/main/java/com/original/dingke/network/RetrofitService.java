package com.original.dingke.network;

import com.original.dingke.model.ProgramItem;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

public interface RetrofitService {
    @GET("/data/{startNum}")
    List<ProgramItem> getProgramList(@Path("startNum") int num);
}
