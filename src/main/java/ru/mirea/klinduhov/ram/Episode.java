package ru.mirea.klinduhov.ram;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Episode {

    //@JsonProperty(localName = "name", isAttribute = true)
    private String name;

    //@JsonProperty(localName = "characters", isAttribute = true)
    private List<String> characters;

    //@JsonProperty(localName = "url", isAttribute = true)
    private String url;

    public Episode(){}

    public Episode(String name, List<String> characters, String url){
        this.name=name;
        this.characters=characters;
        this.url=url;
    }

    public String getName(){
        return name;
    }

    public List <String> getCharacters(){
        return characters;
    }

    public String getUrl(){
        return url;
    }
}
