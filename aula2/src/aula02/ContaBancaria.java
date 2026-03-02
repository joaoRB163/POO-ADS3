package aula02;

public class ContaBancaria {

    private String titular;
    private double saldo = 0;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void Depositar(double saldo) {
        this.saldo += saldo;
    }

    public boolean Sacar(double saldo) {
        if (this.saldo < saldo) {
            return false;
        } else {
            this.saldo -= saldo;
            return true;
        }
    }
}
