package org.hussard.memo.business.services.katas.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.hussard.memo.business.adapter.in.KataFizzBuzz;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * Si le nombre est divisible par 3, on le remplace par “Fizz” ;
 * Si le nombre est divisible par 5, on le remplace par “Buzz” ;
 * Si le nombre est divisible par 3 et 5, alors on le remplace par “FizzBuzz” ;
 * Par défaut, retourner le nombre.
 */
class KataFizzBuzzServiceStepOneTest {

     private static Stream<Arguments> provideStepOne() {
         return Stream.of(
                 Arguments.of(1, "1"),
                 Arguments.of(2, "2"),
                 Arguments.of(3, "Fizz"),
                 Arguments.of(4 , "4"),
                 Arguments.of(5 , "Buzz"),
                 Arguments.of(6 , "Fizz"),
                 Arguments.of(15 , "FizzBuzz"),
                 Arguments.of(30 , "FizzBuzz")
         );
     }

    @ParameterizedTest(name = "{index} : [input]:{0} => [ouput] {1}")
    @MethodSource("provideStepOne")
    void fizzBuzz_StepOne(int value, String result){
        KataFizzBuzz kata = new KataFizzBuzzService();
        String actual = kata.fizzBuzz(value);
        Assertions.assertThat(actual).isNotBlank().isEqualTo(result);
    }

}
