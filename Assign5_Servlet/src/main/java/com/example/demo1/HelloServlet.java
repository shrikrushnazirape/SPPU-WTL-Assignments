package com.example.demo1;

import java.awt.print.Book;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "read", value = "/read")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World22!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();




        List <Books> list = JdbcConn.getAllEmployees();



        out.println("<h1> Maching Books : </h1>" + list.size());
        out.print("<table border='1' width='100%'>");
        out.print("<tr><th>BookID</th><th>Book Title</th><th>Author</th><th>Price</th><th>Quantity</th>></tr>");
        for(Books e:list){
            out.print("<tr><td>"+e.getId()+"</td><td>"+e.getTitle()+"</td><td>"+e.getAuthor()+"</td><td>"+e.getPrice()+"</td><td>"+e.getQuantity()+"</td></tr>");
        }
        out.print("</table>");



        out.println("<h2>Search Books by Author");

        out.print("<form action='filter' method='get'>");
        out.print("<table>");
        out.print("<tr><td>Author Name:</td><td><input type='text' name='author'/></td></tr>");
        out.print("<tr><td colspan='2'><input type='submit' value='Search'/></td></tr>");
        out.println("</table>");

        out.close();
    }

    public void destroy() {
    }
}