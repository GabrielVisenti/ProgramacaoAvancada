package org.example;

class CarroEletrico extends Carro {
    private int bateriaKWh;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro, int bateriaKWh) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, tipoCarro);
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    public double calcularAutonomia() {
        return bateriaKWh * 5.0;
    }
}