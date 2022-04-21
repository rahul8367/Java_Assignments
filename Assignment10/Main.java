package Assignment10;

public class Main {
    public static void main(String[] args) {
        SList<String> sList = new SList<>();
        SListIterator<String> addElement = sList.iterator();
        addElement.add("hello");
        addElement.add("World");
        addElement.add("New world");
        System.out.println(sList);

        SListIterator<String> removeElement = sList.iterator();
        removeElement.remove();
        System.out.println(sList);

    }
}