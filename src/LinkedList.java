import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Defines the structure of a LinkedList.
 *
 * @param <T> Generic type used in the LinkedList
 * @author Mason Rein
 * @version 11.0.12
 */
public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private int size;
    private Node<T> tail;

    /**
     * Creates a LinkedList containing the elements of the passed in Array.
     *
     * @param pushedArray Array passed in for LinkedList
     */
    public LinkedList(T[] pushedArray) {
        size = 0;
        for (int i = 0; i < pushedArray.length; ++i) {
            this.add(size, pushedArray[i]);
        }
    }

    /**
     * Creates an empty LinkedList with a size 0.
     */
    public LinkedList() {
        head = null;
        size = 0;
        tail = null;
    }

    /**
     * Adds a node containing passed in data to the first index in the LinkedList.
     *
     * @param element data we are adding to the list
     */
    @Override
    public void add(T element) {
        if (element == null) {
            throw new IllegalArgumentException();
        }
        Node newItem = new Node(element);
        Node temp = head;
        newItem.setNext(temp);
        head = newItem;
        size++;
    }

    /**
     * Adds a node containing passed in data to the specified index.
     *
     * @param index   index to add the element
     * @param element data we are adding to the list
     */
    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if (element == null) {
            throw new IllegalArgumentException();
        } else {
            Node newItem = new Node(element);
            if (isEmpty()) {
                head = newItem;
            } else if (index == 0) {
                Node second = head;
                head = newItem;
                head.setNext(second);
            } else if (index == size) {
                tail.setNext(newItem);
                tail = newItem;
            } else {
                int indexCounter = 0;
                Node pointer = head;
                while (pointer != null && indexCounter != index - 1) {
                    indexCounter++;
                    pointer = pointer.getNext();
                }
                if (pointer == null) {
                    throw new IndexOutOfBoundsException();
                }
                Node afterNode = pointer.getNext();
                pointer.setNext(newItem);
                newItem.setNext(afterNode);
            }
            size++;
        }
    }

    /**
     * Removes the node at the specified index of the LinkedList and returns data in the node.
     *
     * @param index index of element to be removed
     * @return Data of the removed node
     */
    @Override
    public T remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            if (size == 1) {
                Object data = head.getData();
                head.setData(null);
                head = null;
                tail = null;
                size--;
                return (T) data;
            } else if (index == 0) {
                size--;
                return remove();
            } else {
                Node pointer = head;
                Node last = head;
                int indexCounter = 0;
                while (pointer != null && indexCounter != index - 1) {
                    indexCounter++;
                    last = pointer;
                    pointer = pointer.getNext();
                }
                if (pointer == null) {
                    throw new IndexOutOfBoundsException();
                }
                Node temp = pointer.getNext();
                pointer.setNext(pointer.getNext().getNext());
                if (index == size() - 1) {
                    tail = last;
                }
                size--;
                return (T) temp.getData();
            }
        }
    }

    /**
     * Removes the first node that contains the passed in data.
     *
     * @param element data to be removed
     * @return Data in the removed node
     */
    @Override
    public T remove(T element) {
        if (element == null) {
            throw new IllegalArgumentException();
        }
        Node pointer = head;
        while (pointer != null && !pointer.getNext().getData().equals(element)) {
            pointer = pointer.getNext();
        }
        if (pointer == null) {
            throw new NoSuchElementException();
        }
        Object data = pointer.getNext().getData();
        pointer.getNext().setData(null);
        pointer.setNext(pointer.getNext().getNext());
        size--;
        return (T) data;
    }

    /**
     * Removes the first node in the Linked list.
     *
     * @return Data contained in the first node
     */
    @Override
    public T remove() {
        if (isEmpty()) {
            return null;
        }
        Object data = head.getData();
        head.setData(null);
        if (size == 1) {
            tail = null;
        }
        head = head.getNext();
        size--;
        return (T) data;

    }

    /**
     * Gets data contained in the node of the specified index.
     *
     * @param index index of the element to return
     * @return Data of the specified node
     */
    @Override
    public T get(int index) {
        int indexCounter = 0;
        Node<T> pointer = head;
        while (pointer != null && indexCounter != index) {
            indexCounter++;
            pointer = pointer.getNext();
        }
        if (pointer == null) {
            throw new IndexOutOfBoundsException();
        }
        return pointer.getData();
    }

    /**
     * Determines if the LinkedList contains the data passed in one of the nodes.
     *
     * @param element data to check for in list
     * @return Boolean of if the LinkedList contains the specified element
     */
    @Override
    public boolean contains(T element) {
        Node<T> pointer = head;
        while (pointer != null) {
            if (pointer.getData().equals(element)) {
                return true;
            }
            pointer = pointer.getNext();
        }
        throw new NoSuchElementException();
    }

    /**
     * Sets the data of the node at the specified index to the passed in data.
     *
     * @param index   index of the element to replace
     * @param element the element to set
     * @return The data contained in the node at the given index
     */
    @Override
    public T set(int index, T element) {
        if (element == null) {
            throw new IllegalArgumentException();
        }
        int indexCounter = 0;
        Node<T> pointer = head;
        while (pointer != null && indexCounter != index) {
            indexCounter++;
            pointer = pointer.getNext();
        }
        if (pointer == null) {
            throw new IndexOutOfBoundsException();
        }
        T data = pointer.getData();
        pointer.setData(element);
        return data;
    }

    /**
     * Clears the linked list by removing all nodes.
     */
    @Override
    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    }

    /**
     * Determines if the array is empty.
     *
     * @return True if the size is 0
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Gives the size of the LinkedList.
     *
     * @return int for the number of nodes in the list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Converts the LinkedList to array.
     *
     * @return Array of all data in the LinkedList
     */
    public T[] toArray() {
        T[] returned = (T[]) new Object[size];
        Node pointer = head;
        for (int i = 0; i < returned.length; ++i) {
            returned[i] = (T) pointer.getData();
            pointer = pointer.getNext();
        }
        return returned;
    }

    /**
     * Removes the duplicate data in the LinkedList.
     */
    public void removeDuplicates() {

    }

    /**
     * Creates an iterator for the array.
     *
     * @return Iterator for this array
     */
    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<>(head);
    }
}
