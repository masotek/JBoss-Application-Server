package com.isa.servlets;

import com.isa.beans.RandomNumber;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/random-number")
public class RandomNumberServlet extends HttpServlet {

    @Inject
    RandomNumber randomNumber;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("Random number is: " + randomNumber.getRandomNumber());
    }
}
