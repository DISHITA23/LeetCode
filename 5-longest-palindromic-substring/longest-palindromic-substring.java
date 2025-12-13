class Solution {
    public String longestPalindrome(String s) {
        String longestP="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String substring=s.substring(i,j+1);
                if(isPalindrome(substring) && substring.length()>longestP.length())
                {
                    longestP=substring;
                }
            }
        }
        return longestP;
    }
    public boolean isPalindrome(String p)
    {
        int left=0;
        int right=p.length()-1;
        while(left<right)
        {
            if(p.charAt(left)!=p.charAt(right))
            {
                return false;
            }
                left++;
                right--;
        }
                return true;
            }
        }
        
    

    