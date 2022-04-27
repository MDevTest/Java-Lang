//Nome: Matheus Alves Novais - RA 2312930
import java.util.Scanner;
import java.io.IOException;

public class j1 {
    public static void main(String[] arg) throws IOException, InterruptedException{
        int i = 0, n = 10;
        int v[] = new int[n];
        try(Scanner ler = new Scanner(System.in)){
            for(i = 0; i < n; i++){
                v[i] = ler.nextInt();
            }
        }      
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        for(i = 0; i < v.length; i++){
            n = n - 1;
            System.out.println("N:"+i+" : "+v[n]);
        }
    }
}