package org.example;

class Onibus extends Veiculo {
    private int quantidadeEixos;
    private static final double CONSUMO = 5.0;
    private static final double TANQUE = 200.0;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int quantidadeEixos) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        if (quantidadeEixos < 6 || quantidadeEixos > 8) {
            throw new IllegalArgumentException("O ônibus deve ter entre 6 e 8 eixos.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularAutonomia() {
        return TANQUE * CONSUMO;
    }
}