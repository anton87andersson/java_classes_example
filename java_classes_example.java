abstract class Shape{
	abstract public double perimeter();
	abstract public double area();
}

class Rectangle extends Shape{
	
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double perimeter(){
		return (length * 2) + (breadth * 2);
	}
	
	@Override
	public double area(){
		return  length * breadth;
	}
}

class Circle extends Shape{
	
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double perimeter(){
		return  2 * Math.PI * radius;
	}
	
	@Override
	public double area(){
		return Math.PI * radius * radius;
	}
}


class java_classes_example{
	
	public static void main(String[] args) {
		Circle c = new Circle(9);
        System.out.println("Circle area: " + c.area());
        System.out.println("Circle perimeter: " + c.perimeter());
        
        System.out.println("");
        
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Rectangle area: " + r.area());
        System.out.println("Rectangle perimeter " + r.perimeter());
	}

}
