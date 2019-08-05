package fr.wildcodeschool.githubtracker;

//Ajouter dans le repertoire WEB-INF le fichier beans.xml ne rien mettre dedans
//payara 5 n'est pas compatible avec java 12
import fr.wildcodeschool.githubtracker.model.Githubers;
import fr.wildcodeschool.githubtracker.service.IServices;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getGithubers", urlPatterns = {"/getGithubers"})
public class GithubersServlet extends HttpServlet {

    @Inject
    private IServices service ;

    //...doGet
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //response.setContentType("application/html;charset=UTF-8");

        List<Githubers> githuberList = service.getGithubers();
        request.setAttribute("githuberList", githuberList);

        request.getRequestDispatcher("/githubers.jsp").forward(request, response);
    }

    //....doPost
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
