import java.util.Scanner;

public class App {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Produto produto1 = new Produto();
        Produto produto2 = new Produto("Arroz");
        Produto produto3 = new Produto("Feijão", 10);
        Produto produto4 = new Produto("Macarrão", 20, "Massa", 2.50);

        produto1.inserir("Macarrão", 20, "Massa", 2.50);
        System.out.println(produto1.toString()+"\n");

        produto2.comprar(10, 3.50);
        System.out.println(produto2.toString()+"\n");

        produto3.comprar(10);
        System.out.println(produto3.toString()+"\n");

        produto4.vender(5);
        System.out.println(produto4.toString()+"\n");

        if (produto1.igual(produto4)){
            System.out.println("Os produtos são iguais");
        } else {
            System.out.println("Os produtos são diferentes");
        }

    }
}
