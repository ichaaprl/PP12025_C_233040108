<<<<<<< HEAD
package Pertemuan2;

	public class Node {
	    private int nilai;
	    private Node next;

	    // Inisialisasi Node
	    public Node(int nilai) {
	        this.nilai = nilai;
	    }

	    // Setter untuk nilai
	    public void setNilai(int nilai) {
	        this.nilai = nilai;
	    }

	    // Getter untuk nilai
	    public int getNilai() {
	        return nilai;
	    }

	    // Setter untuk next
	    public void setNext(Node next) {
	        this.next = next;
	    }

	    // Getter untuk next
	    public Node getNext() {
	        return next;
	    }
	}
=======
package Pertemuan3;


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


>>>>>>> 729d374 (p3)
