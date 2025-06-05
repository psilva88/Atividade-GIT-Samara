package questao10;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Veiculo> veiculos = new ArrayList<>();

		veiculos.add(new Carro("ABC1234", "Toyota", 2020, 4));
		veiculos.add(new Moto("XYZ1234", "Honda", 2000, 250));
	

		exibirTodosDetalhes(veiculos);

	}

	public static void exibirTodosDetalhes(ArrayList<Veiculo> lista) {
		for (Veiculo veiculo : lista) {
			veiculo.exibirDetalhes();

		}
	}
}