
public class MyOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a = 10;
		Integer b = 0b11111111111111111111111111111111;
		int bb = 0xffffffff;
		String c;
				
//		System.out.println( Integer.toString(a) + Integer.toString(b) );
//		System.out.println( a + "" + b );
//		System.out.print( a + "\n" );
//		System.out.println( b );		

//		c = Integer.toHexString(b);
//		
//		System.out.println( Integer.toBinaryString( a ) );
//		System.out.println( c.toUpperCase() );
		
		System.out.println( Integer.toBinaryString( b >> 1 ) );
		System.out.println( Integer.toHexString( b >> 1 ) );
		
		
		
				
	}

}
