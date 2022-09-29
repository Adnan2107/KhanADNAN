

public interface  Shape {

		abstract void RectangleArea(int length,int width); 
		abstract void SquareArea(int area);
		abstract void CircleArea(int radius);
	}

	class Area implements Shape
	{
		public void RectangleArea(int length,int width) 
		{
			int area=length*width;
			System.out.println("Area of Rectangle are : "+area);
		} 
		public void SquareArea(int side) 
		{
			int area=side*side;
			System.out.println("Area of Square are : "+area);
		}
		public void CircleArea(int radius) 
		{
			float area=3.142f*(radius*radius);
			System.out.println("Area of Circle are: "+area);
		}
	}

	class AreaMain
	{
		public static void main(String []args) 
		{
			Area a = new Area();
			a.RectangleArea(2, 3);
			a.SquareArea(8);
			a.CircleArea(6);
		}
	}
	


