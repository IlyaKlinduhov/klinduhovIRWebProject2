package ru.mirea.klinduhov.ram;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RamService {
    @GET("episode")
    Call<Result> getEpisodes();
}
