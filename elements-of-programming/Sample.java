public class Sample
{
  public static void main(String[] args)
  {
    int M = Integer.parseInt(args[0]);
    int N = Integer.parseInt(args[1]);
    int[] perm = new int[N];

    // Initialize perm array

    for (int j = 0; j < N; j++)
      perm[j] = j;

    // take Sample

    for (int i = 0; i < M; i++)
    {
      int random = i + (int) (Math.random() * (N-i));
      int t = perm[random];
      perm[random] = perm[i];
      perm[i] = t;
    }

    // print Sample

    for (int i = 0; i < M; i++)
      System.out.print(perm[i] + " ");
    System.out.println();
  }
}
