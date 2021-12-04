import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Defines the structure for the Iterator of a LinkedList.
 *
 * @param <E> Data type used in the LinkedList iterator
 * @author Mason Rein
 * @version 11.0.12
 */
public class LinkedListIterator<E> implements Iterator<E> {
    private Node<E> next;

    /**
     * Defines the start of the Iterator for no passed values.
     */
    public LinkedListIterator() {
    }

    /**
     * Defines the starting next value for the created iterator.
     *
     * @param head Node passed to start at
     */
    public LinkedListIterator(Node head) {
        next = head;
    }

    /**
     * Defines starting next value for the created iterator.
     *
     * @param items Passed in LinkList to be iterated over
     */
    public LinkedListIterator(LinkedList items) {
        next = (Node) items.get(0);
    }

    /**
     * Returns true if there is a next value in the LinkedList.
     *
     * @return Boolean of if there's a next value
     */
    @Override
    public boolean hasNext() {
        return next != null;
    }

    /**
     * Gives the data in the next node of the LinkedList.
     *
     * @return Data contained in next node
     */
    @Override
    public E next() {
        if (hasNext()) {
            E returned = (E) next.getData();
            next = next.getNext();
            return returned;
        }
        throw new NoSuchElementException();
    }
}
