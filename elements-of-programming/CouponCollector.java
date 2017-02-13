public class CouponCollector
{
  public static void main(String[] args)
  {
    int N = Integer.parseInt(args[0]);

    boolean[] found = new boolean[N];

    int cardCount = 0;
    int valueCount = 0;

    while (valueCount < N)
    {
      int randomValue = (int) (Math.random() * N);
      cardCount++;

      if (!found[randomValue])
      {
        valueCount++;
        found[randomValue] = true;
      }
    }
    System.out.println(cardCount);
  }
}
