public class DataCounter
{
  public static void main(String[] args)
  {
    int count = 0;
    while (!StdIn.isEmpty()){
      double value = StdIn.readDouble();
      count++;
    }
    StdOut.println("The file has " + count + " random numbers");
  }
}
