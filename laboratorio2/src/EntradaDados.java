import java.util.Scanner;

class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /* cria objeto para leitura */
        int n1;
        int n2;
        System.out.println("Entre com o numero 1:");
        n1 = sc.nextInt();
        System.out.println("Entre com o numero 2:");
        n2 = sc.nextInt();
        System.out.println(Math.abs(n1 - n2 - 1) + " numeros dentro do intervalo");
        System.out.println("O resultado da soma dos numeros e " + (n1+n2));
        System.out.println("A media dos numeros e " + (n1+n2)/2);
        System.out.println("A quantidade de numeros pares e " + Math.ceil(Math.abs(n1-n2)/2));
    }
}
