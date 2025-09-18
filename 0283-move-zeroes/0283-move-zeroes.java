class Solution {
    public void moveZeroes(int[] array) {
        int nz = 0; 
        
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[nz] = array[i];
                nz++;
            }
        }
        
        
        for (int i = nz; i < array.length; i++) {
            array[i] = 0;
        }
    }
}

