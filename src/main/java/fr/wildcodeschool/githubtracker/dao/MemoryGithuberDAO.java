package fr.wildcodeschool.githubtracker.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.wildcodeschool.githubtracker.model.Githubers;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class MemoryGithuberDAO implements GithubersDAO {

    private Map<String, Githubers> githubers = new HashMap<>();

    @Inject
    private ObjectMapper om;

    @PostConstruct
    private void postConstruct() {
        try {
            saveGithuber(parseGithuber("fabmars"));
            saveGithuber(parseGithuber("eddyAtPessac"));
            saveGithuber(parseGithuber("beleduedwin"));
            saveGithuber(parseGithuber("smelldat"));
            saveGithuber(parseGithuber("bastienwcs"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //implementation de deux methodes
    @Override
    public List<Githubers> findAll()
    {
        return new ArrayList<>(githubers.values());
    }

    @Override
    public void saveGithuber(Githubers githuber) {

        githubers.put(githuber.getLogin(), githuber);
    }

    //
    public Githubers parseGithuber(String login) throws IOException {
        String url = "https://api.github.com/users/" + login;
        return om.readValue(new URL(url), Githubers.class);
    }
}
