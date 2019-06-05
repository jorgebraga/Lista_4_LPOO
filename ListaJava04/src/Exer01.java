
/**
 *Lista 03 Java, Questão 1
 *Professor: Aldo Henrique
 *Disciplina: LPOO
 *
 * @author Jorge
 */
import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        int a, b, c, d, e;
        Scanner scan = new Scanner(System.in);

        System.out.print(" Entre com o primeiro valor: ");
        a = scan.nextInt();

        System.out.print(" Entre com o segundo valor: ");
        b = scan.nextInt();

        System.out.print(" Entre com o terceiro valor: ");
        c = scan.nextInt();

        System.out.print(" Entre com o quarto valor: ");
        d = scan.nextInt();

        System.out.print(" Entre com o quinto valor: ");
        e = scan.nextInt();

        if (a > b && a > c && a > d && a > e) {

            System.out.println(a + " é o maior valor inteiro");
        }

        if (b > a && b > c && b > d && b > e) {

            System.out.println(b + " é o maior valor inteiro");
        }

        if (c > a && c > b && c > d && c > e) {

            System.out.println(c + " é o maior valor inteiro");
        }

        if (d > a && d > b && d > c && d > e) {

            System.out.println(d + " é o maior valor inteiro");
        }

        if (e > a && e > b && e > c && e > d) {

            System.out.println(e + " é o maior valor inteiro");
        }

        if (a < b && a < c && a < d && a < e) {

            System.out.println(a + " é o menor valor inteiro");
        }

        if (b < a && b < c && b < d && b < e) {

            System.out.println(b + " é o menor valor inteiro");
        }

        if (c < a && c < b && c < d && c < e) {

            System.out.println(c + " é o menor valor inteiro");
        }

        if (d < a && d < b && d < c && d < e) {

            System.out.println(d + " é o menor valor inteiro");
        }

        if (e < a && e < b && e < c && e < d) {

            System.out.println(e + " é o menor valor inteiro");
        }

    }

}
