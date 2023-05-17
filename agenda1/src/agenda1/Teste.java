package agenda1;

import java.util.Scanner;

/**
 *
 * @author Emilio
 */
public class Teste {

    public static void main(String[] args) {
        
        
        Agenda1 agenda = new Agenda1();
        
        String tira_enter = new String();

        Contatos buscador = new Contatos();
        
        Scanner input = new Scanner(System.in);
        
        int opcoes = 1;

        while (opcoes != 0) {
            System.out.println("=============================");
            System.out.println("Selecione a opção desejada:");
            System.out.println("(1) - Insere novo contato na agenda");
            System.out.println("(2) - Exibe o número total de contatos da agenda");
            System.out.println("(3) - Exibe um contato (pesquisa pelo nome)");
            System.out.println("(4) - Exclui um contato (pesquisa pelo nome)");
            System.out.println("(5) - Exibe todos os contatos da agenda");
            System.out.println("(0) - Sair");
            System.out.println("=============================");
            opcoes = input.nextInt();
            tira_enter = input.nextLine();
            switch (opcoes) {

                case 1:
                    System.out.println("coloque o nome do contato:");
                    Contatos contato = new Contatos();
                    contato.nome = input.nextLine();
                    System.out.println("coloque o numero de telefone do contato:");
                    contato.telefone = input.nextLine();
                    System.out.println("coloque o email do contato:");
                    contato.email = input.nextLine();
                    agenda.addContato(contato);
                    break;

                case 2:
                    System.out.println("A agenda possui : " + agenda.getSize() + " contatos");
                    break;

                case 3:
                    System.out.println("Qual o nome do contato?");
                    buscador.nome = input.nextLine();
                    agenda.pesquisarContatos(buscador.nome);
                    break;

                case 4:
                    System.out.println("Qual o nome do contato para exclui-lo?");
                    buscador.nome = input.nextLine();
                    if (agenda.excluirContato(buscador.nome) == true) {
                        System.out.println("Contato excluido");
                    } else {
                        System.out.println("Esse contato não existe");
                    }
                    break;

                case 5:
                    agenda.listContatos();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("não existe essa opção");
            }
        }
    }
}
