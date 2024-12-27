public class ListeYapisi {
    Node head = null;
    Node tail = null;
    void ekle(int x){
        Node eleman = new Node();
        eleman.data=x;
        eleman.next = null;

        if (head ==null){
            head=eleman;
            tail=eleman;
            System.out.println("Liste olusturuldu ve ılk dugum parametre eklendı");

        }
        else{
            tail.next = eleman;
            tail=eleman;
            System.out.println("listenin sonuna yeni bir eleman eklendi");
        }

    }
    void yazdir(){
        if (head == null){
            System.out.println("Lşste yapısı boş !!!");
        }
        else {
            Node temp = head;
            System.out.println("\nbas->");

            while (temp != null) {
                System.out.print(temp.data + "->");
                temp= temp.next;
            }
            System.out.println("son.");
        }

    }
}
