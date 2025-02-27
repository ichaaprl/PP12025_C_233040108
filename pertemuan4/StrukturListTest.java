	package pertemuan4;
	
	public class StrukturListTest {
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList list = new StrukturList();

        // 2. Tambah elemen 3 di akhir list
        list.addTail(3);

        // 3. Tambah elemen 4 di akhir list
        list.addTail(4);

        // 4. Tambah elemen 7 di index 2
        list.addMid(7, 2);

        // 5. Tambah elemen 8 di index 2
        list.addMid(8, 2);

        // 6. Tambah elemen 5 di awal list
        list.addHead(5);

        // 7. Tampilkan elemen list
        list.displayElement();

    }
}

//TUGAS

//public class StrukturListTest {
//    public static void main(String[] args) {
//        // Pengujian pertama: 2.1 3.4 4.5
//        System.out.println("Pengujian 1:");
//        StrukturList list1 = new StrukturList();
//        list1.addTail(2.1);
//        list1.addTail(3.4);
//        list1.addTail(4.5);
//        list1.displayElement(); // Output: 2.1 3.4 4.5
//
//        // Pengujian kedua: 3.4 2.1 1.1 4.5 5.5
//        System.out.println("Pengujian 2:");
//        StrukturList list2 = new StrukturList();
//        list2.addTail(3.4);
//        list2.addMid(2.1, 2);
//        list2.addMid(1.1, 3);
//        list2.addTail(4.5);
//        list2.addTail(5.5);
//        list2.displayElement(); // Output: 3.4 2.1 1.1 4.5 5.5
//    }
//}