public class QueueYapisi {
    int dizi[];
    int size;
    int front;
    int rear;

    public QueueYapisi(int size) {
        this.size = size;
        dizi = new int[size];
        front = 0;
        rear=-1;
    }

    void enQueue(int data) {
        if (isFull()){
            System.out.println("Queue is full,ekleme yapılmaz");
        }
        else{
            rear++;
            dizi[rear] = data;
            System.out.println(dizi[rear] + "  kuyruga eklendi");
        }
    }
    void deQueue() {
        if (isEmpty()){
            System.out.println("Queue bos sılınecek eleman yok");
        }
        else{
            int sayi = dizi[front];
            for(int i=1;i<=rear;i++){
                dizi[i-1]=dizi[i];
            }
            rear--;
            System.out.println(sayi + "  Sayısı kuyruktan çıkarıldı");

        }
    }
    boolean isEmpty() {
        return rear==-1;
    }
    boolean isFull() {
        return rear==size-1;
    }
    void elemanSayisi() {
        System.out.println("eleman sayisi: "+(rear+1));
    }
    void yazdir() {
        int i=rear;
        System.out.print("son -- >");
        while(i>=0){
            System.out.print(dizi[i] + "-->");
            i--;
        }
        System.out.println("boş");

    }
}
