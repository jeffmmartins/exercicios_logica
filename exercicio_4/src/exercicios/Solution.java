package exercicios;

class Solution {
    public int lengthOfLastWord(String s) {
        String [] newString = s.split(" ");
        String k = "";
        for (int i = 0 ; i < newString.length; i++ ){
            if (newString.length - 1 == i){
                 k = newString[i];
            }
        }
        return k.split("").length;
    }
}
