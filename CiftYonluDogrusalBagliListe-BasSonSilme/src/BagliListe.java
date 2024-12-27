public class BagliListe {
    Node head=null;
    Node tail=null;

    void basaEkle(int data){
        Node eleman=new Node(data);

        if (head==null){
            head=eleman;
            tail=eleman;
        }
        else{
            eleman.next=head;
            head.prev=eleman;
            head=eleman;
        }
    }
    void sonaEkle(int data) {
        Node eleman = new Node(data);

        if (head == null) {
            head = eleman;
            tail = eleman;
        } else {
            tail.next=eleman;
            eleman.prev=tail;
            tail=eleman;
        }
    }

    void basSil(){
        if (head!=null){
            if(head.next==null){
                head=null;
                tail=null;
            }
            else{
                head=head.next;
                head.prev=null;
            }
        }
    }

    void sonSil(){
        if (head!=null){
            if(head.next==null){
                head=null;
                tail=null;
            }
            else{
                tail=tail.prev;
                tail.next=null;
            }
        }
    }


    void yazdir(){
        Node temp=head;
        System.out.println("Baş->");
         while(temp!=null){
             System.out.println(temp.data);
             temp=temp.next;
         }


    }
}
