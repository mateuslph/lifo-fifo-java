package uniasselvi.lista;

public class Testador {

	public static void main(String[] args) {

		Lista lista = new Lista();
		
		lista.adiciona(3);
		lista.adiciona(1);
		lista.adiciona(10);
		lista.adiciona(8);
		lista.adiciona(5);
		
		lista.listaElementos();
		
		lista.procura(0);
		lista.procura(3);

	}

}
