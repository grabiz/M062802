/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author IVIETTECH EDUCATION
 */
public class secondPage extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        StringBuilder html = new StringBuilder();
        HttpSession session = req.getSession(false);
        String email = (String)session.getAttribute("email");
        String sessionID =(String) session.getId();
        html.append("<!DOCTYPE html> <html> <head>");
        html.append("<title> Parsing a txt file </title>");
        html.append("<meta charset=\"UTF-8\">");
        html.append("</head>");
        html.append("<body style=\"width:500px\"> <h1>Second Page</h1>");
        html.append("<label>Email:</label>").append(email).append("<p></p>");
        html.append("<label>SessionID:</label>").append(sessionID);
        html.append("</body></html>");
        out.println(html);
    }
    
}
