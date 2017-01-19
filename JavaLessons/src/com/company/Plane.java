package com.company;

public class Plane extends Machine{

    private int maxHeight;

    public Plane(String color, int speed, int weight, int maxHeight) {
        super(color, speed, weight);
        this.maxHeight = maxHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        if (!super.equals(o)) return false;

        Plane plane = (Plane) o;

        return getMaxHeight() == plane.getMaxHeight();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getMaxHeight();
        return result;
    }
}
