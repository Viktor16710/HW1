class Solution {
    public String reverseWords(String s) {
        String text = "";
        String[] array = s.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            text += array[i] + " ";
        }
        return text;
    }
}