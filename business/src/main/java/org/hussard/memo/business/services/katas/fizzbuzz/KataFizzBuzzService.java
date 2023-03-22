package org.hussard.memo.business.services.katas.fizzbuzz;

import org.hussard.memo.business.adapter.in.KataFizzBuzz;

public class KataFizzBuzzService implements KataFizzBuzz {
    @Override
    public String fizzBuzz(int value) {

        return String.valueOf(value);
    }
}
