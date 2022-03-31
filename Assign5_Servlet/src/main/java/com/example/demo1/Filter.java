package com.example.demo1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "filter", value = "/filter")
public class Filter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String author=request.getParameter("author");
        List<Books> list = JdbcConn.getBookbyAuthor(author);
        out.println("<h1><a href='read'>Back to Home</a></h1>");
        out.println("<h2>Search Books by Author</h2>");
        out.println("<h1>Books List </h1> : Maching Books : " + list.size());
        out.print("<table border='1' width='100%'>");
        out.print("<tr><th>BookID</th><th>Book Title</th><th>Author</th><th>Price</th><th>Quantity</th>></tr>");
        for(Books e:list){
            out.print("<tr><td>"+e.getId()+"</td><td>"+e.getTitle()+"</td><td>"+e.getAuthor()+"</td><td>"+e.getPrice()+"</td><td>"+e.getQuantity()+"</td></tr>");
        }
        out.print("</table>");

        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
