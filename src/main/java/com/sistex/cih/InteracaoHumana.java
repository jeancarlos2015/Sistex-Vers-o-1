/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cih;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Request;

/**
 *
 * @author jean
 */
public class InteracaoHumana {
    public static boolean valida(HttpServletRequest request, String[] atributos){
        
        for(String atributo:atributos){
            if(!atributo.equals("codigo")){
                if(request.getParameter(atributo)==null){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void imprime(HttpServletResponse response, String msg) throws IOException{
        PrintWriter out = response.getWriter();
        out.println(msg);
    }
}
