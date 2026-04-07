class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class SinglylinkedList{
    Node head=null;
    void insertatstart(int data){
        Node newnode= new Node(data);
        Node ptr=head;
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=ptr;
            head=newnode;
        }
    }
    void insertend(int data){
        Node newnode=new Node(data);
        Node ptr=head;
        if(head==null){
            head=newnode;
        }
        else{
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=newnode;
        }
    }
    void insertmid(int data,int index){
        Node newnode=new Node(data);
        Node ptr=head;
        if(index==0){
            insertatstart(data);
        }
        else{
            for(int i=0;i<index-1;i++){
                ptr=ptr.next;
            }
            newnode.next=ptr.next;
            ptr.next=newnode;
        }    
    }
    void deleteatfirst(){
        Node ptr=head;
        if(head!=null){
            ptr=ptr.next;
            head=ptr;
        }
    }
    void deleteatend(){
        Node ptr=head;
        while(ptr.next.next!=null){
            ptr=ptr.next;
        }
        ptr.next=ptr.next.next;
    }
    void deleteatpos(int index){
        Node ptr=head;
        if(index==0){
            deleteatfirst();
            return;
        }
        for(int i=0;i<index-1;i++){
            ptr=ptr.next;
        }
        ptr.next=ptr.next.next;

    }
    void display(){
        Node ptr=head;
        while(ptr!=null){
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
    }
    Node reverse(){
        Node dummy=null;
        Node ptr=head;
        Node next=null;
        while(ptr!=null){
            next=ptr.next;
            ptr.next=dummy;
            dummy=ptr;
            ptr=next;
        }
        return dummy;
    }
}

class Linkedlist{
    public static void main(String[] args){
        SinglylinkedList s=new SinglylinkedList();
        s.insertend(1);
        s.insertend(5);
        s.insertend(10);
        s.insertend(20);
        s.insertend(3);
        s.insertmid(15,3);
        s.insertmid(8,5);
        //s.deleteatpos(3);
        //s.deleteatfirst();
        //s.deleteatend();
        Node start=s.reverse();
        while(start.next!=null){
            System.out.println(start.data);
            start=start.next;        }
        //s.reverse();
        s.display();
    }
}