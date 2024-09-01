package entidade;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeContas {
    Scanner le = new Scanner(System.in);
    private int menuOpcoes(){
        System.out.print("MENU OPCOES\n" +
                "1 - CADASTRAR CONTA\n" +
                "2 - LISTAR CONTAS\n" +
                "3 - SAIR\n" +
                "INFORME A OPÇÃO: ");
        return le.nextInt();
    }
    private int menuCadastro() {
        System.out.print("MENU CADASTRO DE CONTA\n" +
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
                    switch (opcaoDeConta){
                        case 1:
                            System.out.print("INFORME O SALDO: ");
                            contaPoupanca.setSaldo(le.nextFloat());
                            System.out.print("INFORME A TAXA: ");
                            contaPoupanca.setTaxa(le.nextFloat()/100);
                            contas.add(contaPoupanca);
                            System.out.println("CADASTRO OK");
                            break;
                        case 2:
                            System.out.print("INFORME O SALDO: ");
                            contaCorrente.setSaldo(le.nextFloat());
                            System.out.print("INFORME A TAXA: ");
                            contaCorrente.setTaxa(le.nextFloat()/100);
                            System.out.print("INFORME O LIMITE ESPECIAL: ");
                            contaCorrente.setLimiteEspecial(le.nextFloat());
                            System.out.print("INFORME A TAXA ESPECIAL: ");
                            contaCorrente.setTaxaAdicional(le.nextFloat()/100);
                            contas.add(contaCorrente);
                            System.out.println("CADASTRO OK");
                            break;
                        case 3:
                            System.out.print("INFORME O SALDO: ");
                            contaInvestimento.setSaldo(le.nextFloat());
                            System.out.print("INFORME A TAXA: ");
                            contaInvestimento.setTaxa(le.nextFloat()/100);
                            System.out.print("INFORME O VALOR INVESTIDO: ");
                            contaInvestimento.setValorInvestido(le.nextFloat());
                            System.out.print("INFORME A TAXA DE JUROS DO INVESTIMENTO: ");
                            contaInvestimento.setTaxaJurosInvestimento(le.nextFloat()/100);
                            contas.add(contaInvestimento);
                            System.out.println("CADASTRO OK");
                            break;
                        default:
                            System.out.println("OPÇÃO INVALIDA!!!");
                    }
                    break;
                case 2:
                    for (ContaBancaria c : contas){
                        System.out.println("TIPO DE CONTA: "+c.getNomeTipoConta());
                        System.out.println("SALDO DA CONTA: "+c.getSaldo());
                        if (c.getNomeTipoConta() == "Conta Poupança"){
                            System.out.println("JUROS POUPANÇA: "+c.calcularJuros());
                        }else if (c.getNomeTipoConta() == "Conta Corrente"){
                            System.out.println("JURO ESPECIAL: "+c.calcularJuros());
                        }else {
                            System.out.println("JUROS INVESTIMENTO: "+ c.calcularJuros());
                        }

                        System.out.println("----------------------------");
                    }
                    System.out.println("FIM LISTA DE CONTAS");
                    break;
                case 3:
                    System.out.println("FINALIZANDO PROGRAMA");
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA!!!");
            }

        }while (opcao != 3);

    }

}
