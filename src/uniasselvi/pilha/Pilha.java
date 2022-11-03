package uniasselvi.pilha;

public class Pilha implements IPilha {
	
	private Tad topo;
	private int numeroElementos;

	@Override
	public void empilha(int valor) {
		Tad tad = new Tad(valor);
		Tad auxiliar = null;
		
		if (topo == null) {
			topo = tad;
		}else {
			auxiliar = topo;
			topo = tad;
			topo.setProximo(auxiliar);
		}
		numeroElementos++;
	}

	@Override
	public int desempilha() {
		int retorno = topo.getValor();
		topo = topo.getProximo();
		return numeroElementos++;
		
	}

	@Override
	public boolean procura(int valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void listaElementos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void esvazia() {
		// TODO Auto-generated method stub
		
	}
	
	

}
