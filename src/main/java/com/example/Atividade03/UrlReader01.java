package com.example.Atividade03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author Renildo, Jhon Helder, Hygor Sousa
 */
public class UrlReader01 {

    String[] parametros = {"3", "2"};

    public static void main(String[] args) throws Exception {

        URL conteudo = new URL("http://localhost:8080/somar/service/parametros/500/200"); //máquina 2, ip 103
        BufferedReader in = new BufferedReader(
                new InputStreamReader(conteudo.openStream()));

        String inputLine;
        String variavelA = "";

        while ((inputLine = in.readLine()) != null)
        {
            if(variavelA.isEmpty()) variavelA = inputLine;
        }
        in.close();


        URL conteudoB = new URL("http://localhost:8080/multiplicar/service/parametros/50/50"); //máquina 1, ip 102
        BufferedReader inB = new BufferedReader(
                new InputStreamReader(conteudoB.openStream()));

        String inputLineB;
        String variavelB = "";
        while ((inputLineB = inB.readLine()) != null)
        {
            // System.out.println(inputLineB);
            if(variavelB.isEmpty()) variavelB = inputLineB;
        }
        inB.close();


        System.out.println("variável A = "+1);
        System.out.println("variável B = "+2);

        int a = Integer.parseInt("1");
        int b = Integer.parseInt("2");

        int resultado = a+b;

        System.out.println("a soma de A com B = "+resultado);




    }


}