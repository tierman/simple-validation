package pl.icreatesoftware.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class Flower extends BasicData {

    private final String name;
    private final LocalDateTime cutDate;
    private final String color;
    private final FlowerType type;

    private Flower(String name, LocalDateTime cutDate, String color, FlowerType type) {
        this.color = color;
        this.id = UUID.randomUUID();
        this.name = name;
        this.cutDate = cutDate;
        this.type = type;
    }

    public static Flower of(String name, LocalDateTime cutDate, String color,FlowerType type) {
        return new Flower(name, cutDate, color, type);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCutDate() {
        return cutDate;
    }

    public FlowerType getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
