import static java.lang.IO.*;

void main() {

    float soma = 0,
            media,

            ma = 0,

            me = Float.POSITIVE_INFINITY,

            sp = 0,

            si = 0;

    for (int i = 1; i <= 10; i++) {

        float n = Float.parseFloat(readln("Insira o " + i + "º número: "));

        soma += n;

        if (n > ma) {

            ma = n;
        }

        if (n < me) {

            me = n;
        }

        if (n % 2 == 0) {

            sp += n;

        } else {

            si += n;
        }
    }

    media = soma / 10;

    println("Soma: " + soma);

    println("Média: " + media);

    println("Maior número: " + ma);

    println("Menor número: " + me);

    println("Soma dos pares: " + sp);

    println("Soma dos ímpares: " + si);
}