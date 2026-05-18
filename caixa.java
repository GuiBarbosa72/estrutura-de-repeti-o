import static java.lang.IO.*;
void main() {

    float sld = 500;

    while (true) {

        String op = readln("Digite o nº da operação \n1 - SAQUE\n 2-depositar \n 3-saldo \n 4-sair " );

        if (op.equals("1")){
            float saq = Float.parseFloat(readln("Quanto você deseja sacar?"));
            if (saq <=sld){
                sld -=saq;
                println(sld);
            }
            else {
                println("Saldo insuficiente!");

            }
        } else if (op.equals("2")) {
            float dep = Float.parseFloat(readln("Quanto você deseja depositar?"));
            sld += dep;
            println(sld);

        }
        else if (op.equals("3")){
            println(sld);

        }
        else if (op.equals("4")) {
            println("Você saiu da conta!");
            break;
        }
    }
}