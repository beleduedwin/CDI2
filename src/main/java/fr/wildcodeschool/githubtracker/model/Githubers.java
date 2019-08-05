package fr.wildcodeschool.githubtracker.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Githubers {

    //..... Propiété des Githubers
    private String name;
    private String email;
    private String login;
    private String id;
    private String avatarUrl;

    //.... Constructeur
    @JsonCreator
    public Githubers(@JsonProperty("name") String name, @JsonProperty("email") String email, @JsonProperty("login") String login, @JsonProperty("id") String id, @JsonProperty("avatar_url") String avatarUrl) {
        this.name = name;
        this.email = email;
        this.login = login;
        this.id = id;
        this.avatarUrl = avatarUrl;
    }

    //......Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getId() {
        return id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

}

