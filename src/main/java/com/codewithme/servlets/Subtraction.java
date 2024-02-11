package com.codewithme.servlets;

import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class Subtraction extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
        System.out.println("subtraction is called");
//        int a=(int) req.getAttribute("num1");
////        int b=(int) req.getAttribute("num2");
//        HttpSession session=req.getSession();
//        int a=(int) session.getAttribute("num1");
//        int b=(int) session.getAttribute("num2");
        Cookie cookies[]=req.getCookies();
        int a=Integer.parseInt(cookies[0].getValue()) ;
        int b=Integer.parseInt(cookies[1].getValue());
        PrintWriter out=res.getWriter();
                res.setContentType("text/html");
        int diff=a-b;
        out.println("the difference is"+diff);
        System.out.println("the difference is "+diff);

    }
}
