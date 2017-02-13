public class Sample
{
  public static void main(String[] args)
  {
    int M = Integer.parseInt(args[0]);
    int N = Integer.parseInt(args[1]);
    int[] perm = new int[N];

    // Initialize perm array

    for (int j = 0; j < N; j++)
    {
      perm[j] = j;
      System.out.print(perm[j] + " ");
    }
      System.out.println("");

    // take Sample


    for (int i = 0; i < M; i++)
    {

      System.out.println("_____________________");

      int random = i + (int) (Math.random() * (N - i));

      // You have already created an array of length N.
      // Now you want to randomly select M values, and store those pointers
      // to print later

      // So first we'll print out the original value for perm[i]
      // this should increase by 1 each time until it reaches M
      System.out.println("perm[i] = " + perm[i]);

      // Now we will print out the random number generated above
      System.out.println("random = " + random);

      // Now we are going to use this random number as an accessor to access a
      // random value in the array...so instead of just getting the first M values
      // we are getting M random values

      System.out.println("perm[random] = " + perm[random]);

      // now we need to save this random value, so we store it in a new variable t
      int t = perm[random];
      System.out.println("t = " + t);
      perm[random] = perm[i];
      System.out.println("perm[random] = " + perm[random]);
      perm[i] = t;
      System.out.println("perm[i] = " + t);
    }

    // print Sample

    for (int k = 0; k < N; k++)
    {
      System.out.print(perm[k] + " ");
    }


    System.out.println();
  }
}
