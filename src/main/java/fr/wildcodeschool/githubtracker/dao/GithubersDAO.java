package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githubers;

import java.util.List;

/*
* Dao class Githubers
* Contient les methodes(CRUD)
*/

public interface GithubersDAO {

    List<Githubers> findAll();
    void saveGithuber(Githubers githubers);
}
