public class AverageStream
{
  public static void main(String[] args)
  {
    double sum = 0.0;
    int count = 0;

    while (!StdIn.isEmpty())
    {
      double value = StIn.readDouble();
      sum += value;
      count++;
    }
    double average = sum / count;
    StdOut.println("Average is " + average);
  }
}
