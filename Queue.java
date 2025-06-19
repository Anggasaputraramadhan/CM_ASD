class Queue {
    int max, size, front, rear;
    String[] plat;
    String[] namaBBM;
    String[] totalHarga;

    public Queue(int n) {
        max = n;
        size = 0;
        front = rear = 0;
        plat = new String[max];
        namaBBM = new String[max];
        totalHarga = new String[max];
    }

    public void enqueue(String platNomor, String namaBBM, String totalHarga) {
    if (size == max) {
        System.out.println("Antrian penuh!");
        return;
    }
    this.plat[rear] = platNomor;
    this.namaBBM[rear] = namaBBM;
    this.totalHarga[rear] = totalHarga;
    rear = (rear + 1) % max;
    size++;
}

    }

