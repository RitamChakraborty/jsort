package dev.ritam.jsort;

class InsertionSort<T extends Comparable<T>> extends SortingUtil<T> implements Sorter<T> {
    InsertionSort(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException();
    }
}
