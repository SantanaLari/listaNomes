package listaNomes;

public class Pessoa {
	
	private String nome;
	private Pessoa proximo;
	private Pessoa anterior;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa getProximo() {
		return proximo;
	}

	public void setProximo(Pessoa proximo) {
		this.proximo = proximo;
	}

	public Pessoa getAnterior() {
		return anterior;
	}

	public void setAnterior(Pessoa anterior) {
		this.anterior = anterior;
	}
	
}
