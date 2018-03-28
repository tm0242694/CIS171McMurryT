/*
 * Ty McMurry
 * 19.8 Shuffle ArrayList
 * copyright Mar 2018
 */
package pkg19_8_shuffle;

import java.util.ArrayList;

public class Main {

    
    public static void main(String [] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();//creatting arrary
        list.add(1);
        list.add(88);
        list.add(16);
        list.add(21);
        list.add(576);
        shuffle(list);//call to shuffle array
            
       for (int i = 0; i < list.size(); i++) 
       System.out.print(list.get(i) + " ");//initial input
        
    }
    public static <E> void shuffle(ArrayList<E> list) {// sorting list using math.random to pull by index number
        for (int i = 0; i < list.size() -1; i++) {
        int index = (int)(Math.random() * list.size());
            E temp = list.get(i);//using generic as temporay holder
            list.set(i, list.get(index));
            list.set(index, temp);
        }
    }
}
