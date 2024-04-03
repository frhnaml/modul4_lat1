package Latihan;

import java.util.HashMap;
import java.util.Scanner;

public class Inventory {

    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Pensil", 50);
        inventory.put("Buku", 35);
        inventory.put("Penghapus", 25);

        System.out.println("Inventory awal : " + inventory);

        inventory.put("Pensil", inventory.get("Pensil") + 20);

        inventory.remove("Penghapus");

        System.out.println("Inventory Setelah update : " + inventory);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama barang yang ingin dicari : ");
        String barang = scanner.nextLine();

        carBarang(inventory, barang);
    }

    public static void carBarang(HashMap<String, Integer> inventory, String barang) {
        if (inventory.containsKey(barang)) {
            System.out.println("Stock " + barang + " : " + inventory.get(barang) + " Unit. ");
        } else {
            System.out.println("Barang " + barang + " tidak tersedia di inventory. ");
        }
    }
}
