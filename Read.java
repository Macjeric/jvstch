import java.io.DataInputStream
class Read{
	public static void main(String [] args){
		DataInputStream in = new DataInputStream(System.in);
		int intNumber = 0;
		float floatNumber = 0.0F;
		try{
			System.out.println("Enter an Integer:");
			intNumber = Integer.parseInt(in.readline());
			System.out.println("Enter an Float Number:");
			floatNumber = Float.valueOf(in.readline()) .floatValue();}
		catch(Exception e){}
		System.out.println("intNumber =" + intNumber);

