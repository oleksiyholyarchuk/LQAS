package collections;

import java.util.ArrayList;

public class MyList<MyType> {
	private ArrayList v = new ArrayList();

	public void add(MyType obj) {
		v.add(obj);
	}

	public MyType get(int index) {
		return (MyType) v.get(index);
	}

	public int size() {
		return v.size();
	}
}