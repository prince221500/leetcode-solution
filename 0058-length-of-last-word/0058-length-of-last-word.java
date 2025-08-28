class Solution {

    public static int lengthOfLastWord(String a) {
        a = a.trim();
        int lastSpaceIndex = a.lastIndexOf(" ");
        return a.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        String a1 = "Hello World";
        System.out.println(lengthOfLastWord(a1));

        String a2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(a2));

        String a3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(a3));
    }
}