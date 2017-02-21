public class MaxMin
{
  public static void main(String[] args)
  {
    int value = StdIn.readInt();
    int max = value;
    int min = value;

    while (!StdIn.isEmpty())
    {
      int num = StdIn.readInt();
      if (num > max) max = num;
      if (num < min) min = num;
    }
    StdOut.print("Max: " + max + " min: " + min);
    StdOut.println();
  }
}
