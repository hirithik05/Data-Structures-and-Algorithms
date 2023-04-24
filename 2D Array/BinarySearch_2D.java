package Array_2D;

class BinarySearch_2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int end  = row*col-1;

        while(start<=end){
            int mid = (start)+(end-start)/2;
            int element = matrix[mid/col][mid%col];
            if(element==target){
                return true;
            }
            else if(element<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }mid = (start)+(end-start)/2;
        }
        return false;
    }
    public static void main(String[] args) {
    	int[][] array = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    	int element = 13;
    	BinarySearch_2D obj = new BinarySearch_2D();
    	System.out.println(obj.searchMatrix(array, element));
    	
    }
}
