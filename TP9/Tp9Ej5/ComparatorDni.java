package Tp9Ej5;

import java.util.Comparator;

public class ComparatorDni  implements Comparator<Seguro>{

	public ComparatorDni() {
	
	}
	public int compare(Seguro s1, Seguro s2) {
		return s1.getDni()-s2.getDni();
	}


}
