package Models;

public class Carro {

    //inicializador do ID
    private static int contador = 1;

    private int codigo;
    private String nome;
    private Double preco;

    public Carro() {
    }

    public Carro(String nome, Double preco) {
        this.codigo = Carro.contador;
        this.nome = nome;
        this.preco = preco;
        Carro.contador += 1;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Carro.contador = contador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "codigo=" + this.getCodigo() +
                ", nome='" + this.getNome() + '\'' +
                ", preco=" + this.getPreco();
    }
}