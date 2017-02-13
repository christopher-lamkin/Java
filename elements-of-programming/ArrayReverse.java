public class ArrayReverse
{
  public static void main(String[] args)
  {
    int N = Integer.parseInt(args[0]);

    int[] array = new int[N];

    for (int i = 0; i < array.length; i++)
      array[i] = i;

    for (int i = 0; i < N / 2; i++)
    {
      int t = 0;
      t = array[( N - 1 ) - i];
      array[(N - 1) - i] = array[i];
      array[i] = t;

    }
    for (int i = 0; i < array.length; i++)
      System.out.print(array[i] + " ");
  }
}
