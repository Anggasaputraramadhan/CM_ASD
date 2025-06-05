public class Queue {
    String[] plat;
    String[] totalHarga;
    int front, rear, size;
    int max;
    public Queue(int max) {
        this.max = max;
        this.plat = new String[max];
        this.totalHarga = new String[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void enqueue(String plat, String totalHarga) {
    if (isFull()) {
        System.out.println("Antrian penuh.");
        return;
    }
    rear = (rear + 1) % max;
    this.plat[rear] = plat;
    this.totalHarga[rear] = totalHarga;
    size++;
}

}
