package org.hussard.memo.business.services.katas.fizzBuzz;

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
}
