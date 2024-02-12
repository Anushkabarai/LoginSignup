package com.registration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username  = request.getParameter("name");
        String useremail = request.getParameter("email");
        String userpwd = request.getParameter("pass");
        String usermobile = request.getParameter("contact");
        RequestDispatcher dispatcher  = null;
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con  = DriverManager.getConnection("jdbc:mysql://localhost:6000/project1?useSSL=false","root","root");
            PreparedStatement pst = con.prepareStatement("insert into hello(username,useremail,userpwd,usermobile) values(?,?,?,?)");
            pst.setString(1,username);
            pst.setString(2,useremail);
            pst.setString(3,userpwd);
            pst.setString(4,usermobile);

            int rowCount = pst.executeUpdate();
            dispatcher = request.getRequestDispatcher("registration.jsp");

            if(rowCount>0) {
                request.setAttribute("status", "success");
            }
            else {
                request.setAttribute("status","failed");
            }
            dispatcher.forward(request, response);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
