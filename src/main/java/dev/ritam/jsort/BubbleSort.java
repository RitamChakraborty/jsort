package dev.ritam.jsort;

class BubbleSort<T extends Comparable<T>> extends SortingUtil<T> implements Sorter<T> {
    BubbleSort(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException();
    }
}
