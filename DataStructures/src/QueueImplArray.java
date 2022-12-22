
public class QueueImplArray {

	private int[] values = new int[0];

	public QueueImplArray() {
	}

	public void append(int value) {
		int[] newVals = new int[values.length + 1];
		for (int i = 0; i < values.length; ++i) {
			newVals[i] = values[i];
		}
		newVals[values.length] = value;
		values = newVals;
	}

	public boolean isEmpty() {
		return values.length == 0;
	}

	public void remove() {
		if (values.length == 0) {
			return;
		}
		int[] newVals = new int[values.length - 1];
		for (int i = 0; i < values.length; ++i) {
			newVals[i] = values[i + 1];
		}
		values = newVals;
	}

	public int peek() {
		return values.length == 0 ? -1 : values[0];
	}

	public int[] toArray() {
		int[] copy = new int[values.length];
		for (int i = 0; i < values.length; ++i) {
			copy[i] = values[i];
		}
		return copy;
	}

}
