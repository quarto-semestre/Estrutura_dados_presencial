package aula2;
import java.util.ArrayList;
import java.util.List;
public class Empresa {

    List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }


    public double calcularFolhaSalarial(){
        double total = 0;

        for(Funcionario funcionario: funcionarios){
            total+= funcionario.salario;
        }

        return total;
    }
}
