public class Cards
{
  public static void main(String[] args)
  {
    String[] suit = {"Clubs", "Spades", "Hearts", "Diamonds"};
    String[] rank =
    {
      "2", "3", "4", "5", "6", "7", "8",
      "9", "10", "Jack", "Queen", "King", "Ace"
    };
    String[] deck = new String[suit.length * rank.length];
    for (int i = 0; i < suit.length; i++)
      for (int j = 0; j < rank.length; j++)
        deck[rank.length*i + j] = rank[j] + " of " + suit[i];
    for (int i = 0; i < deck.length; i++)
      System.out.println(deck[i]);
  }
}
