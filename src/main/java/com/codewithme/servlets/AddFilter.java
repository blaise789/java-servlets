package com.codewithme.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

public class AddFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response){



    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("in filter");
        int firstNum=0;
        HttpServletRequest req=(HttpServletRequest) servletRequest;
        Cookie cookies[]=req.getCookies();
        for(Cookie c:cookies) {
            if (c.getName().equals("num1")) {
                firstNum = Integer.parseInt(c.getValue());
            }
            System.out.println("in filter" + firstNum);
        }
    if(firstNum<1){
        PrintWriter out=servletResponse.getWriter();
        servletResponse.setContentType("text/html");
        out.print("use positive numbers");
    }
    else {
        filterChain.doFilter(servletRequest,servletResponse);
    }

        }
    }
