package com.workintech.pool;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double height, double width, double length) {
        super(width, length);  // Rectangle sınıfına width ve length değerlerini gönderiyoruz
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        // Hacim hesaplamasında getArea() metodunu kullanıyoruz
        return getArea() * height;
    }
}
