public class StandardDev
{
  public static void main(String[] args)
  {
    int N = Integer.parseInt(args[0]);
    int count = 0;
    double[] values = new double[N];
    double sum = 0;
    double squareSum = 0;

    while (count < N)
    {
      double value = StdIn.readDouble();
      values[count] = value;
      sum += values[count];
      count++;
    }

    double mean = sum / count;

    for (int i = 0; i < values.length; i++)
    {
      values[i] = (values[i] - mean) * (values[i] - mean);
      squareSum += values[i];
    }

    double standardDev = Math.sqrt(squareSum) / (N - 1);
    StdOut.println("Mean: " + mean);
    StdOut.println("Standard Deviation: " + standardDev);

  }
}
