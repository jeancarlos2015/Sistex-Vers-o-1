/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cci;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jean
 */
@WebServlet(name = "CadastroProduto", urlPatterns = {"/CadastroProduto"})
public class ControleProduto extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println(request.getParameter("nome"));
        out.println(request.getParameter("descricao"));
        out.println(request.getParameter("preco"));
        out.println(request.getParameter("marca"));
        out.println(request.getParameter("quantidade"));
    }
}
