public class sum_of_row_in_matrix {
    public static void main(String args[]){
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        int sum = 0;
        for(int j=0; j<nums[0].length; j++){
            sum = sum + nums[1][j];
        }
        System.out.println("sum is: " + sum);
    }
}
