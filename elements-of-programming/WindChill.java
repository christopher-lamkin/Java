public class WindChill
{
  public static void main(String[] args)
  {
    double temp = Double.parseDouble(args[0]);
    double velocity = Double.parseDouble(args[1]);
    if ( Math.abs(temp) < 50 && 3 < velocity && velocity < 120)
    {
    double vSquare = Math.pow(velocity, 0.16);
    double chill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * vSquare;
    System.out.println(chill);
    }
    else System.out.println("Temperature or velocity does not fall within parameters!");
  }
}
