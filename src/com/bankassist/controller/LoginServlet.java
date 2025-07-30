package com.bankassist.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Hardcoded login check (later connect with DB)
        if ("admin".equals(username) && "admin123".equals(password)) {
            // Success: redirect to dashboard
            response.sendRedirect("dashboard.jsp");
        } else {
            // Fail: back to login with error
            response.sendRedirect("login.jsp?error=1");
        }
    }
}
