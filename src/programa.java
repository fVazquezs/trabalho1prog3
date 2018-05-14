import java.util.Scanner;

public class programa {
	static ListaEncadeada<Pessoa> lista = ListaEncadeada.carregaDados();

	public static void main(String[] args) {
		boolean fim = false;

		while (fim != true) {
			switch (menu()) {
			case 1:
				System.out.println("------------------");
				lista.search(new procuraCodigo());
				break;
			case 2:
				System.out.println("------------------");
				lista.search(new procuraNome());
				break;
			case 3:
				System.out.println("------------------");
				lista.search(new procuraIdade());
				break;
			case 4:
				System.out.println("------------------");
				lista.search(new procuraCidade());
				break;
			case 0:
				fim = true;
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}

	public static int menu() {
		lista.printObjects();
		System.out.println("------------------");
		System.out.println("[1] Ordenar Código\n" + "[2] Ordenar Nome\n" + "[3] Ordenar Idade\n"
				+ "[4] Ordenar Cidade\n\n" + "    Opção > ");
		return new Scanner(System.in).nextInt();
	}
}
