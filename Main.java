public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("fiat");
        carro.setModelo("uno");
        carro.setAno(0001);
        carro.setNumeroDePortas(1);

        System.out.println("----- Detalhes do Carro -----");
        carro.exibirDetalhes();

        System.out.println();

        Moto moto = new Moto();
        moto.setMarca("kawasaki");
        moto.setModelo("zx750");
        moto.setAno(2023);
        moto.setTipoDeGuidao("Esportivo");

        System.out.println("----- Detalhes da Moto -----");
        moto.exibirDetalhes();
    }
}