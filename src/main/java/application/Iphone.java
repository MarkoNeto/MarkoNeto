package application;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    //Inicio chamada das funções implementadas nas interfaces
    @Override
    public void ligar() {
        System.out.println("Fazendo ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
    //Fim chamada das funções implementadas nas interfaces

    //Inicio da execução do código
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in); //Scanner que lê o teclado do usuário

        Iphone iphone = new Iphone(); //Criando um novo objeto chamado Iphone

        int opcao; //Atribuindo uma variável do tipo int para ler o número digitado no teclado

        //Imprime as mensagens na tela mesmo sem iniciar um laço de repetição.
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Efetuar ligação");
            System.out.println("2 - Atender ligação");
            System.out.println("3 - Iniciar correio de voz");
            System.out.println("4 - Selecionar música");
            System.out.println("5 - Tocar música");
            System.out.println("6 - Pausar música");
            System.out.println("7 - Exibir página no navegador");
            System.out.println("8 - Abrir nova aba no navegador");
            System.out.println("9 - Atualizar página no navegador");
            System.out.println("0 - Desligar");

            opcao = sc.nextInt(); //Aguarda o usuário digitar o número para definir a variável.

            //Inicio do switch para linkar o número escolhido com a função desejada.
            switch (opcao) {
                case 1:
                    iphone.ligar();
                    break;
                case 2:
                    iphone.atender();
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                    break;
                case 4:
                    iphone.selecionarMusica();
                    break;
                case 5:
                    iphone.tocar();
                    break;
                case 6:
                    iphone.pausar();
                    break;
                case 7:
                    iphone.exibirPagina();
                    break;
                case 8:
                    iphone.adicionarNovaAba();
                    break;
                case 9:
                    iphone.atualizarPagina();
                    break;
                case 0:
                    System.out.println("Desligando o aparelho");
                    break;
                default:
                    System.out.println("Erro. Digite um número de 0 a 9.");
            }
        } while (opcao != 0); //Se for digitado o número 0 é encerrado o programa.
        sc.close();
    }
}