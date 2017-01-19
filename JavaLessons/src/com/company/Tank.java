package com.company;

public class Tank extends Machine{

    private int gun;

    public Tank(String color, int speed, int weight, int gun) {
        super(color, speed, weight);
        this.gun = gun;
    }

    public int getGun() {
        return gun;
    }

    public void setGun(int gun) {
        this.gun = gun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tank)) return false;
        if (!super.equals(o)) return false;

        Tank tank = (Tank) o;

        return getGun() == tank.getGun();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getGun();
        return result;
    }
}
