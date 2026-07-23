class Solution {
    public String reverseOnlyLetters(String s) {
        char[] Char=s.toCharArray();
        int left=0;int right=s.length()-1;
        while(left<right){
            if(!Character.isLetter( Char[left])){left++;}
           else if(!Character.isLetter( Char[right])){right--;}
           else{
           char temp=Char[left];
           Char[left]=Char[right];
           Char[right]=temp;
           left++;
           right--;
   }
}
return new String(Char);
             }
        }
