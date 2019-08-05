package fr.wildcodeschool.githubtracker;

import fr.wildcodeschool.githubtracker.dao.MemoryGithuberDAO;
import fr.wildcodeschool.githubtracker.model.Githubers;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TrackServlet", urlPatterns = {"/track"})
public class TrackServlet extends HttpServlet {

    @Inject
    private MemoryGithuberDAO dao;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Githubers> githuberList = dao.findAll();
        request.setAttribute("githuberList", githuberList);

        request.getRequestDispatcher("/githubers.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
