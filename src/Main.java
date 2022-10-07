import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        int cont = 1;

        Funcionario[] rede = new Funcionario[100];

        while (opcao !=5 ) {
            System.out.println("[1] - Cadastrar Funcionário");
            System.out.println("[2] - Visualizar Funcionários");
            System.out.println("[3] - Atualizar Funcionário");
            System.out.println("[4] - Remover Funcionário");
            System.out.println("[5] - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.println("Cargo: ");
                    String cargo = sc.nextLine();
                    System.out.println("Expediente: ");
                    String expediente = sc.nextLine();
                    int matricula = cont;
                    System.out.println("Idade: ");
                    int idade = sc.nextInt();

                    Funcionario func = new Funcionario(nome,cargo,expediente,matricula,idade);
                    rede[cont] = func;
                    cont++;
                    break;

                case 2:
                    for (int i = 1;i<cont;i++) {
                        if (rede[i] != null) {
                            System.out.println(rede[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite a matrícula de funcionário para alterá-lo: ");
                    int alterar = sc.nextInt();
                    System.out.println("Alterar: [1] - Nome / [2] - Cargo / [3] - Expediente / [4] - Idade / [5] - Sair");
                    int escolha = sc.nextInt();
                    switch (escolha) {
                        case 1:
                            System.out.println("Digite o novo nome: ");
                            sc.nextLine();
                            String newNome = sc.nextLine();
                            rede[alterar].setNome(newNome);
                            break;
                        case 2:
                            System.out.println("Digite o novo cargo: ");
                            sc.nextLine();
                            String newCargo = sc.nextLine();
                            rede[alterar].setCargo(newCargo);
                            break;
                        case 3:
                            System.out.println("Digite o novo expediente: ");
                            sc.nextLine();
                            String newExpediente = sc.nextLine();
                            rede[alterar].setExpediente(newExpediente);
                            break;
                        case 4:
                            System.out.println("Digite a nova idade: ");
                            int newIdade = sc.nextInt();
                            rede[alterar].setIdade(newIdade);
                            break;
                        case 5:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Digite uma opção válida!");

                    }
                    break;
                case 4:
                    System.out.println("Digite a matrícula de funcionário para removê-lo: ");
                    int remover = sc.nextInt();
                    rede[remover] = null;
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
            }
        }
        sc.close();
    }
    }
