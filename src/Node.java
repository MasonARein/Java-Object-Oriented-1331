/**
 * Defines the format of a node to be used in a LinkedList.
 *
 * @param <E> Generic element type of data in node
 * @author Mason Rein
 * @version 11.0.12
 */
public class Node<E> {
    private E data;
    private Node<E> next;

    /**
     * Constructor that defines stored data values in the node.
     *
     * @param item Data to be saved inside the node
     */
    public Node(E item) {
        next = null;
        data = item;
    }

    /**
     * Gets the data of the given node of data.
     *
     * @return Generic data in node
     */
    public E getData() {
        return data;
    }

    /**
     * Sets the data of the given node of data.
     *
     * @param data Passed in generic data
     */
    public void setData(E data) {
        this.data = data;
    }

    /**
     * Gets the next Node after the given node.
     *
     * @return Next node
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets the next Node after the given node.
     *
     * @param next Node to be set after given node
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
