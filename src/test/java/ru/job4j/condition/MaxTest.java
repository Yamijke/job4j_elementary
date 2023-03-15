package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To3To4Then4() {
        int left = 1;
        int right = 2;
        int west = 3;
        int east = 4;
        int result = Max.max(left, right, west, east);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To7To8Then3() {
        int left = 10;
        int right = 7;
        int west = 8;
        int result = Max.max(left, right, west);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}