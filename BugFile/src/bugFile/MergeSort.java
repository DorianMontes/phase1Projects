package bugFile;

import java.util.ArrayList;

 

public class MergeSort {

    private ArrayList<Integer> list;

    public MergeSort(ArrayList<Integer> input) {
        list = input;
    }

    

    public void sort() {
        list = mergeSort(list);
    }


    public ArrayList<Integer> mergeSort(ArrayList<Integer> whole) {
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        int center;

        if (whole.size() == 1) {   
            return whole;
        } else {
            center = whole.size()/2;
            for (int i=0; i<center; i++) {
                    left.add(whole.get(i));
            }

            for (int i=center; i<whole.size(); i++) {
                    right.add(whole.get(i));
            }

            left  = mergeSort(left);
            right = mergeSort(right);

            merge(left, right, whole);
        }
        return whole;
    }
 
    

       private void merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> whole) {

           int leftIndex = 0;
           int rightIndex = 0;
           int wholeIndex = 0;

           while (leftIndex < left.size() && rightIndex < right.size()) {
               if ( (left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
                   whole.set(wholeIndex, left.get(leftIndex));
                   leftIndex++;
               } else {
                   whole.set(wholeIndex, right.get(rightIndex));
                   rightIndex++;
               }
               wholeIndex++;
           }

      
           ArrayList<Integer> temp;
           int tempIndex;
           if (leftIndex >= left.size()) {
               temp = right;
               tempIndex = rightIndex;
           } else {
               temp = left;
               tempIndex = leftIndex;
           }

 
           for (int i=tempIndex; i<temp.size(); i++) {
               whole.set(wholeIndex, temp.get(i));
               wholeIndex++;
           }
       }

      
       public void show() {
           System.out.println("Sorted Expenses:");
           for (int i=0; i< list.size();i++) {
               System.out.println(list.get(i));
           }
       }
}