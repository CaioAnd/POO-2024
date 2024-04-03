public class Agencia {
    private Conta[] contas;
    public Agencia(){
        this.contas = new Conta[10];
    }
    public void adicionarConta(String nome){

        for(int i=0; i < 10; i++){

            if(this.contas[i] != null){
                this.contas[i] = new Conta(nome);
                System.out.println(this.contas[i]);
            }

        }

    }

    public void somaSaldoTotal(){

    }
}