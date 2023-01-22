class CheckGreatest{
    void greatest( int a, int b) {
        if (a > b){
            System.out.println( a + " is Greatest");
        } else {
            System.out.println( b + " is Greatest");
        }
    }
    void greatest(int a, int b, int c) {
        if (a > b) {
			if( a > c ) {
				System.out.println( a + " is Greatest");
			} else {
				System.out.println( c + " is Greatest");
			}
		} else {
			if( b > c) {
				System.out.println( b + " is Greatest");
			} else {
				System.out.print( c + "is Greatest");
			}
		}
    }
}
class GreatestNumber {
    public static void main(String[] args) {
        CheckGreatest c = new CheckGreatest();
        c.greatest(10, 20);
        c.greatest(12, 23, 6);
    }
}