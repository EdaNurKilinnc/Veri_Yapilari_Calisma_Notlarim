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

    void arayaEkle(int indis , int data) {
        Node eleman = new Node(data);

        if (head == null) {
            head = eleman;
            tail = eleman;
        } else if (head != null && indis==0 ){
            eleman.next=head;
            head.prev=eleman;
            head=eleman;
        }
        else{
            int i=0;
                Node temp= head;
                while (temp!=null){
                    temp=temp.next;
                    i++;
                }

                temp=head;
                if (indis>i){
                    tail.next=eleman;
                    eleman.prev=tail;
                    tail=eleman;
                }
                else{
                    int j=0;
                    while (j!=indis){
                        temp=temp.next;
                        j++;
                    }
                    eleman.prev=temp.prev;
                    temp.prev.next=eleman;
                    eleman.next=temp;
                    temp.prev=eleman;

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
