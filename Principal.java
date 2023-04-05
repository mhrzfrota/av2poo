import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int op;

        System.out.println("digite 1 para adicionar paciente.");
        System.out.println("digite 2 para alterar paciente.");
        System.out.println("digite 3 para agendar consulta.");
        System.out.println("digite 4 para visualizar consultas.");
        op = scn.nextInt();
        if (op == 1){
            Paciente.cadastrar();
        } else if (op == 2) {

        }
    }
}
