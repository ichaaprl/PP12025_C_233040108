package pertemuan4;

public class Node {
    private int data;
    private Node next;

    // Konstruktor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // Getter dan Setter
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}


//TUGAS

//	public class Node {
//	    private double data; // Ubah tipe data menjadi double
//	    private Node next;
//
//    // Konstruktor
//	    public Node(double data) {
//	        this.data = data;
//	        this.next = null;
//	    }
//
//	    // Getter dan Setter
//	    public double getData() {
//	        return data;
//	    }
//
//	    public void setData(double data) {
//	        this.data = data;
//	    }
//
//	    public Node getNext() {
//	        return next;
//	    }
//
//	    public void setNext(Node next) {
//	        this.next = next;
//	    }
//	}
//
