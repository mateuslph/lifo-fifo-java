package uniasselvi.lista;

public class Lista implements ILista {
	
	private Tad topo, base;
	private int numeroElementos;

	@Override
	public void adiciona(int valor) {
		Tad tad = new Tad(valor);
		if (base==null) {
			base = tad;
			topo = tad;
		} else {
			topo.setProximo(tad);
			topo = tad;
		}
		numeroElementos++;		
	}

	@Override
	public void remove() {
		base = base.getProximo();
		
	}

	@Override
	public boolean procura(int valor) {
		/*for (int i=0; i<numeroElementos; i++) {*/
			if (valor == base.getValor()) return true;
			base = base.getProximo();
			
		return false;
	}

	@Override
	public void listaElementos() {
		for (int i=0; i<numeroElementos; i++) {
			System.out.println(base.getValor());
			base = base.getProximo();
			}
	}

	@Override
	public void esvazia() {
		// TODO Auto-generated method stub
		
	}
	
	

}
