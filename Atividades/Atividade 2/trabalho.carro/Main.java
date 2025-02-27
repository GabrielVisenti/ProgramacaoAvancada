package org.example;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Honda", "Civic", 2021, 5, "Gasolina", "Sedan");
        Caminhao caminhao = new Caminhao("Volvo", "FH 540", 2024, 2, "Diesel", 10);
        Onibus onibus = new Onibus("Mercedes-Benz", "O 500 RSD", 2024, 48, "Diesel", 6);
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model 3", 2023, 5, "Eletrico", "Sedan", 75);
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", " P 280", 2024, 2, "Diesel", 15, -20);

        carro.exibirDetalhes();
        System.out.println("Autonomia: " + carro.calcularAutonomia() + " km\n");

        caminhao.exibirDetalhes();
        System.out.println("Autonomia: " + caminhao.calcularAutonomia() + " km\n");

        onibus.exibirDetalhes();
        System.out.println("Autonomia: " + onibus.calcularAutonomia() + " km\n");

        carroEletrico.exibirDetalhes();
        System.out.println("Autonomia: " + carroEletrico.calcularAutonomia() + " km\n");

        caminhaoRefrigerado.exibirDetalhes();
        System.out.println("Autonomia: " + caminhaoRefrigerado.calcularAutonomia() + " km\n");
    }
}