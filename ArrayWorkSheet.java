import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;

/**
 * @author Sarah Wagner
 * @version 1.0
 * This class deals with the Array side of the homework. It deals with adding and removing from an array. It references and prints
 * an array. This class only uses traditional arrays.
 */
public class ArrayWorkSheet {

    public static void main(String[] args) {

        int[] oldArray = {2, 3, 4, 5};  // reference to an array
        int size = ArrayUtils.getLength(oldArray); // this calculates the size of the list

        int[] newArray = ArrayUtils.add(oldArray, 0,1); // adding a new value to the beginning of the array
        int[] expectedArray = {1, 2, 3, 4, 5}; // after adding the new element, the array should look like this
        Arrays.equals(newArray, expectedArray); //checks the new array to expected results


        int[] newEndArray = ArrayUtils.add(oldArray, oldArray.length, 6); // adding a new value to the end of the array
        int[] expectedEndArray = {2, 3, 4, 5, 6}; // what the array should look like
        Arrays.equals(newEndArray, expectedEndArray); // checking new array to expected



        int mid = evenOrOdd(oldArray); // this is the middle index value of the array
        addPos(oldArray,mid, 6); // this sends off to method to add the value in the middle

        int[] oldArray2 = { 1, 2, 3, 3, 4 }; // another example array to test
        int[] newArray2 = ArrayUtils.removeElement(oldArray2, 3); // call the apache commons method to remove
        int[] expectedArray2 = { 1, 2, 3, 4 }; // the extra 3 should be completely removed and the index of the other elements will have shifted.

        Arrays.equals(newArray2, expectedArray2); // make sure the new and expected are the same.

        for(int i = 0; i < oldArray.length; i++) //printing the list out
        {
            System.out.println(oldArray[i]);
        }

        doubleArray(oldArray); // this sends an array to have its index doubled





    } // end of main method

    /**
    @param a array  the array you want to find out whether the array is even or odd
     @return this returns the middle index value as an int
     */


    public static int evenOrOdd(int[] a)
    {
        if(a.length%2 == 0) // is the index even?
        {
            int mid = a.length/2;
            return mid;
        }

        else // is the index odd?
        {
            int mid = a.length/2;
            return mid;
        }

    } // end of evenOrOdd method

    /**
    @param a     the array you want to add a middle value to
     @param pos         this is the index position you want to place
     @param num        this is the number you want to place into the middle of the array
     @return   it will return the new array with the new middle value added.
     */
    public static int[] addPos(int[] a, int pos, int num)
    {
        int[] result = new int[a.length+1];
        for(int i = 0; i < pos; i++)
            result[i] = a[i];

        result[pos] = num;
        for(int i = pos + 1; i < a.length+1; i++)
            result[i] = a[i -1];

        return result;
    } //end of addPoS method

    /**
     * @param old this is the array you want to double the size of
     * @return this will return the new int array that will have a doubled index than the old array
     */
    public static int[] doubleArray(int[] old)
    {
        int[] doubled = new int[old.length * 2];
        for (int i = 0; i < old.length; i++) {
            doubled[i] = old[i];
        }
        return doubled;
    } // end of doubleArray method

} // end of class
