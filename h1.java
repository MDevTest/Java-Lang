//Nome: Matheus Alves Novais - RA 2312930
import java.util.Scanner;

public class h1 {
    public static void main(String[] arg){
        int a;
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite um valor para descobrir se é impar ou par");
            a = ler.nextInt();
        }
        if(a%2==0){
            System.out.println(+a+" é Par");
        }else{
            System.out.println(+a+" é Impar");
        }
    }
}