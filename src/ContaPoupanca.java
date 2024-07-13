public class ContaPoupanca extends Conta{

    public ContaPoupanca() {
        super(AGENCIA_PADRAO, SEQUENCIAL);
    }

  public void status(){
        System.out.println("\n===Saldo da conta poupança===\n");
            super.imprimirStatus();
    }
}
