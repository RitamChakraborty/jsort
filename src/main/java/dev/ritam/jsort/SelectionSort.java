package dev.ritam.jsort;

class SelectionSort<T extends Comparable<T>> extends SortingUtil<T> implements Sorter<T> {
    SelectionSort(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException();
    }
}
