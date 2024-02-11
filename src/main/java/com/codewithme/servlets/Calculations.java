package com.codewithme.servlets;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class Calculations extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse response) throws IOException, ServletException {
        int firstNumber=Integer.parseInt(req.getParameter("num1"));
        int secondNumber=Integer.parseInt(req.getParameter("num2"));
        int operationType=Integer.parseInt(req.getParameter("operations"));

//        req.setAttribute("num1",firstNumber);
//        req.setAttribute("num2",secondNumber);
//        RequestDispatcher rqd;
//        HttpSession session=req.getSession();
//        session.setAttribute("num1",firstNumber);
//        session.setAttribute("num2",secondNumber);
        Cookie firstNum=new Cookie("num1",firstNumber+"");
        Cookie secondNum=new Cookie("num2",secondNumber+"");
        response.addCookie(firstNum);
        response.addCookie(secondNum);
        if(operationType==1){
//            rqd=req.getRequestDispatcher("add");
//            rqd.forward(req,response);
            response.sendRedirect("add");
        }
        else {
            response.sendRedirect("subtract");
//            rqd=req.getRequestDispatcher("subtract");
//            rqd.forward(req,response);
        }



    }
}
