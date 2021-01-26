public class LList {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }

    }

    private Node head;
    private Node tail;
    private int size;

//    display method (O(n))
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println("=========================");
    }

//    Get First (O(1))
    public int getFirst()throws Exception{
        Node temp = this.head;
        if(this.size == 0){
            throw new Exception("LL is Empty");
        }

        return temp.data;
    }

//    Get Last (O(1))
    public int getLast()throws Exception{
        Node temp = this.head;
        if(this.size == 0){
            throw new Exception("LL is Empty");
        }
        if(size == 1){
            return getFirst();
        }

        return this.tail.data;
    }

//    Get at Index O(n)
    public int getAtIndex(int index)throws Exception{
        Node temp = this.head;
        if(this.size == 0){
            throw new Exception("LL is Empty");
        }
        if(index < 0 || index > this.size){
            throw new Exception("Invalid Index");
        }

        if(size == 1){
            return getFirst();
        }

        int i =0;
        while (temp != null){
            if(i == index){
                return temp.data;
            }
            i++;
            temp = temp.next;
        }
        throw new Exception("Node data not found");
    }

//    Get Node at Index
    public Node getNodeAtIndex(int index) throws Exception{
        Node temp = this.head;
        if(this.size == 0){
            throw new Exception("LL is Empty");
        }
        if(index < 0 || index > this.size){
            throw new Exception("Invalid Index");
        }

        if(size == 1){
            return temp;
        }

        int i =0;
        while (temp != null){
            if(i == index){
                return temp;
            }
            i++;
            temp = temp.next;
        }

        throw new Exception("Node not found!");
    }

//    Add Last (O(1))
    public void addLast(int data)throws Exception{
//    For review
        Node newNode = new Node(data);
        if(size >= 1){
            this.tail.next = newNode;

        }
        if(this.size == 0){
            this.head= newNode;
            this.tail = newNode;
            this.size++;
        }else{
            this.tail = newNode;
            this.size++;
        }
    }
//      Add First O(1)
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(size >= 1){
            newNode.next = head;
        }
        if(size == 0){
            this.head = newNode;
            this.tail = newNode;
            this.size++;
        }else{
            this.head= newNode;
            this.size++;
        }

    }

//    Add at index O(n)
    public void addAtIndex(int index, int data)throws Exception{
        Node newNode = new Node(data);
        if(index < 0 || index > this.size){
            throw new Exception("Invalid Index");
        }

        if(index== 0){
            addFirst(data);
        }
        else if(index== this.size){
            addLast(data);
        }
        else{
            Node prev = getNodeAtIndex(index-1);
            Node curr = prev.next;
            newNode.next = curr;
            prev.next = newNode;
            this.size++;
        }
    }

// Remove First O(n)
    public int removeFirst()throws Exception{
        int retVal = this.head.data;
        if(size == 0){
            throw new Exception("List is empty");
        }

        if(size == 1){
            this.head = null;
            this.tail = null;
            this.size = 0;
        }
        else{

            this.head = this.head.next;
            this.size--;
        }

        return retVal;
    }

//    Remove Last O(n)
    public int removeLast() throws Exception {
        Node prev = this.head;
        Node curr = prev.next;

        if(size == 0){
            throw new Exception("List is Empty");
        }

        while (curr.next != null){
            prev = prev.next;
            curr = curr.next;
        }
        int retVal = curr.data;
        prev.next = null;
        this.size--;

        return retVal;
    }

//    RemoveLast Alternate approach O(n)
    public int removeLastAlt() throws Exception{
        if (this.size == 0) {
            throw new Exception("LL is empty.");
        }

        int rv = this.tail.data;

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        } else {
            Node sizem2 = getNodeAtIndex(this.size - 2);
            this.tail = sizem2;
            this.tail.next = null;
            this.size--;
        }

        return rv;
    }

//    Remove at Index o(n)
    public int removeAtIndex(int index)throws Exception{
        Node indexNode = getNodeAtIndex(index-1);
        int retVal = indexNode.next.data;
        if (size == 0){
            throw new Exception("list is Empty");
        }
        if(index < 0 || index > this.size){
            throw new Exception("Invalid Index");
        }


        if(index == 0){
            return removeFirst();
        }

        if(index == this.size-1){
            return removeLast();
        }else{
            indexNode.next = indexNode.next.next;
            this.size--;
        }
        return retVal;
    }

//    Reverse Data O(n)
    public void reverseData() throws Exception {
        if(size == 0){
            throw new Exception("Empty List");
        }

        int left  = 0;
        int right = this.size-1;
        while (left < right){
            Node leftNode = getNodeAtIndex(left);
            Node rightNode = getNodeAtIndex(right);
            int temp = leftNode.data;
            leftNode.data = rightNode.data;
            rightNode.data = temp;
            left++;
            right--;
        }
    }

//    Reverse Pointer
    public void reversePointer()throws Exception{
        if(size == 0){
            throw new Exception("List is Empty");
        }
        int left = 0;
        int right = this.size -1;
        Node ln = getNodeAtIndex(left);
        Node rn = getNodeAtIndex(right);

        while (left < right){
            Node temp = ln;
            ln = rn;
            rn = temp;
            left++;
            right--;
        }
    }

    //    Reverse Pointer Recursively
        public void reversePointerRecursively() throws Exception {
        if(size == 0){
            throw new Exception("List is Empty");
        }
        int left = 0;
        int right = this.size-1;
        
        }
    //    Mid Element

    public int midElement(){
        Node slow = this.head;
        Node fast = this.head;

        while (fast.next != null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }


}
