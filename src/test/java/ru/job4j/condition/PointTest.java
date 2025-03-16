package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11To22Then1dot4142() {
        double expected = 1.4142;
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus11To2Minus2Then4dot2426() {
        double expected = 4.2426;
        int x1 = -1;
        int y1 = 1;
        int x2 = 2;
        int y2 = -2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when05To0Minus5Then5() {
        double expected = 10;
        int x1 = 0;
        int y1 = 5;
        int x2 = 0;
        int y2 = -5;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}