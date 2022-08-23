import Models.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setAno("2022");
        carro1.setCor("preto");
        carro1.setModelo("amg");
        carro1.setSerie(5879463);

        System.out.println("Ano: " + carro1.getAno());

        Carro carro2 = new Carro("amg", "preto", "2022", 54987, 60);

        System.out.println(carro2);
    }

}