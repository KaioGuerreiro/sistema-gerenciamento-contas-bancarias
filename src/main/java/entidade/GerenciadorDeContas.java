package entidade;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeContas {
    Scanner le = new Scanner(System.in);
    private int menuOpcoes(){
        System.out.println("MENU OPCOES\n" +
                "1 - CADASTRAR CONTA\n" +
                "2 - LISTAR CONTAS\n" +
                "3 - SAIR\n" +
                "INFORME A OPÇÃO: ");
        return le.nextInt();
    }
    private int menuCadastro() {
        System.out.println("MENU CADASTRO DE CONTA\n" +
                "1 - CONTA POUPANÇA\n" +
                "2 - CONTA CORRENTE\n" +
                "3 - CONTA INVESTIMENTOS\n" +
                "INFORME A OPÇÃO: ");
        return le.nextInt();
    }
    public void gerenciadorDeContas(){
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaInvestimento contaInvestimento = new ContaInvestimento();

        int opcao, opcaoDeConta;

        do {
            opcao = menuOpcoes();
            switch (opcao){
                case 1:
                    opcaoDeConta = menuCadastro();

                    break;
                case 2:
                    for (ContaBancaria c : contas){

                        System.out.println("SALDO DA CONTA: "+c.getSaldo());
                    }
                    break;
            }

        }while (opcao != 3);

    }

}
