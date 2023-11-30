public class pattern4 {

    public static void main(String[] args) {
      int n=4;
      int count=2;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if(i%2=0)
          System.out.print(count++ + " ");
        }
        System.out.println();
      }
    }
  }