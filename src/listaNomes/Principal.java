package listaNomes;

public class Principal {

	public static void main(String[] args){
	
		listaDuplamente_encadeada lista = new listaDuplamente_encadeada();
		
		try {
			Pessoa Aline = new Pessoa("Aline");
			Pessoa Amanda = new Pessoa("Amanda");
			Pessoa Ana = new Pessoa("Ana");
			Pessoa Ananda = new Pessoa("Ananda");
			Pessoa Bia = new Pessoa("Bia");
			Pessoa Beatriz = new Pessoa("Beatriz");
			Pessoa Carla = new Pessoa("Carla");
			Pessoa Carlos = new Pessoa("Carlos");
			Pessoa Cesar = new Pessoa("Cesar");
			Pessoa Cosmos = new Pessoa("Cosmos");
			Pessoa Debora = new Pessoa("Debora");
			Pessoa Zaza = new Pessoa("Zaza");
			Pessoa Zoraide = new Pessoa("Zoraide");
			Pessoa Zuleika = new Pessoa("Zuleika");
			
			System.out.println("Em que indice o nome Steven será guardado? " + lista.indice("Steven"));
			lista.adicionarNome(Aline);
			lista.adicionarNome(Amanda);
			lista.adicionarNome(Ananda);
			lista.adicionarNome(Ana);
			lista.adicionarNome(Beatriz);
			lista.adicionarNome(Carla);
			lista.adicionarNome(Cosmos);
			lista.adicionarNome(Carlos);
			lista.adicionarNome(Zoraide);
			
			System.out.println("Quantidade de nomes: " + lista.qtdNomes());
			System.out.println("Aline está presente? " + lista.estaPresente(Aline));
			
			lista.excluir(Aline);
			lista.excluir(Ananda);
			
			System.out.println("Aline está presente? " + lista.estaPresente(Aline));
			System.out.println("Ananda está presente? " + lista.estaPresente(Ananda));
			System.out.println("Quantidade de nomes: " + lista.qtdNomes());
			
			lista.renomear(Cosmos, Cesar);
			
			System.out.println("Cosmos está presente? " + lista.estaPresente(Cosmos));
			
			System.out.println("Está vazia? " + lista.estaVazia());
			
			
		}catch (Exception e) {
            System.out.println(e.getMessage());
        }
		
	}

}
