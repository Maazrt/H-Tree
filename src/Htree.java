import java.util.*;
public class Htree {
	public static void draw(int n,double size,double x,double y) {
		if(n==0) return ;
		double x0=x-size/2;
		double x1=x+size/2;
		double y0=y-size/2;
		double y1=y+size/2;
		StdDraw.line(x0,y,x1,y);
		StdDraw.line(x0,y0,x0,y1);
		StdDraw.line(x1,y0,x1,y1);
		
		draw(n-1,size/2,x0,y0);
		draw(n-1,size/2,x0,y1);
		draw(n-1,size/2,x1,y0);
		draw(n-1,size/2,x1,y1);		
	}

		public static void main(String[]args) {
			Scanner scan=new Scanner(System.in);
			System.out.print("enter n:");
			int n=scan.nextInt();
			draw(n,0.5,0.5,0.5);
		}
	}

