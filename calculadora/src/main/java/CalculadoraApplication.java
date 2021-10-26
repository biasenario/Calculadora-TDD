import java.util.Scanner;


public class CalculadoraApplication {

    public static void main( String args[] ){

        Scanner entrada = new Scanner(System.in);

        System.out.print("################################################################");
        System.out.print("\n");
        System.out.print("                   BEM VINDO A CALCULADORA                       ");
        System.out.print("\n");
        System.out.print("################################################################");
        System.out.print("\n");

        System.out.print("Digite o primeiro número:");
        int  x = entrada.nextInt();
        System.out.print( "Digite o segundo número:");
        int y = entrada.nextInt();

        Calculadora calc = new Calculadora();
        System.out.print("somar: " +  calc.somar( x, y ));
        System.out.print("\n");
        System.out.print("subtrair: " +   calc.subtrair(x,y));
        System.out.print("\n");
        System.out.print("multiplicar: " +  calc.multiplicar( x, y ) );
        System.out.print("\n");
        System.out.print("dividir: "  +  calc.dividir( x, y ) );

    }
}




