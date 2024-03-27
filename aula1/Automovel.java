package aula1;

public class Automovel {
    //Atributos
    private int portas;
    private String cor;
    private String marca;
    private String placa;

    //Construtor

    public Automovel(int portas, String cor, String marca) {

        this.portas = portas;
        this.cor = cor;
        this.marca = marca;

    }

    //Métodos;

    public int getPortas() {
        return this.portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String toString() {
        return  " === Carro Construido ==="
                + "\nPortas:  " + portas
                + "\nCor: " + cor
                + "\nMarca: " + marca
                + "\nPlaca: " + placa;
    }
}
