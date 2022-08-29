package com.mcode.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TicTacToe {
    X(1), O(2);

    private Integer value;
}
