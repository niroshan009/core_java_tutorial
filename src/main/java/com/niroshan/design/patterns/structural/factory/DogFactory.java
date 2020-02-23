package com.niroshan.design.patterns.structural.factory;

public class DogFactory {

    public static Dog getDog(DogType dogType){
        Dog d = null;
        if(dogType.equals(DogType.PITBULL)){
            d =  new Pitbull();
        }
        else if(dogType.equals(DogType.GOLDEN_RETREIVER)){
            d =  new GoldenRetreiver();
        }

        return d;

    }
}
