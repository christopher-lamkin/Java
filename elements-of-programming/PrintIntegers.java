public class PrintIntegers
{
  public static void main(String[] args)
  {
    for (int i = 2000; i <= 5000; i++)
    {
      System.out.print(i + " ");
      if (i % 5 == 0) System.out.println("");
    }
  }
}
