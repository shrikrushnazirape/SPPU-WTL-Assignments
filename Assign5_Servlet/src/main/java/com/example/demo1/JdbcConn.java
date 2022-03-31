package com.example.demo1;

import com.mysql.jdbc.Driver;
import java.util.*;
import java.sql.*;
import java.util.Scanner;
public class JdbcConn {
    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wtllab","root","admin");
        }catch(Exception e){System.out.println(e);}
        return con;
    }


    public static List<Books> getAllEmployees(){
        List<Books> list=new ArrayList<Books>();

        try{
            Connection con=JdbcConn.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from ebookshop");
            ResultSet rs=ps.executeQuery();

            while(rs.next()){
//                System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t"+rs.getString(3));
                Books e=new Books();
                e.setId(rs.getString(1));
                e.setTitle(rs.getString(2));
                e.setAuthor(rs.getString(3));
                e.setPrice(rs.getInt(4));
                e.setQuantity(rs.getInt(5));
                list.add(e);
            }
            con.close();
        }catch(Exception e){e.printStackTrace();}

        return list;
    }
    public static List<Books> getBookbyAuthor(String match){
        List<Books> list=new ArrayList<Books>();

        try{
            Connection con=JdbcConn.getConnection();
            String query = "select * from ebookshop where book_author like '%"+ match +"%'";
            System.out.println("This is Query"+query);
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t"+rs.getString(3));
                Books e=new Books();
                e.setId(rs.getString(1));
                e.setTitle(rs.getString(2));
                e.setAuthor(rs.getString(3));
                e.setPrice(rs.getInt(4));
                e.setQuantity(rs.getInt(5));
                list.add(e);
            }
            con.close();
        }catch(Exception e){e.printStackTrace();}

        return list;
    }
}
