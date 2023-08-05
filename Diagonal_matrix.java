package TwoDimensionalArray;

public class Diagonal_matrix {
    public static int diagonalSum(int matrix[][]){
    // optimised code as Time Complexity is o(n)
      int sum = 0;
      for(int i=0; i<matrix.length; i++){
        //primary diagonal(pd)
            sum += matrix[i][i];
        //secondary diagonal(sd)
            if(i != matrix.length-1-i)
                sum += matrix[i][matrix.length-i-1];
      }
       return sum;
        }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}}; 
        System.out.println(diagonalSum(matrix));
      }
    }
 




    
