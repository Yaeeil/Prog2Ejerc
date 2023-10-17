package Tp9Ej5;

import java.util.Comparator;

public class ComparatorMultiple implements Comparator<SeguroAbstracto> {

private Comparator<SeguroAbstracto> c1,c2;
	
	public ComparatorMultiple(Comparator<SeguroAbstracto> c1, Comparator<SeguroAbstracto> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public int compare(SeguroAbstracto s1, SeguroAbstracto s2) {
		int result = c1.compare(s1, s2);
		if(result == 0)
			result = c2.compare(s1, s2);
		return result;
	}
}
