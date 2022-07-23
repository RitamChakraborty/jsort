package dev.ritam.jsort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InsertionSortTest {
    InsertionSort<Integer> underTest;

    @Test
    @DisplayName("Should sort integers correctly")
    void should_sort_integers_correctly() {
        // Given
        Integer[] actual = new Integer[]{4, 1, 5, 2, 3};
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5};
        underTest = new InsertionSort<>(actual);

        // When
        underTest.sort();

        // Then
        Assertions.assertArrayEquals(expected, actual);
    }
}