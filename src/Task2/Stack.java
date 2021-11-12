package Task2;

import java.util.Iterator;

public class Stack implements Iterable<Node> {
    private Node head;

    public Stack() {
        this.head = null;
    }

    public void push(int a) {
        head = new Node(head, a);
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("pop from empty stack!");
        }
        final int result = head.getData();
        if (!iterator().hasNext()){
            head = head.getNext();

        }
        return result;
    }

    public void clear() throws Exception {
        while (!isEmpty()) {
            pop();
        }
    }


    public boolean isEmpty() {
        return (this.head == null);
    }

    @Override
    public String toString() {
        Node currentHead = head;
        StringBuilder result = new StringBuilder("[ ");
        while (currentHead != null) {
            result.append(currentHead.getData()).append(", ");
            currentHead = currentHead.getNext();
        }
        result.append("]");
        return result.toString();
    }

    class NodeIterator implements Iterator<Node> {
        private Node current = head;

        public boolean hasNext() {
            return current.getNext() != null;
        }

        public Node next() {
            return  this.current.getNext();
        }

    }

    public Iterator<Node> iterator() {
        return new NodeIterator();
    }
}
