package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githubers;

import java.util.ArrayList;
import java.util.List;

public class DumbGithuberDAO implements GithubersDAO {

    @Override
    public List<Githubers> findAll() {

        List<Githubers> githuber = new ArrayList<>();

        githuber.add(new Githubers("Edwin","edwinbeledu@yahoo.fr","beleduedwin","36994551","https://avatars0.githubusercontent.com/u/36994551?v=4"));
        githuber.add(new Githubers("Smelldat","sarah@orange.fr","sara01","45790431","https://avatars2.githubusercontent.com/u/45790431?v=4"));
        githuber.add(new Githubers("Bastien Krettly","patricia@hotmail.com","bastienwcs","29610890","https://avatars1.githubusercontent.com/u/29610890?v=4"));
        githuber.add(new Githubers("Fabien Marsaud","patricia@hotmail.com","fabmars","1499177","https://avatars1.githubusercontent.com/u/1499177?v=4"));
        githuber.add(new Githubers("Eddy LAFOND","EddyAtPessac","EddyAtPessac","34303710","https://avatars1.githubusercontent.com/u/34303710?v=4"));

        return githuber;
    }

    @Override
    public void saveGithuber(Githubers githubers) {
        throw new UnsupportedOperationException();
    }

}
