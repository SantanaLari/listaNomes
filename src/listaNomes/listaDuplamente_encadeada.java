package listaNomes;

public class listaDuplamente_encadeada {

	private Pessoa primeiro = null;
	private Pessoa ultimo = null;
	private int totalPessoas = 0;
	private Pessoa [] ordemAlfabetica = new Pessoa[26];
	private String [] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q",
			"R","S","T","U","V","W","X","Y","Z"};
	
	public int indice(String nome) {
		int posicao = -1;
		
		String vet[] = nome.split("");
		
		for(int num = 0; num < letras.length; num++) {
			if(vet[0].equals(letras[num])) {
				posicao = num;
			}
		}

		return posicao;
	}
	
	public void adicionarNome(Pessoa nome) {
		String buscaIndice = nome.getNome();
		indice(buscaIndice);
		
		if(ordemAlfabetica[indice(buscaIndice)] == null) {
			primeiro = nome;
			ultimo = nome;
			ordemAlfabetica[indice(buscaIndice)] = primeiro;
		}else if(ordemAlfabetica[indice(buscaIndice)].getProximo() == null) {
			nome.setAnterior(ultimo);
			ultimo.setProximo(nome);
			ultimo = nome;
			ordemAlfabetica[indice(buscaIndice)] = ultimo;
		}
		
		totalPessoas++;
	}
	
	public boolean estaPresente(Pessoa nome) {
		boolean resposta = false;
		
		String buscaIndice = nome.getNome();
		indice(buscaIndice);
		
		Pessoa aux = ordemAlfabetica[indice(buscaIndice)];

		while(aux != null) {
			if(aux.getNome() == nome.getNome()) {
				resposta = true;
				break;
			}else {
				aux = aux.getAnterior();
			}
		}
		
		return resposta;
	}
		
	public void excluir(Pessoa nome) {
		Pessoa prox = null;
		Pessoa ant = null;
		
		if(qtdNomes() == 0) {
			throw new IllegalArgumentException("Nenhum usuário adicionado");
		}else {
			if(nome.getAnterior() == null) {
				prox = nome.getProximo();
				prox.setAnterior(null);
				nome.setProximo(null);
				primeiro = prox;
			}else if(nome.getProximo() == null) {
				ant = nome.getAnterior();
				ant.setProximo(null);
				nome.setAnterior(null);
				ultimo = ant;
			}else {
				ant = nome.getAnterior();
				prox = nome.getProximo();
				ant.setProximo(prox);
				prox.setAnterior(ant);
			}
		}
		totalPessoas--;
	}
	
	public void renomear(Pessoa nome, Pessoa nomeNovo){
		Pessoa prox = null;
		Pessoa ant = null;
		
		if(nome.getAnterior() == null) {
			prox = nome.getProximo();
			prox.setAnterior(nomeNovo);
		}else if(nome.getProximo() == null) {
			ant = nome.getAnterior();
			ant.setProximo(nomeNovo);
		}else {
			prox = nome.getProximo();
			ant = nome.getAnterior();
			ant.setProximo(nomeNovo);
			prox.setAnterior(nomeNovo);
		}
			
		System.out.println(nome.getNome() + " foi renomeado(a) para " + nomeNovo.getNome());
	}
	
	public boolean estaVazia() {
		
		return (qtdNomes() == 0 ? true:false);
	}
	
	public int qtdNomes() {
		return totalPessoas;
	}
	
}
