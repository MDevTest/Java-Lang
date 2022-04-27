//Nome: Matheus Alves Novais - RA 2312930
import java.util.Scanner;

public class g1 {
    public static void main(String[] arg){
        int a = 0, b = 0, op = 0;
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("\n\tMenu de opçoes");
            System.out.println("\n\t1 - Adiçao(A + B)");
            System.out.println("\t2 - Subtraçao(A - B)");
            System.out.println("\t3 - Multiplicaçao(A * B)");
            System.out.println("\t4 - Divisao(A / B)");

            System.out.println("\n\tEscolha uma opçao: ");
            op = ler.nextInt();

            System.out.println("\n\tDigite o valor da variavel A: ");
            a = ler.nextInt();

            System.out.println("\n\tDigite o valor da variavel B: ");
            b = ler.nextInt();
        }

        switch (op){
            case 1:
                System.out.println("A soma de A:["+a+"] + B:["+b+"] é = "+(a + b));
                break;
            case 2:
                System.out.println("A Subtraçao de A:["+a+"] - B:["+b+"] é = "+(a - b));
                break;
            case 3:
                System.out.println("A Multiplicaçao de A:["+a+"] * B:["+b+"] é = "+(a * b));
                break;
            case 4:
                System.out.println("A Divisao de A:["+a+"] / B:["+b+"] é = "+(a / b));
                break;            
        }
    }
}