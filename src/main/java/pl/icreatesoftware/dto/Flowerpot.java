package pl.icreatesoftware.dto;

import java.util.UUID;

public class Flowerpot extends BasicData {

    private final int size;
    private final int waterLevel;

    private Flowerpot(int size, int waterLevel) {
        this.id = UUID.randomUUID();
        this.size = size;
        this.waterLevel = waterLevel;
    }

    public static Flowerpot of(int size, int waterLevel) {
        return new Flowerpot(size, waterLevel);
    }

    public int getSize() {
        return size;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public UUID getId() {
        return id;
    }
}
