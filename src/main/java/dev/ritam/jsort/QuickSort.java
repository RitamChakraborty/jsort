package dev.ritam.jsort;

class QuickSort<T extends Comparable<T>> extends SortingUtil<T> implements Sorter<T> {
    QuickSort(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException();
    }
}
