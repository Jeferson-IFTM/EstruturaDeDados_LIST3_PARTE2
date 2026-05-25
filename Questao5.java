package EstruturaDeDados.JEFERSON.TEST;

public class Questao5 {
    public static <T extends Comparable<T>> void removeNthFromEnd(MyLinkedList<T> list, int n) {
        if (list.getHead() == null || n <= 0) return;

        MyLinkedList.Node<T> fast = list.getHead();
        MyLinkedList.Node<T> slow = list.getHead();

        for (int i = 0; i < n; i++) {
            if (fast == null) return;
            fast = fast.next;
        }

        if (fast == null) {
            list.setHead(list.getHead().next);
            list.setSize(list.size() - 1);
            if (list.getHead() == null) list.setTail(null);
            return;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        if (slow.next == null) list.setTail(slow);
        list.setSize(list.size() - 1);
    }
}