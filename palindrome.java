public class palindrome {
    public static void main(String[]args){
        String str="Adinath";
        int s1=str.length();
        System.out.println(str.toLowerCase());
        System.out.println("length is" +s1);
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("no is palindrome");
        }
        else
        {
            System.out.println("no is not palindrome");
        }
    }
}
