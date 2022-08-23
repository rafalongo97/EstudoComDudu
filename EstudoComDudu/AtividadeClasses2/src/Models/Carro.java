package Models;

//atributos da classe
public class Carro {
    String modelo;
    String cor;
    String ano;
    Integer serie;
    Integer capacidadeTanque;

    //construtor vazio
    public Carro(){

    }

    //construtor padrão
    public Carro(String modelo, String cor, String ano, Integer serie, Integer capacidadeTanque) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.serie = serie;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public Integer getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(Integer capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
}
