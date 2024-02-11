package com.codewithme.servlets;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Calculations extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse response) throws IOException, ServletException {
        int firstNumber=Integer.parseInt(req.getParameter("num1"));
        int secondNumber=Integer.parseInt(req.getParameter("num2"));
        int operationType=Integer.parseInt(req.getParameter("operations"));

        req.setAttribute("num1",firstNumber);
        req.setAttribute("num2",secondNumber);
        RequestDispatcher rqd;
        if(operationType==1){
            rqd=req.getRequestDispatcher("add");
            rqd.forward(req,response);
        }
        else {
            rqd=req.getRequestDispatcher("subtract");
            rqd.forward(req,response);
        }



    }
}
