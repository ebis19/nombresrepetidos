package nombresrepetidos;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Listadenombres  l = new Listadenombres("nombres");
		l.ordenar();
		l.exportarDatos("nombres");
	}

}
