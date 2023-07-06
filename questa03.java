import java.util.Scanner;

public class questa03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distância percorrida em quilômetros: ");
        double distancia = scanner.nextDouble();
        
        System.out.print("Informe o tipo da bandeira 1 ou 2: ");
        int bandeira = scanner.nextInt();
        
        double valor = 0.0;
        
        if (bandeira == 1) {
            valor = distancia * 1.80;
        } else if (bandeira == 2) {
            valor = distancia * 2.30;
        } else {
            System.out.println("Bandeira inválida. Escolha 1 ou 2.");
            System.exit(0);
        }
        
        System.out.println("O valor da corrida é: R$ " + valor);
        
    }
}