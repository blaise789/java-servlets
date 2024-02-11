package com.codewithme.servlets;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Sum extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("addition  is called");
        int a=(int) request.getAttribute("num1");
        int b=(int)request.getAttribute("num2");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        int sum=a+b;
        out.println("the sum is "+sum);


    }
}
