import java.util.*;

public class TwoDimArray {
static Scanner scanner = new Scanner(System.in);

public static void main( String [] args ){
    int [][] twoDimArray;

    twoDimArray = allocateTwoDimArray();
    fillTwoDimArray(twoDimArray);
    printTwoDimArray(twoDimArray);// not shown here
} // end main

public static int [][] allocateTwoDimArray(){
    int dim1, dim2;

    System.out.print("Enter number of rows: ");
    dim1 = scanner.nextInt();
    System.out.print("Enter number of columns: ");
    dim2 = scanner.nextInt();
    // you should check if out of range here and adjust each
    return new int [dim1][dim2];
} // end allocateTwoDimArray

public static void fillTwoDimArray(int [][] twoDimArray){
    if( twoDimArray != null){
        for( int row=0; row < twoDimArray.length; ++row ){
            for( int col=0; col < twoDimArray[row].length; ++col ){
                twoDimArray[row][col]=10*row+col;
            } // end for col
        } // end for row
    }
} // end fillTwoDimArray

} // end class TwoDimArray
