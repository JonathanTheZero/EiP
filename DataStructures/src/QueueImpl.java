
public class QueueImpl implements Queue {

	private int[] values = new int[0];

	public QueueImpl() {
	}

	@Override
	public void append(int value) {
		int[] newVals = new int[values.length + 1];
		for (int i = 0; i < values.length; ++i) {
			newVals[i] = values[i];
		}
		newVals[values.length] = value;
		values = newVals;
	}

	@Override
	public boolean isEmpty() {
		return values.length == 0;
	}

	@Override
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

	@Override
	public int peek() {
		return values.length == 0 ? Queue.EMPTY_VALUE : values[0];
	}

	@Override
	public int[] toArray() {
		int[] copy = new int[values.length];
		for (int i = 0; i < values.length; ++i) {
			copy[i] = values[i];
		}
		return copy;
	}

}
