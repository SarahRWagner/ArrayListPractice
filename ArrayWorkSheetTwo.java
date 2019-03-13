import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayWorkSheetTwo
{
    public static void main(String[] args) {

        ArrayList<Integer> example = new ArrayList<Integer>(); // reference to the list
        example.add(5);
        example.add(7);

        example.add(6); // adding a value to the end of the list
        example.add(0, 4); // adding a value to the beginning of the list


        System.out.println(example); //prints out the list

        example.remove(0); // removes the value at index 0

        int size = example.size(); // this computes the size of the ArrayList
        // doubleList(size);

        int midIndex = evenOrOdd(size); // finding the mid index

        example.add(midIndex, 4); // adding an element to the mid index

        int[] exampleArr = ArrayUtils.toPrimitive(example.toArray(new Integer[example.size()])); // using the Apache Commons methods, this converts an ArrayList to an Array
                                                                                                    //holds primitive data types.


    } // end of main method

    public static int evenOrOdd(int size)
    {
        if(size%2 == 0) // is the size of the list even?
        {
            int mid = size/2;
            return mid;
        }

        else // is the size of the list odd?
        {
            int mid = size/2;
            return mid;
        }

    } // end of evenOrOdd method


    /* Since an ArrayList expands and contracts as you add values to it, "doubling the amount of space" tends to
            happen anyway. I tried to make a method that would "double" the size of the ArrayList, but it didn't
            work. The return doubledExample; line still has 0 as the size since there is nothing to fill it in.*/

//    public static ArrayList<Integer> doubleList(int size)
//    {
//     int newSize = size*2;
//     ArrayList<Integer> doubledExample = new ArrayList<Integer>(newSize);
//     return doubledExample;
//    } //end of doubleList method



} // end of program
