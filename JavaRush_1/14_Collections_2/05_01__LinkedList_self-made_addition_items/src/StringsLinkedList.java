public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node lastNode = last.prev;
        Node newNode = new Node();
        newNode.value = value;
        if (first.next != null) {
            newNode.prev = lastNode;
            lastNode.next = newNode;
        } else {
            first.next = newNode;
        }
        last.prev = newNode;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}