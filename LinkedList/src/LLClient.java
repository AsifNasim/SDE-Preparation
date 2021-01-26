public class LLClient {
    public static void main(String[] args) throws Exception{
        LList list = new LList();
        list.addFirst(12);
        list.addFirst(13);
        list.addFirst(14);
        list.addFirst(15);
        list.addFirst(25);
//        LList.Node res = list.getNodeAtIndex(1);
//        System.out.println(res.data);
        list.addAtIndex(2,20);
        list.display();
//        System.out.println(list.removeFirst());
//        System.out.println("Last value of list is : "+list.removeLast());
//        System.out.println("removed node : "+ list.removeAtIndex(2));
//        list.reverseData();
//        list.reversePointer();
//        System.out.println(list.getFirst());
        System.out.println(list.midElement());
        list.display();



    }
}
