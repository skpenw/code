import java.util.ArrayList;
import java.util.Scanner;
public class TextoColorido {

    public static final String RESET = "\u001B[0m";
    public static final String VERMELHO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String CIANO = "\u001B[36m";
    public static final String AMARELO = "\u001B[33m";


    public static class Tarefas {
        public static void main(String[] args) {
            ArrayList<String> listaDeTarefas = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            int opcao;

            do {
                System.out.println(AMARELO + "\n\n\t\t¬¬¬¬¬¬¬¬¬ TO DO LIST ¬¬¬¬¬¬¬¬¬:" + RESET);
                System.out.println(CIANO + "\t\t[1] - Adicionar tarefa");
                System.out.println("\t\t[2] - Listar tarefas");
                System.out.println("\t\t[3] - Excluir tarefa");
                System.out.println("\t\t[4] - Sair");
                System.out.print("\n\t\tEscolha uma opção: " + RESET);
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("\t\tQual tarefa deseja adicionar?: ");
                        String tarefa = scanner.nextLine();
                        listaDeTarefas.add(tarefa);
                        System.out.println(VERDE + "\t\tTarefa adicionada!" + RESET);
                        break;

                    case 2:
                        System.out.println("\n\t\tLista de Tarefas:");
                        if (listaDeTarefas.isEmpty()) {
                            System.out.println(VERMELHO + "\t\tNenhuma tarefa adicionada." + RESET);
                        } else {
                            for (int i = 0; i < listaDeTarefas.size(); i++) {
                                System.out.println((i + 1) + ". " + listaDeTarefas.get(i));
                            }
                        }
                        break;

                    case 3:
                        System.out.println("\n\t\tExcluir Tarefa:");
                        if (listaDeTarefas.isEmpty()) {
                            System.out.println(VERMELHO + "\t\tNão há tarefas para excluir." + RESET);
                        } else {
                            System.out.println("\t\tEscolha o número da tarefa para excluir:");
                            for (int i = 0; i < listaDeTarefas.size(); i++) {
                                System.out.println((i + 1) + ". " + listaDeTarefas.get(i));
                            }
                            int tarefaExcluir = scanner.nextInt();
                            scanner.nextLine();
                            if (tarefaExcluir > 0 && tarefaExcluir <= listaDeTarefas.size()) {
                                listaDeTarefas.remove(tarefaExcluir - 1);
                                System.out.println(VERDE + "\t\tTarefa excluída." + RESET);
                            } else {
                                System.out.println(VERMELHO + "\t\tNúmero inválido. Tente novamente." + RESET);
                            }
                        }
                        break;

                    case 4:
                        System.out.println("\t\tSaindo...");
                        break;

                    default:
                        System.out.println(VERMELHO + "\t\tInválido! Tente novamente." + RESET);
                }
            } while (opcao != 4);

            scanner.close();
        }
    }
}