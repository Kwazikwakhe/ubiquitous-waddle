import java.util.Random;
class SquareMatrix {

  public static void main(String[] args){

       // System.out.println("Question 1: Square Matrix\nVyasa Aiyer - 222003978\n");

        SquareMatrix mat1 = new SquareMatrix(6, 6);
        SquareMatrix mat2 = new SquareMatrix(2,2);
        SquareMatrix mat3 = new SquareMatrix(3,3);
        mat1.displaySquareMatrix();
        
        mat1.getGreatestSumRow();

        mat1.getLeastSumColumn();
    }
    public int[][] matrix;
    
     public SquareMatrix(int rows, int columns) {
    matrix = new int[rows][columns];
       for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix.length; j++) {
            matrix[i][j] = (int)(Math.random()*21);    
          } 
       } 
     }
     public void displaySquareMatrix(){
        int row = 0;
       int col = 0;
       for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix.length; j++) {
             System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
       }      
 }
    public int[] getGreatestSumRow() {
        int greatestSum = matrix[0][0];
        int currentGreatestRow = 0;
        int currentRowSum;

        for (int i = 0; i < matrix.length; i++) {
            currentRowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                currentRowSum += matrix[i][j];
            }

            if (currentRowSum > greatestSum) {
                greatestSum = currentRowSum;
                currentGreatestRow = i;
            }
        }
        System.out.println("The Row with greatest sum is :"  + currentGreatestRow);
        // display1DArray(matrix[currentGreatestRow]);
        return matrix[currentGreatestRow];
    }

    public int[] getLeastSumColumn() {

        // Sum all column values - add to a 1D array

        int[] columnSums = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                columnSums[j] += matrix[i][j];
       
            }
        }

        // determine which columns sum is the smallest

        int leastSum = columnSums[0];
        int leastSumColumn = 0;

        for (int i = 0; i < columnSums.length; i++) {
            if (columnSums[i] < leastSum) {
                leastSum = columnSums[i];
                leastSumColumn = i;
            }
            //System.out.println(columnSums[i]+ " ");
        }
        System.out.println();
        // get the column values in a 1d array

        // number of column values = num rows
        int[] columnArray = new int[matrix.length];

        for (int rows = 0; rows < matrix.length; rows++) {
            columnArray[rows] = matrix[rows][leastSumColumn];
            
             System.out.println(columnArray[rows] + " ");
        }
         System.out.println();
        return columnArray;
    }
   
   
}