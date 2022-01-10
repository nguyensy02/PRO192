import java.util.Scanner;

/**
 *
 * @author SyNguyen
 */
public class TimPhanTuLonNhatTungCotMang2Chieu {
    public int max(int[] arr) {
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dong,cot,d,c;
        System.out.println("Nhap so dong: ");
        dong = sc.nextInt();
        System.out.println("Nhap so cot: ");
        cot = sc.nextInt();
        int[][] arr2D = new int[dong][cot];
        System.out.println("Moi nhap cac phan tu trong mang: ");
        for (d=0;d<dong;d++) {
            for (c=0;c<cot;c++) {
                System.out.println("x["+d+"]["+c+"]");
                arr2D[d][c] = sc.nextInt();
            }
        }    
        System.out.println(arr2D[1][1]);
        for (c=0;c<cot;c++) {
            int max = arr2D[0][c];
            for (d=0;d<dong;d++) {
                if (arr2D[d][c] > max) {
                    max = arr2D[d][c];
                }
            }
            System.out.println("Phan tu lon nhat cua cot "+(c+1) +" la : " + max);
        }
    }
}
