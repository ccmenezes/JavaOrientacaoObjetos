package javaorientacaobjetos.main;

public class GerenciadorDeImpostoDeRenda {
	
	private double total;

    public void adicionar(Tributavel t) {
       this.total +=  t.calcularTributos();
    }

    public double getTotal() {
        return this.total;
    }

}
