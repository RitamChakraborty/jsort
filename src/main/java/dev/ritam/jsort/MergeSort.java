package dev.ritam.jsort;

class MergeSort<T extends Comparable<T>> extends SortingUtil<T> implements Sorter<T> {
    MergeSort(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException();
    }
}
