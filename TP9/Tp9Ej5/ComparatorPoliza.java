package Tp9Ej5;
import java.util.Comparator;

public class ComparatorPoliza implements Comparator<Seguro>{

	public ComparatorPoliza() {
	
	}
	public int compare(Seguro s1, Seguro s2) {
		return s1.getPoliza()-s2.getPoliza();
	}

}
