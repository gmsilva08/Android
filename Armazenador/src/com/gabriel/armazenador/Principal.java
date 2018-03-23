package com.gabriel.armazenador;

import java.io.*;
public class Principal {

   public static void main(String args[]) throws IOException {  
      
	  //Leitura do arquivo sample.txt e criação do arquivo de output saida.txt
	   FileInputStream fi = new FileInputStream("/home/gabriel/desafioestagio/sample.txt");
	   FileOutputStream fo = new FileOutputStream("/home/gabriel/desafioestagio/saida.txt");
	 

      try {
         
         int c;
         while ((c = fi.read()) != -1) {
            fo.write(c);
         }
      }finally {
         if (fi != null) {
            fi.close();
         }
         if (fo != null) {
            fo.close();
         }
         
      }
   }
}