package entities;

import java.util.UUID;

public class Product {
    private UUID uuid;
    private String name;
    private double price;

    public Product(UUID uuid, String name, double price) {
        this.uuid = uuid;
        this.name = name;
        this.price = price;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
