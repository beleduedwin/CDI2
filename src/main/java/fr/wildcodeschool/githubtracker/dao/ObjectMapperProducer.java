package fr.wildcodeschool.githubtracker.dao;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

//ce dure le temps de l'appli
@ApplicationScoped
public class ObjectMapperProducer {

    //pour fabriquer moi meme l'objet de tel manière que quand on fait new, qu'on peu injecter à notre sauce
    //le producer peuvent avoir un qualifier
    //en spring boot, @beans et @Produces sont pareil
    @Produces
    public ObjectMapper produceObjectMapper() {

        return new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
}
