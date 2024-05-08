/*
 Objetivo é acessar um TXT e ordenar pelos menores caracteres. 
   Motivação: Domínios com menos caracteres são os mais raros. 

FileReader fr = new FileReader("C:\\Users\\ronis\\Documents\\NetBeansProjects\\ShortDomainSeeker\\src\\main\\java\\com\\mycompany\\shortdomainseeker\\lista-processo-liberacao.txt");
 */

package com.mycompany.shortdomainseeker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.out;


public class ShortDomainSeeker {

    public static void main(String[] args) {

        // Acessar o TXT e armazenar em Arraylist 
        System.out.println("Buscando arquivo:");
        
        try{

         FileReader fr = new FileReader("C:\\Users\\ronis\\Downloads\\1111lista-processo-liberacao.txt");   
         BufferedReader br = new BufferedReader(fr);
            String str;
            System.out.println("DOMÍNIOS ATÉ 9 CARACTÉRES");
                       
            while((str = br.readLine()) != null){
                if (str.length()<10){
                        
                        System.out.println(str+ " ["+str.length()+"]");
                }
                              } 
          
        }
        catch(IOException e){
        out.println("Arquivo não encontrado!");}
    }
    
    
    
    //--------------------
    
    
    }
    




