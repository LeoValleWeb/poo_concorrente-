public class Processo extends Thread{
    private String  nome;
    private int numeroInteracoes;
    private int prioridade;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroInterações() {
        return numeroInteracoes;
    }
    public void setNumeroInterações(int numeroInteracoes) {
        this.numeroInteracoes = numeroInteracoes;
    }
    public int getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public Processo(){

    }
    public Processo(String nome, int numeroInteracoes, int prioridade){
        this.nome=nome;
        this.numeroInteracoes=numeroInteracoes;
    }

    public void run(){

        for (int i= 0; i < numeroInteracoes; i++) {
            System.out.println("Processo: "+nome+ ": "+i);
            //yield();
        
            try{
                Thread.sleep(i *100);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
