package Pertemuan3;

public class ListMain {
    public static void main(String[] args) {
    	//Asli (Latihan-4
    	StrukturList list = new StrukturList();
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);
        System.out.print("Elemen : ");
        list.displayElement();
        
        // Tes-1 latihan-4 (Output: 3 2 1)
        StrukturList list1 = new StrukturList();
        list1.addTail(3);
        list1.addTail(2);
        list1.addTail(1);
        System.out.print("Elemen Tes a : ");
        list1.displayElement();
        

        // Tes-1 latihan-4 (Output: 1 4 5 7)
        StrukturList list2 = new StrukturList();
        list2.addTail(1);
        list2.addTail(4);
        list2.addTail(5);
        list2.addTail(7);
        System.out.print("Elemen Tes b : ");
        list2.displayElement();

        // Tes-2 Latihan-5 (Output: 3 4 5)
        StrukturList list3 = new StrukturList();
        list3.addHead(5);
        list3.addHead(4);
        list3.addHead(3);
        System.out.print("Elemen Tes : ");
        list3.displayElement();

        // Tes-3 Latihan-5 (Output: 3 2 1 dan 1 4 5 7)
        StrukturList list4 = new StrukturList();
        list4.addHead(1);
        list4.addHead(2);
        list4.addHead(3);
        System.out.print("Elemen Tes a : ");
        list4.displayElement();

        StrukturList list5 = new StrukturList();
        list5.addHead(7);
        list5.addHead(5);
        list5.addHead(4);
        list5.addHead(1);
        System.out.print("Elemen Tes b : ");
        list5.displayElement();
    }
}
