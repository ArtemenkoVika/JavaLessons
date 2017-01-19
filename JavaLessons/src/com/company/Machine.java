package com.company;

abstract public class Machine {

    private String color;
    private int speed;
    private int weight;

    public Machine(String color, int speed, int weight) {
        this.color = color;
        this.speed = speed;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Machine machine = (Machine) o;

        if (speed != machine.speed) return false;
        if (weight != machine.weight) return false;
        return color != null ? color.equals(machine.color) : machine.color == null;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + speed;
        result = 31 * result + weight;
        return result;
    }
}
