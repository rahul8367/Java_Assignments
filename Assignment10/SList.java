package Assignment10;

public class SList<T> {
    private LinkedListNode<T> head;
    public int size=0;
    SList(){
        head =new LinkedListNode(null);
    }
    SListIterator<T> iterator(){

        return new SListIterator<T>(head);
    }
    public String toString(){
        if(head == null)
            return "List is Empty";
        SListIterator<T> iterator  = new SListIterator<T>(head);
        StringBuilder listStringBuilder = new StringBuilder("[ ");
        while (iterator.hasNext()){
            listStringBuilder.append(iterator.next()).append(", ");
        }
        return listStringBuilder.toString()+" ]";

    }
}