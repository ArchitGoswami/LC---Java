

import java.util.*; 
class MainCall{
    public static void main(String[] args){
        Node initNode = new Node("SFO");
        LinkedList llTest = new LinkedList(initNode);
        llTest.add("NYC");
        llTest.add("DXB");
        llTest.add("DEL");
        llTest.add("ADL");
        System.out.println(llTest.llPrint());
        llTest.del();
        System.out.println(llTest.llPrint());
        llTest.del();
        System.out.println(llTest.llPrint());
    }
}

class Node{
    String data;
    Node next;

    Node(String dataRecieved){
        data = dataRecieved;
        next = null;
    }
}

class LinkedList{
    Node head;
    LinkedList(Node initNode){ // forces us to initialize linked list with atleast one element.
        head = initNode;
    }

    public void add(String data){ //adds node to end

        // create nodeToAdd node using String data and next as null
        Node nodeToAdd = new Node(data);
        Node currentNode = head;
        Boolean endCheck = false;
        // itterate through LL
        while(!endCheck){
            if (currentNode.next == null){
                currentNode.next = nodeToAdd;
                endCheck = true;
            }
            else{
                Node temp = currentNode.next;
                currentNode = temp;
            }
        }
        // if currentNode.next = null then make nodeToAdd as current node's next
        // make currentNode.next = the next node
    }

    public void del(){ // deletes last node
        
        Node currentNode = head;
        Boolean endCheck = false;
        Node prevNode = new Node("Null");

        while(!endCheck){
            if (currentNode.next == null){
                prevNode.next = null;
                endCheck = true;
            }
            else{
                prevNode = currentNode;
                Node temp = currentNode.next;
                currentNode = temp;
            }
        }
    }

    public String llPrint(){
        Node currentNode = head;
        Boolean endCheck = false;
        List<String> outList = new ArrayList<String>();

        while(!endCheck){
            if (currentNode.next == null){
                endCheck = true;
            }
            else{
                Node temp = currentNode.next;
                outList.add(currentNode.data);
                currentNode = temp;
            }
        }
        return String.join(", ",outList);
    }
}