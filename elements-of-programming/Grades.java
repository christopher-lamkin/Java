public class Grades
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

      for (int i = 0; i < grades.length; i++)
      {
        int sum = 0;
        for (int j = 0; j < grades[i].length; j++)
          sum += grades[i][j];
        int average = sum / grades[i].length;
        System.out.println(average);
      }
  }
}
