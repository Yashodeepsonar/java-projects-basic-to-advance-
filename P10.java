import java.util.Scanner;
class Calculator{
	
		int r;
		final float PI=3.14f;
		Scanner sc=new Scanner(System.in);
	public void areaOfcircle(){
        System.out.println("Enter value of :");
        r=sc.nextInt();
	    float area=PI*r*r;
	    System.out.println("area of circle is:"+area);
   
	}
	public void circumferenceOfCircle(){
        System.out.println("Enter value of :");
        r=sc.nextInt();
	    float circumferenceOfCircle=2*PI*r;
	    System.out.println("cir of circle"+circumferenceOfCircle);
}
    public void areaOfRectangle(){
        System.out.println("Enter value of :");
        l=sc.nextInt();
        System.out.println("Enter value of :");
        w=sc.nextInt();
	    float areaOfRectangle=l*w;
	    System.out.println("cir of circle"+areaOfRectangle);
	}
	public void volumeOfSphere(){
        System.out.println("Enter value of :");
        r=sc.nextInt();
	    float volumeOfSphere=(4/3)*PI*r*r*r;
	    System.out.println("cir of circle"+volumeOfSphere);
    }
    public void surfaceAreaOfSphere(){
        System.out.println("Enter value of :");
        r=sc.nextInt();
	    float surfaceAreaOfSphere=4*PI*r*r;
	    System.out.println("cir of circle"+surfaceAreaOfSphere);
	}
	public void areaOfSquare(){
        System.out.println("Enter value of :");
        r=sc.nextInt();
	    float areaOfSquare=r*r;
	    System.out.println("cir of circle"+areaOfSquare);

	}
	public void areaOfRightAngleTriangle(){
        System.out.println("Enter value of :");
        a=sc.nextInt();
        System.out.println("Enter value of :");
        b=sc.nextInt();

	    float areaOfRightAngleTriangle=(a*b)/2;
	    System.out.println("cir of circle"+areaOfRightAngleTriangle);
	}



public static void main(String[] args) {
	Calculator c=new Calculator();
	c.areaOfcircle();
	c.circumferenceOfCircle();
}
}