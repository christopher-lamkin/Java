public class MultiplyMatrices
{
  public static void main(String[] args)
  {
    double[][] a = {
      { 0.70, 0.20, 0.10 },
      { 0.30, 0.60, 0.10 },
      { 0.50, 0.10, 0.40 }
    };

    double[][] b = {
      { 0.80, 0.30, 0.50 },
      { 0.10, 0.40, 0.10 },
      { 0.10, 0.30, 0.40 }
    };

    double[][] c = new double[a.length][a[0].length];
    for (int i = 0; i < a.length; i++)
    {
      for (int j = 0; j < a[0].length; j++)
      {
        for (int k = 0; k < a.length; k++)
        c[i][j] += a[i][k] * b[k][j];
      }
    }
    for (int i = 0; i < c.length; i++)
      for (int j = 0; j < c[i].length; j++)
        System.out.println(c[i][j]);
  }
}
