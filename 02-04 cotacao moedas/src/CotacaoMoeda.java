public class CotacaoMoeda {
    private double dolar;

    public CotacaoMoeda(double valor) {
        this.dolar = valor;
    }

    public double cotacao(double valor){
        return this.dolar * valor;
    }
}