package com.isa.beans;

import javax.enterprise.context.RequestScoped;
import java.util.Random;

@RequestScoped
public class RandomNumberBean implements RandomNumber {
    public int getRandomNumber() {
        return new Random().nextInt();
    }
}
