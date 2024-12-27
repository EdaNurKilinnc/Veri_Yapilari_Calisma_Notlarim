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

    void aradanSil(int indis){

            if(head.next==null && indis<=0){
                head=null;
                tail=null;
            }
            else if (head.next!=null && indis<0){
                head=head.next;
                head.prev=null;
            }
            else{
                 int n=0;
                 Node temp=head;
                 while(temp!=null){
                     n++;
                     temp=temp.next;
                 }

                 if (indis >= (n-1)){
                     tail=tail.prev;
                     tail.next=null;
                 }
                 else{
                     temp=head;
                     int i=0;

                     while(i<indis){
                         i++;
                         temp=temp.next;
                     }
                     temp.next.prev=temp.prev;
                     temp.prev.next=temp.next;
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
