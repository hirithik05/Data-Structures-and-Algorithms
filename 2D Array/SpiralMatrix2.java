package Array_2D;

class SpiralMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        //start from first row,last column element
        int rowIndex = 0;
        int colIndex = col-1;
        while(rowIndex<row && colIndex>=0){
            int element = matrix[rowIndex][colIndex];
            if(element==target){
                return true;
            }
            else if(element<target){
                rowIndex++;
            }
            else{
                colIndex--;
            }
        }
        return false;
        
        
    }
    public static void main(String[] args) {
    	int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
    	int element = 5;
    	SpiralMatrix2 obj = new SpiralMatrix2();
    	System.out.println(obj.searchMatrix(arr, element));
    	
    }
}
