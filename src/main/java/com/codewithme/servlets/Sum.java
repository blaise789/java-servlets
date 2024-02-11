package com.codewithme.servlets;

import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class Sum extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("addition  is called");
//        int a=(int) request.getAttribute("num1");
//        int b=(int)request.getAttribute("num2")
//;
//        HttpSession session=request.getSession();
//        int a=(int) session.getAttribute("num1");
//        int b=(int) session.getAttribute("num2");

        Cookie cookies[]=request.getCookies();
        int a=Integer.parseInt(cookies[0].getValue()) ;
        int b=Integer.parseInt(cookies[1].getValue());

        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        int sum=a+b;
        out.println("the sum is "+sum);


    }
}
