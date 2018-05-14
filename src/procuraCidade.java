import java.util.Comparator;

public class procuraCidade implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		if (o1.getCidade().compareToIgnoreCase(o2.getCidade()) > 0) {
			return 1;
		}
		if (o1.getCidade().compareToIgnoreCase(o2.getCidade()) < 0) {
			return 2;
		} else {
			return 0;
		}
	}
}
