package by.yakovtsev.webapp.web;

import java.io.IOException;
import java.io.Writer;

public class ResumeServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    response.setCharacterEncoding("UTF-8");
    response.setContentType("text/html; charset=UTF-8");
        Writer writer = response.getWriter();
        String name = request.getParameter("name");
        writer.write("Test servlet: hello " + name);
        writer.close();
    }
}
