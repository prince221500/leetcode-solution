class Solution {
    public boolean isHappy(int n) {

        if(n==1 || n==7) {
             return true;
        }
        else if(n<9) {
            return false;
        }
         else{
            int sum=0;
            while(n>=1){
                int temp=n%10;
                sum+= temp*temp;
                n=n/10;
            }
           return isHappy(sum);
        }
    }
}