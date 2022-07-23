package dev.ritam.jsort;

class InsertionSort<T extends Comparable<T>> extends SortingUtil<T> implements Sorter<T> {
    InsertionSort(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int i = 1; i < getLength(); ++i) {
            T temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(temp) > 0) {
                array[j + 1] = array[j];
                --j;
            }

            array[j + 1] = temp;
        }
    }
}
