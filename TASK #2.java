public class swaper {
    int first;
    int second;
    public void swap() {
        first ^= second;
        second ^= first;
        first ^= second;
    }
    
    public static void main(String args[]) {
      swaper a = new swaper();
      a.first = 10;
      a.second = 25;
      a.swap();
      System.out.println(a.first + " " + a.second);
    }
}