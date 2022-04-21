package Assignment10;

public class SListIterator<T> {
    private LinkedListNode<T> currentNode;
    private int size=0;
    SListIterator(LinkedListNode<T> head){
        this.currentNode = head;
    }
    public LinkedListNode<T> next(){
        currentNode = currentNode.next;
        return currentNode;
    }
    public boolean hasNext(){
        return currentNode.next != null;
    }

    public void add(T elementData){
        LinkedListNode<T> newNode = new LinkedListNode<>(elementData);
        currentNode.next = newNode;
        currentNode = currentNode.next;
        size++;
    }
    public void remove(){
        while (currentNode.next.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = null;
        size--;
    }
    public int size(){
        return size;
    }
}