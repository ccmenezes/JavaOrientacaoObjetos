package javaorientacaobjetos.main;

public class ControleDeBonificacoes {
	
	 private double totalDeBonificacoes = 0;

     public void registra(Funcionario f) {
    	 
    	this.totalDeBonificacoes += f.getBonificacao();
     }

     public double getTotalDeBonificacoes() {
         return this.totalDeBonificacoes;
     }

	public void mostrarFuncionarioBonificado(Funcionario f) {
		System.out.println("Adicionando bonificação do funcionario: " + f.getNome());
	}

}
