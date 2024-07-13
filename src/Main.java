public class Main {
    public static void main(String[] args) {

        Conta cc =new ContaCorrente();
        Conta cp =new ContaPoupanca();

            cc.depositar(2000);
            cp.depositar(3000);

            cc.status();
            cp.status();

            cc.transferir(1000,cp);

            cc.status();
            cp.status();


    }
}
