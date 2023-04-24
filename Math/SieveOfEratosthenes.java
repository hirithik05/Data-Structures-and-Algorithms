package Math;

import java.util.Arrays;

//This algorithm is used to print all prime number upto n;

class SieveOfEratosthenes {
    public int countPrimes(int n) {
        boolean[] array = new boolean[n];
        int count =0;
        Arrays.fill(array,true);
        // range from 2 ---> n
        for(int i=2;i<n;i++){
            if(array[i]){
                count++;
                for(int j=i*2;j<n;j=j+i){
                    array[j]=false;
                }
            }
        }
        return count;
  
    }
    public static void main(String[] args) {
    	SieveOfEratosthenes obj = new SieveOfEratosthenes();
    	System.out.println(obj.countPrimes(10));
    }
}
