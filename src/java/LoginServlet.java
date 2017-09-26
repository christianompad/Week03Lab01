/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 718205
 */
public class LoginServlet extends HttpServlet {

   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            
        String loggedOut=request.getParameter("loggedOut");
        
        
        if(loggedOut!=null){
            request.setAttribute("message","Logged Out.");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

        }else{
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String message="";
        User u= new User(username,password);
        UserService us= new UserService();
        
        
        if(us.login(u.name,u.password)==false){
            request.setAttribute("message","Invalid username or password.");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
            request.setAttribute("firstname",username);
            getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request,response);
        
    }

}
