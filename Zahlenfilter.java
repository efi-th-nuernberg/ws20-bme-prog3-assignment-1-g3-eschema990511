class Zahlenfilter {
  public static void main(String[] args) {
    for(int i = 1; i<=200; i++)
    {
      int sum = i + (i-1);
      if(i%5 == 0) System.out.println(i+" ist durch 5 teilbar!");
      if(i%10 == 9) System.out.println(i+" endet auf 9");
      if(sum%3 == 0) System.out.println(i+" und "+ (i-1) +" addiert ergeben "+ sum +" und "+ sum +" ist durch 3 teilbar");
    }
  }
}