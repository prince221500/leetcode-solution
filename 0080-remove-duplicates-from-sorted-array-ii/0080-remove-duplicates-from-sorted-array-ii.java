class Solution {
    public int removeDuplicates(int[] nu) {

       int a = nu.length;
        if(a <=2){
            return a;
        }

        int j = 2;
        for(int i=2; i<a; i++){
            if(nu[i] != nu[j-2]){
                nu[j] = nu[i];
                j++;
            }
        }
        return j;

    }
}


