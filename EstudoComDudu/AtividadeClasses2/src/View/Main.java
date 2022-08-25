package View;

import Models.Carro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Scanner entrada = new Scanner(System.in);
    private static ArrayList<Carro> carros;
    private static Map<Carro, Integer> carrinho;

    public static void main(String[] args){

        carros = new ArrayList<Carro>();
        carrinho = new HashMap<Carro, Integer>();
        Main.menu();

    }

    private static void menu() {

        System.out.println("================================================");
        System.out.println("==============Concessionário Longo==============");
        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("Selecione a opção desejada:");
        System.out.println("1 - Cadastrar carro");
        System.out.println("2 - Listar carro");
        System.out.println("3 - Comprar carro");
        System.out.println("4 - Encerrar");

        int opcao = 0;
        opcao = Main.entrada.nextInt();

        switch (opcao) {
            case 1:
                Main.cadastrarCarro();
                break;

            case 2:
                Main.listarCarro();
                break;

            case 3:
                Main.comprarCarro();
                break;

            case 4:
                System.out.println("Obrigado pela preferência, volte sempre.");
                System.exit(0);

            default:
                System.out.println("Opção inválida");
                System.out.println("Escolha uma das opções acima");
                Main.menu();
                break;

        }

    }

    private static void cadastrarCarro(){

        System.out.println("Carro cadastrado com sucesso");
        Main.menu();
    }
    private static void listarCarro(){

        System.out.println("Essa é sua lista de carros");
        Main.menu();
    }

    private static void comprarCarro(){

        System.out.println("Carro comprado com sucesso");
        Main.menu();
    }


}