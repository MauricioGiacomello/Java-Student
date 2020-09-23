package application;

import java.util.*;
import entities.DadosFuncionario;

public class cadastroFuncionario {

    public static void main(String[] args) {

        System.out.println("parou aqui");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Loguin de acesso-----");
        System.out.print("");
        System.out.println("ID: ");
        //String id = sc.next();
        System.out.println("Senha: ");
        //String senha = sc.next();

        menu();

        // sc.close();
    }

    public static void menu() {

        Scanner sc = new Scanner(System.in);

        boolean loopMenu = true;

        // ArrayList<DadosFuncionario> func;

        ArrayList<DadosFuncionario> funcionarios = new ArrayList<DadosFuncionario>();

        while (loopMenu) {

            System.out.println("-------Selecione 1 opção-------");
            System.out.println("");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Remover funcionário");
            System.out.println("3 - Atualizar dados do funcionário");
            System.out.println("4 - Ler dados funcionário");
            System.out.println("5 - Sair");
            String menu = sc.next();

            switch (menu) {

                case "1":
                    cadastrarFuncionario(funcionarios);
                    break;

                case "2":
                    removerFuncionario(funcionarios);
                    break;

                case "3":
                    atualizarDadosFuncionario(funcionarios);
                    break;

                case "4":
                    System.out.println(funcionarios);
                    System.out.println("");
                    break;

                case "5":
                    System.out.println("O programa foi finalizado com sucesso!");
                    System.out.println("");
                    loopMenu = false;
                    break;

                default:
                    System.out.println("Opção não encontrada! Digite uma das 4 opções a cima");

            }

        }

        // sc.close();

    }

    public static void cadastrarFuncionario(ArrayList<DadosFuncionario> func) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ID do funcionario");
        String id = sc.next();

        System.out.println("Nome do funcionário");
        String nome = sc.next();

        System.out.println("Salário do funcionario");
        Float salario = sc.nextFloat();

        DadosFuncionario dadosFunc = new DadosFuncionario(id, nome, salario);

        func.add(dadosFunc);

        // System.out.println(func);

        // sc.close();

    }

    public static void removerFuncionario(ArrayList<DadosFuncionario> func) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ID que será removido: ");
        String id = sc.next();

        for (DadosFuncionario i : func) {

            if (i.getidFuncionario().equalsIgnoreCase(id)) {

                func.remove(func.indexOf(i));
                System.out.println("ID removido com sucesso!");

            }
        }
    }

    public static void atualizarDadosFuncionario(ArrayList<DadosFuncionario> func) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ID que deseja alterar os dados");
        String id = sc.next();

        System.out.println("O que deseja alterar?");
        System.out.println("1 - ID - ");
        System.out.println("2 - Nome - ");
        System.out.println("3 - Salario - ");
        String alteração = sc.next();

        switch (alteração) {

            case "1":
                AltId(func, id);
                break;

            case "2":
                AltNome(func, id);
                break;

            case "3":
                AltSalario(func, id);
                break;

            default:

                System.out.println("Opção não encontrada! Digite uma das 3 opções a cima");

        }

    }

    public static void AltId(ArrayList<DadosFuncionario> func, String id) {

        Scanner sc = new Scanner(System.in);

        for (DadosFuncionario i : func) {

            if (i.getidFuncionario().equalsIgnoreCase(id)) {

                System.out.println("Digite o novo ID: ");
                i.setidFuncionario(sc.next());
                System.out.println("");

            }
        }

    }

    public static void AltNome(ArrayList<DadosFuncionario> func, String id) {

        Scanner sc = new Scanner(System.in);

        for (DadosFuncionario i : func) {

            if (i.getidFuncionario().equalsIgnoreCase(id)) {

                System.out.println("Digite o novo nome: ");
                i.setnomeFuncionario(sc.next());
                System.out.println("");

            }
        }

    }

    public static void AltSalario(ArrayList<DadosFuncionario> func, String id) {

        Scanner sc = new Scanner(System.in);

        for (DadosFuncionario i : func) {

            if (i.getidFuncionario().equalsIgnoreCase(id)) {

                // Float.parseFloat(id); // converter para float //

                System.out.println("Digite o novo salario: ");
                i.setSalario(sc.nextFloat());
                System.out.println("");

            }
        }

    }

}
