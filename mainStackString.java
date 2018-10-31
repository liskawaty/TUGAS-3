
public class mainStackString {
	public static void main(String[]args) {
		stackString ss = new stackString();
		ss.cetak();
		
		ss.push("LISKAWATI");
		ss.cetak();
		
		ss.push("SANTI");
		ss.cetak();
		
		ss.push("SUCI");
		ss.cetak();
		
		String out1 = ss.pop();
		System.out.println(out1);
		ss.cetak();
		
		String out2 = ss.pop();
		System.out.println(out2);
		ss.cetak();
		
		String out3 = ss.pop();
		System.out.println(out3);
		ss.cetak();

		String out6 = ss.pop();
		System.out.println(out6);
		ss.cetak();
		
	}

}
