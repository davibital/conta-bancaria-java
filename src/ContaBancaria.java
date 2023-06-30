public abstract class ContaBancaria {
    double saldo = 0;

    public abstract void consultarSaldo ();

    public abstract void depositar (double valor);

    public abstract void sacar (double valor);
}