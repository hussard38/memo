package org.hussard.memo.application.katas.controller;

import lombok.RequiredArgsConstructor;
import org.hussard.memo.application.katas.dto.FizzBuzzDto;
import org.hussard.memo.application.katas.services.FizzBuzzService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = {"/api/kata"})
public class FizzBuzzController {
    private final FizzBuzzService fizzBuzzService;

    @GetMapping("fizzbuzz")
    public ResponseEntity<FizzBuzzDto> getFizzbuzz(@RequestBody FizzBuzzDto fizzBuzzDto) {
        String s = fizzBuzzService.fizzBuzz(fizzBuzzDto.getValue());
        return new ResponseEntity<>(new FizzBuzzDto(fizzBuzzDto.getValue(),s), HttpStatus.OK);
    }
}
