public class TekYonluListeYapisi {
    Node head = null;
    Node tail = null;

    void basaekle (int x){

        Node eleman = new Node();
        eleman.data=x;

        if (head == null){
            eleman.next=null;
            head=eleman;
            tail=eleman;
        }
        else{
            eleman.next = head;
            head=eleman;

        }}

    void sonaekle (int x){
        Node eleman = new Node();
        eleman.data=x;
        if (head == null){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("liste olusturuldu, ilk elleman eklendı");

        }else{

            tail.next = eleman;
            tail=eleman;
            System.out.println(" sona eleman eklendı");
        }
    }

    void arayaelemanekle (int indis ,int x){
        Node eleman = new Node();
        eleman.data=x;
        if (head == null && indis==0){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("liste olusturuldu, ilk elleman eklendı");
        }
        else if ( head !=null && indis==0)
        {
            eleman.next=head;
            head=eleman;
            System.out.println( indis + "indisimci eleman sıraya eklendı");

        }
        else{
            int n=0;

            Node temp = head;
            Node temp2=head;
            while (temp.next!=null){
                n++;
                temp2=temp;
                temp=temp.next;
            }
            if (n ==indis){
                temp2.next=eleman;
                eleman.next=temp;
                System.out.println("eleman eklendı");
            }
            else{
                temp=head;
                temp2=head;
                int i=0;
                while (i!=indis){
                    temp2=temp;
                    temp=temp.next;
                    i++;
                }
                temp2.next=eleman;
                eleman.next=temp;

                System.out.println(indis+"sıraya yenı eleman eklendı");
            }



        }
    }

    void basSil(){
        if (head == null){
            System.out.println("liste bos silinecek nesne yok");
        }
        else if (head.next == null){
            head=null;
            tail=null;
            System.out.println("listede kalan son eleman da silindi");
        }
        else{
            head=head.next;
            System.out.println("baştaki eleman silindi");
        }
    }

    void sondanil(){
        if (head == null){
            System.out.println("liste bos silinecek nesne yok");
        }
        else if (head.next == null){
            head=null;
            tail=null;
            System.out.println("listede kalan son eleman da silindi");
        }
        else{
            Node temp = head;
            Node temp2=head;

            while (temp.next!=null){
                 temp2=temp;
                 temp=temp.next;

            }
            temp2.next=null;
            tail=temp;
            System.out.println("sondaki eleman silindi");
        }
    }

    void yazdir()
    { if (head==null) {
        System.out.println("liste bos");
    }
    else{
        Node temp= head;
        while (temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }


    }

}
