package arrayslistbaitap;

import java.util.ArrayList;
import java.util.Scanner;

public class menuarraylist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> mang = new ArrayList<>();
        String Ktra ; 

        while (true) {
            System.out.println("\n-------- Menu --------");
            System.out.println("1.Nhap Mang");
            System.out.println("2.Xuat Mang");
            System.out.println("3.Phan Tu Max 2 Trong mang");
            System.out.println("4.Xoa So Le Trong Mang");
            System.out.print("Chon Menu: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    mang = Baitapvearraylist.Nhap(mang);
                    break;
                case 2:
                    Baitapvearraylist.Xuat(mang);
                    break;
                case 3:
                    System.out.println("So lon thu 2 trong mang la: " + Baitapvearraylist.Max2(mang));
                    break;
                case 4:
                    Baitapvearraylist.Xoa(mang);
                    break;
                default:
                    System.out.println("Lua chon khong dung . Vui long chon lai . Xin cam on");
            }
        }
    }
}
