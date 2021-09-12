package listaNomes;
//A,B,C,D,E,F,G,H,I,J,K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
//0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25
public class listaDuplamente_encadeada {

	private Pessoa primeiro = null;
	private Pessoa ultimo = null;
	private int totalPessoas = 0;
	private Pessoa [] ordemAlfabetica = new Pessoa[25];
	private String [] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q",
			"R","S","T","U","V","W","X","T","Y","Z"};
	
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
		String vet[] = nome.getNome().split("");
		String alfabeto [] = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
				"n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		for(int num = 0; num < letras.length; num++) {
			if(vet[0].equals(letras[num])) {
				if(ordemAlfabetica[num] == null) {
					primeiro = nome;
					ultimo = nome;
					ordemAlfabetica[num] = primeiro;
				}else if(ordemAlfabetica[num].getProximo() == null) {
					nome.setAnterior(ultimo);
					ultimo.setProximo(nome);
					ultimo = nome;
					ordemAlfabetica[num] = ultimo;
				}
			}
		}
		
		/*for(int num = 0; num < letras.length; num++) {
			if(vet[0].equals(letras[num])) {
				if(ordemAlfabetica[num] == null) {
					primeiro = nome;
					ultimo = nome;
					ordemAlfabetica[num] = primeiro;
				}else if(ordemAlfabetica[num].getProximo() == null) {
					nome.setAnterior(ultimo);
					ultimo.setProximo(nome);
					ultimo = nome;
					ordemAlfabetica[num] = ultimo;
				}
			}
		}*/
		
		totalPessoas++;
	}
	
	public boolean estaPresente(Pessoa nome) {
		boolean resposta = false;
		
		String vet[] = nome.getNome().split("");
		
		for(int num = 0; num < letras.length; num++) {
			if(vet[0].equals(letras[num])) {
				Pessoa aux = ordemAlfabetica[num];
				while(aux != null) {
					if(aux.getNome() == nome.getNome()) {
						resposta = true;
						break;
					}else {
						aux = aux.getAnterior();
					}
				}
			}
		}
		return resposta;
	}
	
	public void mostrarNomes(Pessoa nome) {
		System.out.println("Nome: " + nome.getNome());
		System.out.println("Próximo: " + nome.getProximo().getNome());
		System.out.println("Anterior: " + nome.getAnterior().getNome());
		
		
		
		/*Pessoa aux = primeiro;
		
		for(int num = 0; num < ordemAlfabetica.length; num++) {
			if(ordemAlfabetica[num] == null) {
				System.out.println("Nenhum nome encontrado no indice " + letras[num]);
			}else {
				while(aux != null) {
					System.out.println(aux.getNome());
					aux = aux.getProximo();
				}
			}
		}*/
	}
	
	public void teste(Pessoa nome) {
		Pessoa aux = ordemAlfabetica[0];
	
		while(aux != null) {
			System.out.println(aux.getNome());
			aux = aux.getAnterior();
		}
	}
	
	public void excluir(Pessoa nome) {
		Pessoa prox = nome.getProximo();
		Pessoa ant = nome.getAnterior();
		
		ant.setProximo(prox);
		prox.setAnterior(ant);
		/*
		Pessoa prox = null;
		Pessoa ant = null;
		
		if(nome.getAnterior() == null) {
			prox = nome.getProximo();
			prox.setAnterior(ant);
		}else if(nome.getProximo() == null) {
			ant = nome.getAnterior();
			ant.setProximo(null);
		}else {
			prox = nome.getProximo();
			ant = nome.getAnterior();
			ant.setProximo(prox);
			prox.setProximo(ant);
		}*/
		
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
		boolean resposta = true;
		
		for(int i = 0; i < ordemAlfabetica.length; i++) {
			if(ordemAlfabetica[i] != null) {
				resposta = false;
			}
		}
		
		return resposta;
	}
	
	public int qtdNomes() {
		return totalPessoas;
	}
	
}
