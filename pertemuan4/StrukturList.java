	package pertemuan4;
	
	public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    //fungsi untuk mengecek apakah list kosong
    public boolean isEmpty() {
        return HEAD == null;
    }

    // Fungsi untuk menambahkan elemen di akhir list (addTail)
    public void addTail(int data) {
        Node posNode = null, curNode = null;
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    // Fungsi untuk menambahkan elemen di awal list (addHead) (Latihan-5)
    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    // Fungsi untuk menambahkan elemen di posisi tengah list (addMid)
    public void addMid(int data, int position) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            if (position == 1) { // Tambah di awal
                newNode.setNext(curNode);
                HEAD = newNode;
            } else {
                int i = 1;
                Node posNode = null;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                if (posNode != null) {
                    posNode.setNext(newNode);
                    newNode.setNext(curNode);
                }
            }
        }
    }

    // Fungsi untuk menampilkan elemen list (Latihan-3)
    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }
}



//TUGAS
//	package pertemuan4;
//	public class StrukturList {
//    private Node HEAD;
//
//    public StrukturList() {
//        this.HEAD = null;
//    }
//
//    // Fungsi untuk mengecek apakah list kosong
//    public boolean isEmpty() {
//        return HEAD == null;
//    }
//
//    // Fungsi untuk menambahkan elemen di akhir list (addTail)
//    public void addTail(double data) {
//        Node newNode = new Node(data);
//        if (isEmpty()) {
//            HEAD = newNode;
//        } else {
//            Node curNode = HEAD;
//            while (curNode.getNext() != null) {
//                curNode = curNode.getNext();
//            }
//            curNode.setNext(newNode);
//        }
//    }
//
//    // Fungsi untuk menambahkan elemen di awal list (addHead)
//    public void addHead(double data) {
//        Node newNode = new Node(data);
//        if (isEmpty()) {
//            HEAD = newNode;
//        } else {
//            newNode.setNext(HEAD);
//            HEAD = newNode;
//        }
//    }
//
//    // Fungsi untuk menambahkan elemen di posisi tertentu (addMid)
//    public void addMid(double data, int position) {
//        Node newNode = new Node(data);
//
//        if (position <= 1 || isEmpty()) {
//            addHead(data);
//            return;
//        }
//
//        Node curNode = HEAD;
//        Node prevNode = null;
//        int index = 1;
//
//        while (curNode != null && index < position) {
//            prevNode = curNode;
//            curNode = curNode.getNext();
//            index++;
//        }
//
//        prevNode.setNext(newNode);
//        newNode.setNext(curNode);
//    }
//
//    // Fungsi untuk menampilkan elemen list
//    public void displayElement() {
//        Node curNode = HEAD;
//        while (curNode != null) {
//            System.out.print(curNode.getData() + " ");
//            curNode = curNode.getNext();
//        }
//        System.out.println();
//    }
//}
//
