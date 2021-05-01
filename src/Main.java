import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Produtos:");
		
		String produto1 = "Computador";
		String produto2 = "Mouse";
		String data = "Registro:";
		
		int tempo = 30;
		int id = 5290;
		char sexo = 'F';
		
		double preço1 = 2100.0;
		double preço2 = 650.50;
		double medir = 53.234567;
				
		System.out.println(produto1 + ", preço unitário: R$" + preço1);
		System.out.println(produto2 + ", preço unitário: R$" + preço2);
		
		System.out.println(data +  tempo + " anos," + " código " + id + " e gênero: " + sexo );
		
		System.out.println("Medida com seis casas decimais: " + medir);
		System.out.printf("Medida com três casas decimais:%.3f%n", medir);
		
		Locale.setDefault(Locale.US);
		System.out.printf("Usando o ponto como separador decimal dos US:%.3f%n", medir);
		
	}

}
