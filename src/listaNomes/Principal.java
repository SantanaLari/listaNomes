package listaNomes;

public class Principal {

	public static void main(String[] args) {
	
		listaDuplamente_encadeada lista = new listaDuplamente_encadeada();
		
		Pessoa Ana = new Pessoa("Ana");
		Pessoa Amanda = new Pessoa("Amanda");
		Pessoa Bianca = new Pessoa("Bianca");
		Pessoa Beatriz = new Pessoa("Beatriz");
		Pessoa Carlos = new Pessoa("Carlos");
		Pessoa Abgail = new Pessoa("Abgail");
		Pessoa Asriel = new Pessoa("Asriel");
		Pessoa Sukuna = new Pessoa("Sukuna");
		
		lista.adicionarNome(Ana);
		lista.adicionarNome(Amanda);
		lista.adicionarNome(Abgail);
		lista.adicionarNome(Asriel);
		lista.adicionarNome(Bianca);
		/*lista.adicionarNome(Beatriz);
		lista.adicionarNome(Carlos);*/
		//System.out.println("Está presente na lista? "+ lista.estaPresente(Ana));
		lista.estaPresente(Amanda);
	//	lista.estaPresente(Carlos);
	//	lista.estaPresente(Sukuna);
	//	System.out.println("Está lista está vazia? "+ lista.estaVazia());
	//	lista.mostrarNomes();
	//	System.out.println(lista.indice(null));
		
		
		
		
		
		System.out.println("Quantidade de pessoas: " + lista.qtdNomes());
	}

}
