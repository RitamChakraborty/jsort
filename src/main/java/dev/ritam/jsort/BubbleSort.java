package dev.ritam.jsort;

class BubbleSort<T extends Comparable<T>> extends SortingUtil<T> implements Sorter<T> {
    BubbleSort(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int i = 0; i < getLength(); ++i) {
            for (int j = i + 1; j < getLength(); ++j) {
                if (array[i].compareTo(array[j]) > 0) {
                    swap(i, j);
                }
            }
        }
    }
}
