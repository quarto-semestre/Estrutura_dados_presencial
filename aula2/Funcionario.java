package aula2;
public abstract class Funcionario {

    protected String nome;
    protected int id;
    protected double salario;
    protected Cargo cargo;

    public Funcionario(String nome, int id, double salario,Cargo cargo){
        this.nome = nome;
        this.id = id;
        this.salario = calcularSalario(salario);
        this.cargo = cargo;

    }

    public abstract double calcularSalario(double salario);


    public String toString() {
        return "Nome:  " + nome
                + "\nID: " + id
                + "\nSalario: " + salario
                + "\nCargo: " + cargo;
    }
}
