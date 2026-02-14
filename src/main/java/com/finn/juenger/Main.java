package com.finn.juenger;

import java.time.LocalDate;

public class Main {
    static void main() {
        Homework hm1 = new Homework("1", LocalDate.of(2027,03,14));
        IO.println(hm1.getRemainingDays());
    }
}
