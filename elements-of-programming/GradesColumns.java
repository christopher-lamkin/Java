public class GradesColumns
{
  public static void main(String[] args)
  {
    int[][] grades =
    {
      { 45, 67, 78, 46 },
      { 76, 92, 78, 87 },
      { 54, 67, 78, 89 },
      { 45, 67, 56, 87 }
    };

    for (int j = 0; j < grades[0].length; j++)
    {
      int columnSum = 0;
      for (int i = 0; i < grades.length; i++)
        columnSum += grades[i][j];
    int avg = columnSum / grades[j].length;
    System.out.println(avg);
    }
  }
}
