import static java.lang.IO.*;

void main() {

    int j = 0, m = 0, n = 0;

    for (int i = 0; i < 10; i++) {

        int v = Integer.parseInt(readln("Digite seu voto: \n1 - João\n2 - maria\n3 - Voto nulo"));

        if (v == 1) {
            j += 1;

        } else if (v == 2) {
            m += 1;

        } else {
            n +=1;
        }
    }

    if (j>m&&j>n) {

        println("João");
    } else if (m>j&&m>n) {

        println("Maria");
    }
    else {

        println("Nulo");
    }
}