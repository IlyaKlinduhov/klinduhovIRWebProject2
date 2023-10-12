package ru.mirea.klinduhov.ram;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class RamClient {

    public static void main(String [] args) throws IOException {

        Retrofit client=new Retrofit
                .Builder()
                .baseUrl("https://rickandmortyapi.com/api/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        RamService service=client.create(RamService.class);

        Response<Result> response= service.getEpisodes().execute();

        Result result= response.body();

        Episode ep=result.getEpisodes().stream().max(Comparator.comparingInt(episode->episode.getCharacters().size())).orElse(null);

        System.out.println(ep.getName());
        //List<Episode> episodes=response.body().getEpisodes();




    }

}
