package org.hussard.memo.business.services.katas.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.hussard.memo.business.adapter.in.KataFizzBuzz;
import org.junit.jupiter.api.Test;
 class KataFizzBuzzServiceTest {
    @Test
    void fizzBuzz_checkOne_ReturnOne(){
        KataFizzBuzz kata = new KataFizzBuzzService();
        String actual = kata.fizzBuzz(1);
        Assertions.assertThat(actual).isNotBlank().isEqualTo("1");
    }
     @Test
     void fizzBuzz_checkTwo_ReturnTwo(){
         KataFizzBuzz kata = new KataFizzBuzzService();
         String actual = kata.fizzBuzz(2);
         Assertions.assertThat(actual).isNotBlank().isEqualTo("2");
     }
     @Test
     void fizzBuzz_checkTree_ReturnFizz(){
         KataFizzBuzz kata = new KataFizzBuzzService();
         String actual = kata.fizzBuzz(3);
         Assertions.assertThat(actual).isNotBlank().isEqualTo("Fizz");
     }
     @Test
     void fizzBuzz_checkFour_ReturnFour(){
         KataFizzBuzz kata = new KataFizzBuzzService();
         String actual = kata.fizzBuzz(4);
         Assertions.assertThat(actual).isNotBlank().isEqualTo("4");
     }
     @Test
     void fizzBuzz_checkFive_ReturnBuzz(){
         KataFizzBuzz kata = new KataFizzBuzzService();
         String actual = kata.fizzBuzz(5);
         Assertions.assertThat(actual).isNotBlank().isEqualTo("Buzz");
     }
     @Test
     void fizzBuzz_checkSix_ReturnFizz(){
         KataFizzBuzz kata = new KataFizzBuzzService();
         String actual = kata.fizzBuzz(6);
         Assertions.assertThat(actual).isNotBlank().isEqualTo("Fizz");
     }
     @Test
     void fizzBuzz_checkFifteen_ReturnFizzBuzz(){
         KataFizzBuzz kata = new KataFizzBuzzService();
         String actual = kata.fizzBuzz(15);
         Assertions.assertThat(actual).isNotBlank().isEqualTo("FizzBuzz");
     }
}
