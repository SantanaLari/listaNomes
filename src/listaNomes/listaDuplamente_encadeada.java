package listaNomes;

public class listaDuplamente_encadeada {

	private Pessoa primeiro = null;
	private Pessoa ultimo = null;
	private int totalPessoas = 0;
	private Pessoa [] ordemAlfabetica = new Pessoa[3];
	private String [] letras = {"A", "B", "C"};
	
	public int indice(String nome) {
		int res = -1;
		String vet[] = nome.split("");
		
		for(int num = 0; num < letras.length; num++) {
			if(vet[0].equals(letras[num])) {
				return num;
			}
		}
		
		return res;
	}
	
	public void adicionarNome(Pessoa nome) {
		String vet[] = nome.getNome().split("");
	
		for(int num = 0; num < letras.length; num++) {
			if(vet[0].equals(letras[num])) {
				if(ordemAlfabetica[num] == null) {
					primeiro = nome;
					ultimo = nome;
					ordemAlfabetica[num] = primeiro;
				}else if(ordemAlfabetica[num].getProximo() == null) {
					ultimo.setProximo(nome);
					ultimo = nome;
					ordemAlfabetica[num] = ultimo;
				}
			}
		}
		
		totalPessoas++;
	}
	
	
	
	public void estaPresente(Pessoa nome) {
		String vet[] = nome.getNome().split("");
		Pessoa aux = primeiro;	
		
		for(int num = 0; num < letras.length; num++) {
			if(vet[0].equals(letras[num])) {
				while(aux != null) {
					if(aux == nome) {
						System.out.println("Está presente");
					}
					aux = aux.getProximo();
				}
			}
		}
	}
	
	public void mostrarNomes() {
		
		
		
		
		
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
