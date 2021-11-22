public class FlloydAlgorithm {


    static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {

        Node n = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.next=n2;
        n.next=n1;
        n2.next=n3;
        n3.next=n5;
        n5.next=n4;
        n4.next=n6;
        n6.next=n3;

        System.out.println(flloyd(n));

    }

    private static int flloyd(Node n) {
        /*
        Flloyd's algorithm is used to find a loop in a linked list.
        It goes like:
        start two pointers, and move them, one with a speed of 1x
        and other with a speed of 2x.
         */
        Node r = n.next.next;
        Node t = n.next;

        while(t!=r){
            t=t.next;
            r=r.next.next;
        }
        System.out.println("Rabbit at  "+r.value+" and tortoise at "+t.value+" collide.");
        r=n;

        while(r!=t){
            r=r.next;
            t=t.next;
        }
        System.out.println("Moving one step from t, and moving r from starting, they meet at point of loop starting "+t.value);
        return t.value;
    }
}
