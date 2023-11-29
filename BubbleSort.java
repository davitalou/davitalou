package project.defaultsorting;

import project.display.SortingDisplay;

public class BubbleSort extends Sorting {
    public BubbleSort(int[] values) {
        super(values);
        this.sortingDisplay = new SortingDisplay();
        this.sortingDisplay.setValues(values); // Pass the values array to SortingDisplay
        this.sortingDisplay.setVisible(true);
    }

    @Override
    public void sort() {
        int n = values.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                this.accessCount++;

                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    this.swapCount++;
                    sortingDisplay.repaint();
                    sortingDisplay.sleep();
                }
                this.comparisons++;
            }
        }
    }
}
