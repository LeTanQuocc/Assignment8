
package arrayslistbaitap;

import java.util.ArrayList;
import java.util.Scanner;

public class Baitapvearraylist {
    public static ArrayList<Integer>Nhap(ArrayList<Integer> mang) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so luong phan tu:" );
        int scan = scanner.nextInt();
        for ( int i = 0 ; i < scan ; i++)
        {
            System.out.print("phan tu thu "+ (i+1)+" la :");
            mang.add(scanner.nextInt());
        }
        return mang;
    }
    
    public static void Xuat(ArrayList<Integer> mang) {
        System.out.println("----------------------");
        for( int i = 0; i < mang.size() ; i++ )
        {
            System.out.print("phan tu thu "+(i+1)+"la:"     + mang.get(i));
            System.out.println("");
        }
        
    }
    
    public static int  Max2(ArrayList<Integer> mang) {
        int max1, max2;
        if (mang.get(0) > mang.get(1)) {
            max1 = mang.get(0);
            max2 = mang.get(1);
        } else {
            max1 = mang.get(1);
            max2 = mang.get(0);
        }
        for (int i = 2; i < mang.size(); i++) {
            int num = mang.get(i);
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }
        return max2;
    }
    public static void Xoa(ArrayList<Integer> mang) {
        mang.removeIf(scan -> (scan % 2 != 0));
        System.out.println("mang so chan " + mang);
        
    }
}
