import java.util.Comparator;

public class ListaEncadeada<T> {
	public class no {
		private T dado;
		private no next;
		private no previous;

		public no(T dado, no anterior, no proximo) {
			this.dado = dado;
			this.next = next;
			this.previous = previous;
		}

	}

	private no head;
	private no tail;

	public no getHead() {
		return head;
	}

	public void append(T dado) {
		no novo = new no(dado, tail, null);
		if (tail != null) {
			tail.next = novo;
		} else {
			head = novo;
		}
		novo.previous = tail;
		tail = novo;
	}

	public void addFirst(T dado) {
		no novo = new no(dado, head, null);
		if (head != null) {
			head.previous = novo;
		} else {
			tail = novo;
		}
		novo.next = head;
		head = novo;
	}



	public void search(Comparator<T> comp) {
		no i = head;
		while (i != null) {
			T dado = i.dado;
			while(i.previous != null && comp.compare(dado, i.previous.dado) == 2) {
				i.dado = i.previous.dado;
				i = i.previous;
			}
			i.dado = dado;
			i = i.next;
		}
	}

	public void printObjects() {
		ListaEncadeada<T>.no i = head;
		while (i != null) {
			System.out.println(i.dado);
			i = i.next;
		}
	}

	public static <T> ListaEncadeada<T> carregaDados() {
		int cod[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String nome[] = { "Joao", "Maria", "Jose", "Luisa", "Roberto", "Mariana", "Felipe", "Barbara", "Rodrigo",
				"Ana" };
		int idade[] = { 70, 50, 26, 24, 24, 34, 33, 48, 64, 37, 32 };
		String cidade[] = { "Moscou", "Kiev", "Monteria", "Piura", "Vancouver", "Porto Alegre", "Brasilia",
				"Rio de Janeiro", "Montevideo", "Maldonado" };
		ListaEncadeada lista = new ListaEncadeada<Pessoa>();
		for (int x = 0; x < cod.length; x++) {
			Pessoa a = new Pessoa(cod[x], nome[x], idade[x], cidade[x]);
			if (x == 0) {
				lista.addFirst(a);
			} else {
				lista.append(a);
			}
		}
		return lista;
	}
}