public class Plateau
{
  public static void main(String[] args)
  {
    int N = Integer.parseInt(args[0]);
    int[] array = new int[N];

    for (int i = 0; i < N; i++)
      array[i] = (int) (Math.random() * N) + 1;

    // for (int j = 0; j < N; j++)
    //   System.out.println(array[j]);
    int record = 0;
    int tracker = 0;

    for (int j = 2; j < array.length; j++)
    {
      // String shape = "";
      // int record = 0;
      // int tracker = 0;

      // if ((array[j] == array[j-1]) && (array[j-1] > array[j-2]))
      if (array[j] == array[j-1])
      {
        record++;
      }
    }
    System.out.println(tracker);
    System.out.println(record);

    for (int k = 0; k < array.length; k++)
      System.out.print(array[k] + " ");
  }
}
