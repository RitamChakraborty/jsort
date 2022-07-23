package dev.ritam.jsort;

class SelectionSort<T extends Comparable<T>> extends SortingUtil<T> implements Sorter<T> {
    SelectionSort(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int i = 0; i < getLength(); ++i) {
            T temp = array[i];
            int swapIndex = i;

            for (int j = i + 1; j < getLength(); ++j) {
                if (temp.compareTo(array[j]) > 0) {
                    swapIndex = j;
                    temp = array[j];
                }
            }

            swap(i, swapIndex);
        }
    }
}
