package aula2;
import java.util.Scanner;
public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static Funcionario lerDadosFuncionario(int id, double salarioBase) {

        System.out.println("Insira o nome do funcionário:");
        String nome = sc.nextLine();

        Cargo cargo = null;

        while (cargo == null) {
            System.out.println("Insira o cargo do funcionário (DESENVOLVEDOR, GERENTE, SUPORTE):");
            String cargoStr = sc.nextLine();

            try {
                cargo = Cargo.valueOf(cargoStr.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Cargo inválido. Tente novamente.");
            }
        }
        switch (cargo) {
            case DESENVOLVEDOR:
                return new Desenvolvedor(nome, id, salarioBase, cargo);
            case GERENTE:
                return new Gerente(nome, id, salarioBase, cargo);
            case SUPORTE:
                return new Suporte(nome, id, salarioBase, cargo);
            default:
                System.out.println("Cargo não reconhecido. Tente novamente.");
                return null;
        }
    }


    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        boolean adicionarMais = true;
        int idCont = 1;
        System.out.println("Insira o salário base do funcionário:");
        double salarioBase = Double.parseDouble(sc.nextLine());

        while (adicionarMais) {

            Funcionario funcionario = lerDadosFuncionario(idCont, salarioBase);
            if (funcionario != null) {
                empresa.adicionarFuncionario(funcionario);
            }
            System.out.println(funcionario.toString());
            System.out.println("Deseja adicionar outro funcionário? (sim/não)");
            String resposta = sc.nextLine();
            adicionarMais = resposta.equalsIgnoreCase("sim");
            idCont++;
        }

        System.out.println("Total da Folha Salarial: R$ " + empresa.calcularFolhaSalarial());

    }
}
