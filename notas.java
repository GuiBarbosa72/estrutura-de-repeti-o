import static java.lang.IO.*;

void main() {

    String[] nome = new String[4];

    double[][] nota = new double[4][4];

    double[] media = new double[4];

    for (int i = 0; i < 4; i++) {

        nome[i] = readln("Insira o nome do aluno: ");

        double soma = 0;

        for (int j = 0; j < 4; j++) {

            nota[i][j] = Double.parseDouble(readln("Insira a nota " + (j + 1) + ": "));

            soma += nota[i][j];
        }

        media[i] = soma / 4;
    }

    for (int i = 0; i < 4; i++) {
        println("\nAluno: " + nome[i]);

        println("Média final: " + media[i]);

        if (media[i] >= 7) {
            println("Aprovado");
        }

        else if (media[i] >= 5) {
            println("Recuperação");
        }

        else {
            println("Reprovado");
        }
    }
}
