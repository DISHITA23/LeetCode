class Solution {
    public boolean threeFibonacciSum(int n) {
        if(n % 2!=0){
            return false;
        }
        int target=n/2;
        int a=0;
        int b=1;
        while(b<target){
            int c=a+b;
            a=b;
            b=c;
        }
        return b==target || a==target;
    }
}