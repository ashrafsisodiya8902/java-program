public class advpattern3 {

    public static void main(String[] args) {
      int n=5; 
      int count=1;
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++){
    
          System.out.print(count);
          count+=2;
        }
        System.out.println();
      }
    }
  }