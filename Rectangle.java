public class Rectangle
{
  private int width;
  private int height;
  
  public Rectangle(int recWidth, int recHeight)
  {
    width = recWidth;
    height = recHeight;
  }
  
  public int getWidth()
  {
    return width;
  }
  
  public int getHeight()
  {
    return height;
  }
  
  public int getArea()
  {
    return width * height;
  }

public void run()
{
    Rectangle rectangle = new Rectangle(5, 6);
    System.out.println(rectangle.getHeight());
}
