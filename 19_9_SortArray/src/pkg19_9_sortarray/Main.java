/*
 *  Ty McMurry
 * 19.8 Shuffle ArrayList
 * copyright Mar 2018
 */
package pkg19_9_sortarray;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();//creatting arrary
        list.add(1);
        list.add(88);
        list.add(16);
        list.add(21);
        list.add(576);
        sort(list);//calling sort
    }
    public static <E extends Comparable<E>>//sorting list using for loop to compare largest to smallest
    void sort(ArrayList<E> list) {
        E currentMax;
        int currentMaxIndex;
        
        for (int i = 0; i < list.size() -1; i++) {
        currentMax = list[i];
        currentMaxIndex = i;
        
        for (int j = 0; j < list.size()-1; j++){//finding max falue
        if(currentMax.compareTo(list[j]) > 0) {
        currentMax = list[j];
        currentMaxIndex = j;
            }            
        }
        if (currentMaxIndex != i){ 
        list[currentMaxindex] = list[i];
        list[i] = currentMax;
      }
            
  }
        public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++)
        System.out.print(list[i] + " ");
        System.out.println();
 }
}
}