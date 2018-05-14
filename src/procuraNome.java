import java.util.Comparator;

public class procuraNome implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		if (o1.getNome().compareToIgnoreCase(o2.getNome()) > 0) {
			return 1;
		}
		if (o1.getNome().compareToIgnoreCase(o2.getNome()) < 0) {
			return 2;
		} else {
			return 0;
		}
	}
}
