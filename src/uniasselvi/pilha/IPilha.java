package uniasselvi.pilha;

public interface IPilha {
	
	void empilha(int valor);
	
	int desempilha();
	
	boolean procura(int valor);
	
	void listaElementos();
	
	void esvazia();

}
