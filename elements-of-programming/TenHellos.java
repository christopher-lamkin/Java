// public class TenHellos
// {
//   public static void main(String[] args)
//   {
//     int i = 1;
//     while (i < 33)
//     {
//       String digits = Integer.toString(i);
//       int lastDigit = Character.getNumericValue(digits.charAt(digits.length() - 1));
//       if (lastDigit == 1)
//       {
//         System.out.println(i + "st hello!");
//         i = i + 1;
//       }
//       else if (lastDigit == 2)
//       {
//         System.out.println(i + "nd hello!");
//         i = i + 1;
//       }
//       else if (lastDigit == 3)
//       {
//         System.out.println(i + "rd hello!");
//         i = i + 1;
//       }
//       else
//       {
//         System.out.println(i + "th hello!");
//         i = i + 1;
//       }
//     }
//   }
// }

public class TenHellos
{
  public static void main(String[] args)
  {
    int N = Integer.parseInt(args[0]);
    int K = Integer.parseInt(args[1]);
    for ( int i = N; i <= K; i = i + 1)
      {
      String digits = Integer.toString(i);
      int lastDigit = Character.getNumericValue(digits.charAt(digits.length() - 1));

      if (lastDigit == 1)
      {
        System.out.println(i + "st hello!");
      }
      else if (lastDigit == 2)
      {
        System.out.println(i + "nd hello!");
      }
      else if (lastDigit == 3)
      {
        System.out.println(i + "rd hello!");
      }
      else System.out.println(i + "th hellO!");
    }
  }
}
