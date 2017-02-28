/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author IVIETTECH EDUCATION
 */

public class GetEmail extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        StringBuffer html = new StringBuffer();
        String email= req.getParameter("email");
        HttpSession session = req.getSession();
        session.setAttribute("email",email);
        //Path dir = Paths.get(path);
        html.append("<!DOCTYPE html> <html> <head>");
        html.append("<title> Parsing a txt file </title>");
        html.append("<meta charset=\"UTF-8\">");
        html.append("<link rel=\"stylesheet\" href=\"css/main.css\"> </head>");
        html.append("<body> <h3>"+email+"</h3>");
        html.append("<a href=\"secondPage\" target=\"_balnk\">Email Session</a>");
        html.append("</body> </html>");
        out.println(html);
       
               
    }
    
    
}
