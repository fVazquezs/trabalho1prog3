import java.util.Comparator;

public class procuraCodigo implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		if (o1.getCod() > o2.getCod()) {
			return 1;
		}
		if (o1.getCod() < o2.getCod()) {
			return 2;
		} else {
			return 0;
		}
	}

}