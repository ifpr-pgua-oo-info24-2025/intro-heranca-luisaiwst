public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro() {}

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de portas: " + numeroDePortas);
    }
}