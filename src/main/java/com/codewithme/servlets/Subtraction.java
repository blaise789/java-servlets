package com.codewithme.servlets;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Subtraction extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
        System.out.println("subtraction is called");
        int a=(int) req.getAttribute("num1");
        int b=(int) req.getAttribute("num2");
        PrintWriter out=res.getWriter();
                res.setContentType("text/html");
        int diff=a-b;
        out.println("the difference is"+diff);
        System.out.println("the difference is "+diff);

    }
}
