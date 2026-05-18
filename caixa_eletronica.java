import static java.lang.IO.*;

void main() {

    int psw;

    int i = 1;

    while (i <=3){
        psw = Integer.parseInt(readln("Digite sua senha: "));

        if (psw == 4321){

            println("Acesso liberado");
            break;
        }

        else if (i == 3 && psw != 4321) {

            println("Acesso negado!");

        }
        i++;
    }
}