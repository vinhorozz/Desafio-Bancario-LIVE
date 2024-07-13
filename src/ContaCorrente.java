public class ContaCorrente extends Conta{

    public ContaCorrente() {
        super(AGENCIA_PADRAO, SEQUENCIAL);
    }
@Override
        public void status(){
            System.out.println("\n===Saldo da conta corrente===\n");
            super.imprimirStatus(); //encapsulamento
        }
}
