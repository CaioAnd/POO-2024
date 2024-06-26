public class Conta {
    private double saldo;
    @SuppressWarnings("unused")
    private String titular;

    public Conta(String nome) {
        this.titular = nome;
    }

    public String deposito(double valor) {
        if( valor > 0){
            this.saldo += valor;
            return "Deposito efetuado com sucesso";
        } else {
            return "Valor inválido";
        }
    }

    public String saque(double valor) {
        if( this.saldo - valor >= 0){
            this.saldo -= valor;
            return "Saque efetuado com sucesso";
        } else {
            return "Saldo insuficiente";
        }
    }
}
