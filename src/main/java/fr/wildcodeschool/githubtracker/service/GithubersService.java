package fr.wildcodeschool.githubtracker.service;

import fr.wildcodeschool.githubtracker.dao.DumbGithuberDAO;
import fr.wildcodeschool.githubtracker.dao.GithubersDAO;
import fr.wildcodeschool.githubtracker.dao.MemoryGithuberDAO;
import fr.wildcodeschool.githubtracker.model.Githubers;

import javax.inject.Inject;
import java.util.List;

public class GithubersService implements IServices{

    //deux maniètre de faire
    //@Inject
    private GithubersDAO dao;

    @Inject
    public GithubersService(MemoryGithuberDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Githubers> getGithubers()
    {
        return dao.findAll();
    }
}