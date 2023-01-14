
public class Pair<T1, T2> {
	private T1 first;
	private T2 second;

	public Pair(T1 val1, T2 val2) {
		first = val1;
		second = val2;
	}

	public T1 getFirst() {
		return first;
	}

	public void setFirst(T1 first) {
		if (first == null) {
			return;
		}
		this.first = first;
	}

	public T2 getSecond() {
		return second;
	}

	public void setSecond(T2 second) {
		if (second == null) {
			return;
		}
		this.second = second;
	}
}
