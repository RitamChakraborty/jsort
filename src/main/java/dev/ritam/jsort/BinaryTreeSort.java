package dev.ritam.jsort;

class BinaryTreeSort<T extends Comparable<T>> extends SortingUtil<T> implements Sorter<T> {
    BinaryTreeSort(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException();
    }
}
