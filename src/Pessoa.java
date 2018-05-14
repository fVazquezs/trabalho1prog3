
public class Pessoa {
	private int cod;
	private String nome;
	private int idade;
	private String cidade;

	public Pessoa(int cod, String nome, int idade, String cidade) {
		this.cod = cod;
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
	}

	public int getCod() {
		return cod;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getCidade() {
		return cidade;
	}

	@Override
	public String toString() {
		return "Codigo: " + cod + ", Nome: " + nome + ", Idade: " + idade + ", Cidade: " + cidade ;
	}
	
}
