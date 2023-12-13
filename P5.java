class P4
{
	public static void main(String[] args) {
		int no=1234;
		int n1=no%10;
		int no1=no/10;
		int n2=no1%10;
		int no2=no1/10;
		int n3=no2%10;
		int n4=no2/10;
		int res=n1*1000+n2*100+n3*10+n4;
		System.out.print("sum of 4 digit is = "+res);
	}
}