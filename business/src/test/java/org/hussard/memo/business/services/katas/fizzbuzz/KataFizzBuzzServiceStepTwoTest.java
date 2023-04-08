package org.hussard.memo.business.services.katas.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.hussard.memo.business.adapter.in.KataFizzBuzz;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * La fonction retourne “Fizz” si le nombre est un multiple de 3 ou s’il contient un 3 ;
 * La fonction retourne “Buzz” si le nombre est un multiple de 5 ou s’il contient un 5.
 */
class KataFizzBuzzServiceStepTwoTest {


    private static Stream<Arguments> provideStepTwo() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(2, "2"),
                Arguments.of(3, "Fizz"),
                Arguments.of(4, "4"),
                Arguments.of(5, "Buzz"),
                Arguments.of(6, "Fizz"),
                Arguments.of(10 , "Buzz"),
                Arguments.of(11 , "11"),
                Arguments.of(12 , "Fizz"),
                Arguments.of(13 , "Fizz"),
                Arguments.of(15 , "FizzBuzz"),
                Arguments.of(33 , "Fizz"),
                Arguments.of(51 , "Fizz"),
                Arguments.of(52 , "Buzz"),
                Arguments.of(60 , "FizzBuzz"),
                Arguments.of(61 , "61"),
                Arguments.of(62 , "62"),
                Arguments.of(69,"Fizz"),
                Arguments.of(70,"Buzz"),
                Arguments.of(71 ,"71"),
                Arguments.of(72,"Fizz"),
                Arguments.of(73,"Fizz"),
                Arguments.of(74,"74"),
                Arguments.of(75,"FizzBuzz"),
                Arguments.of(76,"76"),
                Arguments.of(77,"77"),
                Arguments.of(78,"Fizz"),
                Arguments.of(79,"79")
        );
    }
    @ParameterizedTest(name = "{index} : [input]:{0} => [ouput] {1}")
    @MethodSource("provideStepTwo")
    void fizzBuzz_StepTwo(int value, String result){
        KataFizzBuzz kata = new KataFizzBuzzService();
        String actual = kata.fizzBuzz(value);
        Assertions.assertThat(actual).isNotBlank().isEqualTo(result);
    }
}
