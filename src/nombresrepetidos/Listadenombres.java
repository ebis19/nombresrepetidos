package nombresrepetidos;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Listadenombres {
	HashMap<String, Integer> nombres;
	TreeMap<Integer,String> repetidos;
	//ArrayList<Nombre> nombres;
	int cantrep;
	
	
	
	
	public Listadenombres(String archivo ) throws IOException{
		
		Scanner in = new Scanner(new File(archivo+".in"));
		int cantmax=in.nextInt();
		String k;
		this.cantrep=in.nextInt();
		int c;
		this.nombres= new HashMap<String,Integer>();
		this.repetidos= new TreeMap<Integer,String>();
		for (int i = 0; i < cantmax; i++) {
			k=in.next();
			if(nombres.containsKey(k)){
				c=nombres.get(k);
				nombres.replace(k,c,c+1);
			}
			else
				nombres.put(k,1);
		} 
		
		in.close();
	}
	
	public void ordenar(){
		
		for (Entry<String, Integer> nombre : nombres.entrySet()) 
			this.repetidos.put(nombre.getValue(), nombre.getKey());
		
		
	}
	public void exportarDatos(String a) throws IOException{
		Entry<Integer, String > n;
		PrintWriter out= new  PrintWriter(new File(a+".out"));
		for (int i = 0; i < this.cantrep; i++) {
			 n = this.repetidos.pollLastEntry();
			out.println(n.getValue()+" "+n.getKey());
			
		}
		out.close();
	}



	
}


