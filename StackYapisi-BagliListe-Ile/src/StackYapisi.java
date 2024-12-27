public class StackYapisi {
    int size;
    int cnt;
    Node top;

    public StackYapisi(int size) {
        this.size=size;
        cnt=0;
        top=null;
    }
    void push(int data){
        Node eleman=new Node(data);
        if (iisFull()){
          System.out.println("Stack is full");
        }
        else{
            if (isEmpty()){
                top=eleman;
                System.out.println(top.data+"  stacke ilk eleman olarak eklendi");
            }
            else{
                eleman.next=top;
                top=eleman;

            }
            cnt++;
        }
    }

    void pop(){
        if (isEmpty()){
            System.out.println("Stack bos,cıkartacak eleman yok");
        }
        else{
            System.out.println(top.data+"çıkarıldı");
            top=top.next;
            cnt--;
        }
    }

    void print(){
        if (isEmpty()){
            System.out.println("stack bos yazdıracak bı sey yok");
        }
        else{
            Node temp=top;
            System.out.println("stack deki veriler \n");

            while(temp!=null) {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

     void topGoster(){
        if (isEmpty()){
            System.out.println("stack bos");
        }
        else{
            System.out.println("en ustteki düğümün datası;"+top.data);
        }
     }
    boolean iisFull(){
        return cnt==size;
    }
    boolean isEmpty(){
        return cnt==0;
    }
}
