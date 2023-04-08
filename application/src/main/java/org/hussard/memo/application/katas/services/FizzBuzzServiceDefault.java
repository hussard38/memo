package org.hussard.memo.application.katas.services;

import lombok.RequiredArgsConstructor;
import org.hussard.memo.business.adapter.in.KataFizzBuzz;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FizzBuzzServiceDefault implements FizzBuzzService{
    private final KataFizzBuzz kataFizzBuzz;
    @Override
    public String fizzBuzz(int value) {
        return kataFizzBuzz.fizzBuzz(value);
    }
}
