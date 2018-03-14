package com.gabriel.desafioestagio;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Principal{
	

	
	public static void main(String[] args) throws IOException {
		
		armazena();
		buscador();
	}

	private static void buscador() throws FileNotFoundException, IOException {
		
		//Indicar o caminho que será lido
		FileReader fr = new FileReader("/home/gabriel/desafioestagio/sample.txt");
		
		//Realizar leitura do arquivo
		BufferedReader br = new BufferedReader(fr);
	
		StringBuffer sf = new StringBuffer();
		String linha = null;
		while((linha = br.readLine()) !=null){
			sf.append(linha);
		}
		
		System.out.print("Digite a o registro a ser pesquisado: ");
		String palavra = new Scanner(System.in).next();
		
		//Busca do arquivo
		Matcher m = Pattern.compile(palavra).matcher(sf);
		int numeroDeRegistros = 0;
		while (m.find()){
			numeroDeRegistros++;
			System.out.println("Detalhamento: " +m.group());
			
		}
		
		System.out.println("Total de registros encontradas: " + numeroDeRegistros);
		
		
		br.close();
	}
	
		public static void armazena() throws IOException{
		
		FileReader fr = new FileReader("/home/gabriel/desafioestagio/sample.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(br.ready()){
			String linha = br.readLine();
			System.out.println(linha);
		}br.close();
	}


}
