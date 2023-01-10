import java.lang.reflect.Array;

public class QueueImpl<T> implements Queue<T> {
	private Class<T> classInfo;
	private QueueElement<T> head;
	private QueueElement<T> tail;

	public static void main(String... args) {
		QueueImpl<Integer> queue = new QueueImpl<Integer>(Integer.class);
		queue.append(1);
		queue.append(2);
		queue.append(3);
		queue.append(4);
		
		Integer[] x = queue.toArray();
		for (Integer i : x) {
			System.out.println(i);
		}
	}

	public QueueImpl(Class<T> c) {
		classInfo = c;
	}

	@Override
	public void append(T value) {
		QueueElement<T> newTail = new QueueElement<T>(value);
		if (head == null) {
			head = newTail;
		} else {
			tail.setNext(newTail);
		}
		tail = newTail;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public void remove() {
		if (isEmpty())
			return;
		QueueElement<T> newHead = head.getNext();
		head = newHead;
	}

	@Override
	public T peek() {
		return isEmpty() ? EMPTY_VALUE() : head.getContent();
	}

	@Override
	public T[] toArray() {
		// fuck you Java, all my homies use C#
		@SuppressWarnings("unchecked")
		T[] returnArray = (T[]) Array.newInstance(classInfo, getSize());

		QueueElement<T> current = head;
		int i = 0;
		returnArray[i++] = current.getContent();
		while (current.getNext() != null) {
			current = current.getNext();
			returnArray[i++] = current.getContent();
		}

		return returnArray;
	}

	private int getSize() {
		int size = 1;
		QueueElement<T> current = head;
		while (current.getNext() != null) {
			size++;
			current = current.getNext();
		}
		return size;
	}

	@Override
	public T EMPTY_VALUE() {
		return null;
	}

}
