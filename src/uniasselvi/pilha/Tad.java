package uniasselvi.pilha;

public class Tad {
	// Tad eh abreviatura de Tipo abstrato de dados
	
	private Tad proximo;
	private int valor;
	
	public Tad(int valor) {
		this.valor = valor;
	}
	
	public Tad getProximo() {
		return proximo;
	}
	public void setProximo(Tad proximo) {
		this.proximo = proximo;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	

}
