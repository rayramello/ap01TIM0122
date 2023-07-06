import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        final int numAlunos = 10;
        final int numNotas = 4;

        double[] medias = new double[numAlunos];
        double mediaTotal = 0;
        double maiorMedia = 0;
        double menorMedia = Double.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numAlunos; i++) {
            double somaNotas = 0;

            for (int cont = 0; cont < numNotas; cont++) {
                System.out.print("Digite a nota " + (cont + 1) + " do aluno " + (i + 1) + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            double mediaAluno = somaNotas / numNotas;
            medias[i] = mediaAluno;
            mediaTotal += mediaAluno;

            if (mediaAluno > maiorMedia) {
                maiorMedia = mediaAluno;
            }

            if (mediaAluno < menorMedia) {
                menorMedia = mediaAluno;
            }

            System.out.println("Média do aluno " + (i + 1) + ": " + mediaAluno);
            System.out.println("Situação do aluno " + (i + 1) + ": " + (mediaAluno >= 5.0 ? "Aprovado" : "Reprovado"));
            System.out.println();
        }

        double mediaGeral = mediaTotal / numAlunos;

        System.out.println("Média das médias dos alunos: " + mediaGeral);
        System.out.println("Maior média: " + maiorMedia);
        System.out.println("Menor média: " + menorMedia);

        
    }
}


