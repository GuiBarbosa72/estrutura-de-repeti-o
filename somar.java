import static java.lang.IO.*;
void main() {

    int s = 0;
    for (int i = 1; i <= 100; i++) {
        if (i % 3 == 0) {
            println(i);
            s += i;
        }
    }
    println("A soma é: " + s);
}