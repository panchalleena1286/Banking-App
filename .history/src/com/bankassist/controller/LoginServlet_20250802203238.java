package com.bankassist.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "admin123".equals(password)) {
           
            response.sendRedirect("dashboard.jsp");
        } else {
            
            response.sendRedirect("login.jsp?error=1");
        }
    }
}
