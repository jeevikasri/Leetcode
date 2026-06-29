class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp1=0, original=num;
        while(num>0){
            int digit=num%10;
            temp1=temp1*10+digit;
            num=num/10;
        }
        int temp2=0;
        while(temp1>0){
            int digit=temp1%10;
            temp2=temp2*10+digit;
            temp1=temp1/10;
        }
        if(temp2==original){
            return true;
        }
        else{
            return false;
        }
    }
}
