
public class QueueElement<T> {
	private T content;
	private QueueElement<T> next;

	public QueueElement(T content) {
		this.content = content;
	}
	
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public QueueElement<T> getNext() {
		return next;
	}

	public void setNext(QueueElement<T> next) {
		this.next = next;
	}
}