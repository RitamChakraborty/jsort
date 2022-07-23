package dev.ritam.jsort;

class HeapSort<T extends Comparable<T>> extends SortingUtil<T> implements Sorter<T> {
    HeapSort(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException();
    }
}
