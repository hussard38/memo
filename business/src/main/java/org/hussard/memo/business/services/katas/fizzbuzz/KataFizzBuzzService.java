package org.hussard.memo.business.services.katas.fizzbuzz;

import org.hussard.memo.business.adapter.in.KataFizzBuzz;

public class KataFizzBuzzService implements KataFizzBuzz {
    @Override
    public String fizzBuzz(int value) {

        if(isFizzBuzz(value)){
            return "FizzBuzz";
        }
        if(isFizz(value)){
            return "Fizz";
        }
        if(isBuzz(value)){
            return "Buzz";
        }
        //default value
        return String.valueOf(value);
    }

    private  boolean isBuzz(int value) {
        return (value % 5) == 0 || String.valueOf(value).contains("5");
    }

    private  boolean isFizz(int value) {
        return (value % 3) == 0 || String.valueOf(value).contains("3");
    }

    private boolean isFizzBuzz(int value) {
        return (value % 3) == 0 && (value % 5) == 0;
    }
}
