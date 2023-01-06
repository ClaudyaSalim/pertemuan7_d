package pertemuan7;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	
	Vector<Product> listProduk = new Vector<>();

	public Main() {
		// code
		int menu=0;
		
		do {
			
			System.out.println("Toko Jual Beli");
			System.out.println("");
			System.out.println("1. Tambah Produk");
			System.out.println("2. Lihat Produk");
			System.out.println("3. Edit Produk");
			System.out.println("4. Hapus Produk");
			System.out.println("5. Exit");
			
			// Exception handling -> cara nanganin error
			// try & catch
			
			try {
				System.out.print("Input menu: ");
				menu = scan.nextInt(); scan.nextLine();
			}
			catch (InputMismatchException e) {
				scan.nextLine();
//				e.printStackTrace(); // mau tampilin error dalam format java
				System.out.println("Menu harus dalam bentuk angka");
			}
			finally { // buat bikin codingan yang bakal jalan mau error ataupun ga
				System.out.println("Operasi sudah selesai");
				System.out.println();
				System.out.println();
			}
			
//			switch(menu) {
//			case 1:
//				add();
//				break;
//			case 2:
//				view();
//				break;
//			case 3:
//				edit();
//				break;
//			}
			
		} while (menu!=5);
		
		
		
	}

	public static void main(String[] args) {
		
		new Main();

	}
	
	public void add() {
		String nama; int harga; String kategori;
		
		System.out.print("Input nama produk: ");
		nama = scan.nextLine();
		System.out.print("Input harga produk: ");
		harga = scan.nextInt(); scan.nextLine();
		System.out.println("Input kategori produk: ");
		kategori = scan.nextLine();
		
		Product newProduct = new Product(nama, harga, kategori);
		
		listProduk.add(newProduct);
		System.out.println("Produk telah ditambahkan!");
	}
	
	public void view() {
		System.out.println("List produk: ");
		System.out.println();
		for(int i=0; i<listProduk.size(); i++) {
			System.out.println(i+1);
			System.out.println("Nama produk: " + listProduk.get(i).getNama());
			System.out.println("Harga produk: " + listProduk.get(i).getHarga());
			System.out.println("Kategori produk: " + listProduk.get(i).getKategori());
			System.out.println();
		}
	}
	
	public void edit() {
		System.out.print("Input urutan produk yang ingin diedit: ");
		int index = scan.nextInt(); scan.nextLine();
		
		String nama; int harga; String kategori;
		
		System.out.print("Input nama baru produk: ");
		nama = scan.nextLine();
		System.out.print("Input harga baru produk: ");
		harga = scan.nextInt(); scan.nextLine();
		System.out.println("Input kategori baru produk: ");
		kategori = scan.nextLine();
		
		Product newProduct = new Product(nama, harga, kategori);
		
		listProduk.set(index-1, newProduct);
		
		System.out.println("Produk telah diedit!");
	}

}
