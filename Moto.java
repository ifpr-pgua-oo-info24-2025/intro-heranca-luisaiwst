public class Moto extends Veiculo {
    private String tipoDeGuidao;

    public Moto() {}

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    public void setTipoDeGuidao(String tipoDeGuidao) {
        this.tipoDeGuidao = tipoDeGuidao;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de guidão: " + tipoDeGuidao);
    }
}