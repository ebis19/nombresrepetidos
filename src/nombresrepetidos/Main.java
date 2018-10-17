package nombresrepetidos;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Listadenombres  l = new Listadenombres("Tests/in/00_enunciado");
		l.ordenar();
		l.exportarDatos("Tests/out/00_enunciado");
		
		Listadenombres  l2 = new Listadenombres("Tests/in/01_similares");
		l2.ordenar();
		l2.exportarDatos("Tests/out/01_similares");
		
		Listadenombres  l3 = new Listadenombres("Tests/in/02_unica_repeticion");
		l3.ordenar();
		l3.exportarDatos("Tests/out/02_unica_repeticion");
		
		Listadenombres  l4 = new Listadenombres("Tests/in/03_unico_nombre");
		l4.ordenar();
		l4.exportarDatos("Tests/out/03_unico_nombre");
		
	/*	Listadenombres  l5 = new Listadenombres("Tests/in/04_fatiga");
		l5.ordenar();
		l5.exportarDatos("Tests/out/04_fatiga");*/
	}

}
