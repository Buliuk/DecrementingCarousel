package com.epam.rd.autotasks;

public class DecrementingCarousel {
   private final int [] CAPACITY_ARR ;
   private static int counter;
   private static CarouselRun instance;

    public DecrementingCarousel(int capacity) {
        CAPACITY_ARR = new int[capacity];
    }

    public boolean addElement(int element){
        if (counter < getCAPACITY_ARR().length && element > 0 && instance == null){
            CAPACITY_ARR [counter] = element;
            counter++;
            return true;
        } else return false;
    }

    public CarouselRun run(){
        if (instance == null) {
            instance = new CarouselRun();
            return instance;
        } else return null;
    }

    public int[] getCAPACITY_ARR() {
        return CAPACITY_ARR;
    }
}
