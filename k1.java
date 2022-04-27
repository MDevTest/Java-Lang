//Nome: Matheus Alves Novais - RA 2312930
import java.util.Scanner;
import java.io.IOException;

public class k1 {
    public static void main(String[] arg) throws IOException, InterruptedException{
        int i, j, x = 3, y = 3;
        int m[][] = new int[x][y];
        Scanner ler = new Scanner(System.in);
        
        for(i = 0; i < x; i++){
            for(j = 0; j < y; j++){
                m[i][j] = ler.nextInt();
            }
        }      
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        for(i = m.length - 1; i >= 0; i--){
            for(j = m.length - 1; j >= 0; j--){
                System.out.println("L:"+i+" C:"+j+" : "+m[i][j]);
            }
        }
    }
}