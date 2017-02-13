public class DrawHand
{
  public static void main(String[] args)
  {
    String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades" };
    String[] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    String[] deck = new String[suit.length * rank.length];

// Instantiate Deck of Cards

    for (int j = 0; j < suit.length; j++)
      for (int k = 0; k < rank.length; k++)
        deck[rank.length * j + k] = rank[k] + " of " + suit[j];

    // for (int l = 0; l < deck.length; l++)
    //   System.out.println(deck[l] + " ");

// Shuffle Deck

  // int N = deck.length;
  //
  // for (int m = 0; m < N; m++)
  // {
  //   int r = m + (int) (Math.random() * (N - m));
  //   String t = deck[m];
  //   deck[m] = deck[r];
  //   deck[r] = t;
  // }
  //
  // for (int i = 0; i < N; i++)
  //   System.out.println(deck[i]);

  // Deal a hand
    int N = deck.length;

    for (int i = 0; i < N; i++)
    {
      int r = i + (int) (Math.random() * (N - i));

      String t = deck[r];
      deck[r] = deck[i];
      deck[i] = t;
    }

    for (int j = 0; j < 5; j++)
      System.out.print(deck[j] + ", ");
  }


}
