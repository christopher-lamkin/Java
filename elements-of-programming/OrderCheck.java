public class OrderCheck
{
  public static void main(String[] args)
  {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    double z = Double.parseDouble(args[2]);

    boolean ascend = (x < y && y < z);
    Boolean descend = (x > y && y > z);

    boolean inOrder = ascend || descend;

    System.out.println(inOrder);
  }
}
