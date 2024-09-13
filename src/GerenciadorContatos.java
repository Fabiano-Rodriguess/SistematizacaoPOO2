import java.util.Scanner;

public class GerenciadorContatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContatoLista ContatoLista = new ContatoLista();
        boolean running = true;

        while (running) {
            System.out.println("1. ADD CONTATO");
            System.out.println("2. PROCURAR CONTATO");
            System.out.println("3. REMOVER CONTATO");
            System.out.println("4. LISTA DE CONTATOS");
            System.out.println("5. SAIR");
            System.out.print("ESCOLHA QUAL OPCAO: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("DIGITE O NOME ");
                    String name = scanner.nextLine();
                    System.out.print("DIGITE O NUMERO: ");
                    String phone = scanner.nextLine();
                    System.out.print("DIGITE O EMAIL: ");
                    String email = scanner.nextLine();
                    ContatoLista.addContact(new Contact(name, phone, email));
                    System.out.println("CONTATO ADCIONADO.");
                    break;
                case 2:
                    System.out.print("DIGITE O NOME OU O NUMERO PARA PESQUISA: ");
                    String searchTerm = scanner.nextLine();
                    Contact found = ContatoLista.searchContact(searchTerm);
                    if (found != null) {
                        System.out.println("CONTATO ENCONTRADO: " + found);
                    } else {
                        System.out.println("CONTATO NAO ENCONTRADO.");
                    }
                    break;
                case 3:
                    System.out.print("DIGITE O NOME OU O NUMERO PARA EXCLUIR: ");
                    String removeTerm = scanner.nextLine();
                    if (ContatoLista.removeContact(removeTerm)) {
                        System.out.println("CONTATO REMOVIDO.");
                    } else {
                        System.out.println("CONTATO NAO EXISTE.");
                    }
                    break;
                case 4:
                    System.out.println("LISTA DE CONTATOS:");
                    ContatoLista.listContacts();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("OPCAO INVALIDA. TENTE NOVAMENTE.");
                    break;
            }
        }
        scanner.close();
    }
}
