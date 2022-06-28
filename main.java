import java.util.Arrays;
import java.util. Scanner;
public class DiziSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Diziniz kaç elemanlı olacak? Eleman Sayısını Giriniz :");
        int k = input.nextInt();
        int[] list = new int[k];
        for(int i = 0; i<k; i++){
            System.out.print((i+1) + ".Sayı :"); list[i] = input.nextInt();

        }

        boolean sorted = true;
        for(int i =0; i<k-1; i++){
            for(int j = i+1; j<k; j++)
            if(list[i] > list[j]){
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                sorted = false;
            }
        }
        System.out.println("Artarak Ardışık sıralanmış dizi :" + Arrays.toString(list));
        

    }
    
}
