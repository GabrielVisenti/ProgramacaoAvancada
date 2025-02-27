package org.example;

class Caminhao extends Veiculo {
    private int capacidadeCarga;
    private static final double CONSUMO_BASE = 6.0;
    private static final double TANQUE = 300.0;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAutonomia() {
        double reducao = Math.min(capacidadeCarga * 0.01, 0.25);
        return TANQUE * (CONSUMO_BASE * (1 - reducao));
    }
}