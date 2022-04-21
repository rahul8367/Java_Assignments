package Assignment2;

public class IsContainsAlphabets {
    public IsContainsAlphabets(String s) {
        if (s == null)
            System.out.println("In string is all the letters are not the alphabet");

        else {
            int flag = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                    System.out.println("In string  all the letters are not the alphabet");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("In string  all the letters are alphabet");
            }
        }
    }
        public static void main(String[] args)
        {

            String s = "rahul";
            IsContainsAlphabets obj=new IsContainsAlphabets(s);
        }


}
