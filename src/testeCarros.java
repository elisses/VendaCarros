
public class testeCarros {

	public static void main(String[] args) {
		Carros meuCarro;
		meuCarro = new Carros();
		meuCarro.cor = "verde";
		meuCarro.modelo = "celta";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 100;
		
		meuCarro.liga();
		
		meuCarro.acelera(150);
		System.out.println(meuCarro.velocidadeAtual);
		
		

	}

}
