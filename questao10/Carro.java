package questao10;

public class Carro extends Veiculo{

	private int numeroPortas;

    public Carro(String placa, String marca, int ano, int numeroPortas) {
        super(placa, marca, ano);
        this.numeroPortas = numeroPortas;
    }

    
    
    public int getNumeroPortas() {
		return numeroPortas;
	}



	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}



	@Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de portas: " + numeroPortas);
        System.out.println("--------------------------");
    }
}