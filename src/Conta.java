public abstract class Conta {

    protected int agencia;
    protected int numero;
    protected double saldo;

    protected static int SEQUENCIAL = 1;
    protected static int AGENCIA_PADRAO = 1;

    public Conta(int agencia, int numero) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void sacar(double valor){
        saldo-=valor;
    };
    public void depositar(double valor){
        saldo+=valor;
    };
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);//encapsulamento- utlizar métodos existentes para realizar tarefa dentro de outro método
        contaDestino.depositar(valor);//encapsulamento -
    };

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirStatus() {

        System.out.println(String.format("Agência : %d", this.agencia));
        System.out.println(String.format("Número : %d", this.numero));
        System.out.println(String.format("Saldo : %.2f", this.saldo));
    }
    public abstract void status();//Abstração -Criar o método static para poder contratar as classes que o realizem
}
