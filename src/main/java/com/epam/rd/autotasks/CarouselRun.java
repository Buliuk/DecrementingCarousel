package com.epam.rd.autotasks;

import java.util.Arrays;

public class CarouselRun {
    public int next() {
       throw new UnsupportedOperationException();
    }

    public boolean isFinished() {
        throw new UnsupportedOperationException();
    }


    public static void main(String[] args) {
        DecrementingCarousel carousel = new DecrementingCarousel(7);
        System.out.println(carousel.addElement(2)); //true
        System.out.println(carousel.addElement(3)); //true
        System.out.println(carousel.addElement(1)); //true

        carousel.run();

        System.out.println(carousel.addElement(2)); //false
        System.out.println(carousel.addElement(3)); //false
        System.out.println(carousel.addElement(1)); //false
    }
}
