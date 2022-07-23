package dev.ritam.jsort;

public class JSort {
    private JSort() {
    }

    public static <T extends Comparable<T>> void sort(T[] array, SortingAlgorithm sortingAlgorithm) {
        if (sortingAlgorithm == null)
            throw new IllegalArgumentException("SortingAlgorithm is undefined");

        Sorter<T> sorter = null;

        if (sortingAlgorithm == SortingAlgorithm.BUBBLE_SORT) {
            sorter = new BubbleSort<>(array);
        } else if (sortingAlgorithm == SortingAlgorithm.INSERTION_SORT) {
            sorter = new InsertionSort<>(array);
        } else if (sortingAlgorithm == SortingAlgorithm.SELECTION_SORT) {
            sorter = new SelectionSort<>(array);
        } else if (sortingAlgorithm == SortingAlgorithm.MERGE_SORT) {
            sorter = new MergeSort<>(array);
        } else if (sortingAlgorithm == SortingAlgorithm.QUICK_SORT) {
            sorter = new QuickSort<>(array);
        } else if (sortingAlgorithm == SortingAlgorithm.HEAP_SORT) {
            sorter = new HeapSort<>(array);
        } else if (sortingAlgorithm == SortingAlgorithm.BINARY_TREE_SORT) {
            sorter = new BinaryTreeSort<>(array);
        }

        if (sorter != null) {
            sorter.sort();
        } else {
            throw new NullPointerException("Unable to sort");
        }
    }
}
