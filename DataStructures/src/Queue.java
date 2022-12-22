//Angepasst für eine generische Implementierung
public interface Queue<T> {
	/**
	 * 
	 * @return Default Value für Typ T
	 */
	T EMPTY_VALUE();

    /**
     * Fuegt den Wert value (am Ende) in die Wartschlange ein.
     * @param value
     */
    void append(T value);

    /**
     * Prueft, ob die Warteschlange leer ist
     * @return true, wenn die Warteschlange leer ist
     */
    boolean isEmpty();

    /**
     * Entfernt das erste Element aus der Warteschlange
     * Macht nichts, wenn die Warteschlage leer ist.
     */
    void remove();

    /**
     * Gibt den Wert des ersten Elements der Liste zurück.
     * Wenn die Liste leer ist, wird EMPTY_VALUE zurückgegeben.
     * @return Wert des ersten Elements
     */
    T peek();

    /**
     * Erzeugt einen Array mit den Werten der Warteschlage.
     * @return frischer Array mit den Werten der Warteschlange.
     */
    T[] toArray();
}