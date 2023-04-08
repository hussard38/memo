package org.hussard.memo.application.katas.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class FizzBuzzDto {
    private final int value;
    private final String response;
}
