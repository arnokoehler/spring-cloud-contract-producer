package com.portofrotterdam.contract.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class Boat {

    private final int id;
    private final String name;
    private final int depth;

}
