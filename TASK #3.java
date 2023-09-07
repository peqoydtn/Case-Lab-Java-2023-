public class Strings {
    public static boolean is_polindrom(String arg) {
        for (int i = 0; i < arg.length() / 2; ++i)
        {
            int j = arg.length() - i - 1;
            if (arg.charAt(i) != arg.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]) {
      String a = "abacaba";
      System.out.println(Strings.is_polindrom(a));
      a = "abacabad";
      System.out.println(Strings.is_polindrom(a));
    }
}