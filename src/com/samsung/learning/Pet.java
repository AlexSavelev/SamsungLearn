package com.samsung.learning;

public class Pet {
    private static int currentId = 0;

    private final int id;
    private String name;
    private String ownerName;
    private String type;
    private int[] visits; // Timestamp

    public Pet(String name, String ownerName, String type) {
        this.id = currentId++;
        this.name = name;
        this.ownerName = ownerName;
        this.type = type;
        this.visits = new int[0];
    }

    public Pet() {
        this("", "", "");
    }

    @Override
    public String toString() {
        return String.format("Pet #%d: name is %s, owner is %s, type is %s", this.id, this.name, this.ownerName, this.type);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getType() {
        return type;
    }

    public int[] getVisits() {
        return visits;
    }

    public int getLastVisit() {
        return this.visits[this.visits.length - 1];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addVisit(int time) {
        int[] buffer = new int[this.visits.length];
        for(int i = 0; i < this.visits.length; ++i)
            buffer[i] = this.visits[i];
        this.visits = new int[buffer.length + 1];
        for(int i = 0; i < buffer.length; ++i)
            this.visits[i] = buffer[i];
        this.visits[buffer.length] = time;
    }

}
