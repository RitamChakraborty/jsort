package dev.ritam.jsort;

abstract class SortingUtil<T extends Comparable<T>> {
    protected T[] array;

    SortingUtil(T[] array) {
        this.array = array;
    }

    int getLength() {
        return array.length;
    }

    void swap(int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
