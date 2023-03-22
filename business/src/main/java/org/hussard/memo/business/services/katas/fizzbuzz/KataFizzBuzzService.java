package org.hussard.memo.business.services.katas.fizzbuzz;

import org.hussard.memo.business.adapter.in.KataFizzBuzz;

public class KataFizzBuzzService implements KataFizzBuzz {
    @Override
    public String fizzBuzz(int value) {
        if(value == 3){
            return "Fizz";
        }
        return String.valueOf(value);
    }
}
