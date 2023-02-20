package Prototype;

public class MainEntry {

	public static void main(String[] args) {
		Point pt1 = new Point();
		pt1.setX(0).setY(0);
		System.out.println(pt1.draw());

		
		Point pt2 = new Point();
		pt1.setX(100).setY(0);
		System.out.println(pt1.draw());

		Line line1 = new Line();
		line1.setStartPoint(pt1).setEmdPoint(pt2);
		System.out.println(line1.draw());
		
		Line lineCopy = (Line)line1.copy();
		
		Point pt3 = new Point();
		pt3.setX(100).setY(100);
		
		Point pt4 = new Point();
		pt4.setX(0).setY(100);
				
		Line line2 = new Line();
		line2.setStartPoint(pt2).setEmdPoint(pt3);
		
		Line line3 = new Line();
		line3.setStartPoint(pt3).setEmdPoint(pt4);
		
		Line line4 = new Line();
		line4.setStartPoint(pt4).setEmdPoint(pt1);
		
		Group rect = new Group("RECT");
		rect.addShape(line1).addShape(line2).addShape(line3).addShape(line4);
		System.out.println(rect.draw());
	
		Group cloneRect = (Group)rect.copy();
		cloneRect.moveOffset(100, 100);
	
		System.out.println(cloneRect.draw());
		System.out.println(rect.draw());
		
	}

}
