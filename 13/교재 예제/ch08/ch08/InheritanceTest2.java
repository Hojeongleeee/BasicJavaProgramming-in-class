class AA {
	int i;
	private int j;
	void setij(int x, int y) {
		i = x;
		j = y;
	}
}
class BB extends AA {
	int total;
	void sum() {
		total = i + j;
	}
}
public class InheritanceTest2 {
	public static void main(String args[]) {
		BB subOb = new BB();
		subOb.sum();
	}
}