import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do produto: ");
        String produto = scanner.nextLine();

        System.out.println("Informe a quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.println("Informe o valor unitário: ");
        double valor = scanner.nextDouble();

        double total = valor * quantidade;

        System.out.println("Detalhes do Pedido");
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Unitário: R$ " + valor);
        System.out.println("Total do item: R$ " + total);

        System.out.println("Valor total: R$ " + total);

        System.out.println("Informe o percentual de desconto: ");
        double percDesconto = scanner.nextDouble();

        double desconto = total * (percDesconto / 100);
        double valorFinal = total - desconto;

        System.out.println("Resumo do Pedido");
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Unitário: R$ " + valor);
        System.out.println("Total do item: R$ " + total);
        System.out.println("Valor total: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);
    }
}