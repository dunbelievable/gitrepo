package com.mycode.myproject;

public class Window {
	
	Point topLeft = null;
	Point bottomRight = null;
	
	Window(){
		
		topLeft = new Point(0,0);
		bottomRight = new Point(0,0);
	}
	
	public Window(Point topLeft, Point bottomRight){
		
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
		
	}
	
	Window( int top, int left, int right , int bottom){
		
		this.topLeft = new Point(top,left);
		this.bottomRight = new Point(bottom,right);
		
	}
	
	
	public boolean isPointWithinWindow(Point p){
		
		return isPointWithinWindow(p.x, p.y);
		
	}
	
	
	public boolean isPointWithinWindow(int x, int y){
		
		if ( x > topLeft.x)
			return false;
		
		if ( x <= bottomRight.x)
			return false;
		
		if ( y > topLeft.y )
			return false;
		
		if ( y < bottomRight.y)
			return false;
		
		return true;
	}
	
}
