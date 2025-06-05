public class Node24 {
    Kendaraan data;
    Node24 prev;
    Node24 next;

    Node24(Kendaraan data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoubleLinkedList24 {
    Node24 head;
    Node24 tail;

    DoubleLinkedList24() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addLast(Kendaraan data) {
        Node24 newNode = new Node24(data);
        if(isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println(">> Kendaraan masuk kedalam antrian.");
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
        } else {
            Node24 current = head;
            System.out.println("== Isi Kendaraan ==\nAntrian Kendaraan:");
            while (current != null) {
                current.data.tampilkanInformasi();
                current = current.next;
            }
        }
    }
    
    void layaniKendaraan() {
        if (isEmpty()) {
            System.out.println("tdk ada kendaraan dalam antrian");
            return;
        }
        Kendaraan datalayani = head.data;
        System.out.println("Petugas melayani " + datalayani.platNomor);
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void getIndex(int index) {
        if (index < 0 || isEmpty()) {
            System.out.println("Indeks tidak valid atau list kosong.");
            return;
        }
    
        Node24 current = head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
    
        if (current == null) {
            System.out.println("Indeks melebihi jumlah node.");
        } else {
            System.out.println("Data pada indeks " + index + ":");
            current.data.tampilkanInformasi();
        }
    }

    int size() {
        int count = 0;
        Node24 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    
    
}
