import java.util.ArrayList;


public class arrayListString {

	public static void main(String[] args) {
		ArrayList<String> arls= new ArrayList<String>();
		// menambahkan
		arls.add("LISKAWATI");
		arls.add("SANTI");
		arls.add("SUCI");
		System.out.println(arls);
		//menghapus
		arls.remove("LISKAWATI");
		System.out.println(arls);
		
		ArrayList<String> arlS= (ArrayList<String>)arls.clone();
		arlS.add("INA");
		System.out.println("arls" +arls);
		System.out.println("arlS" +arlS);
		
		System.out.println("kosongkah:" + arls.isEmpty());
		if (arls.contains("LISKAWATI"))
			System.out.println(" ada LISKAWATI");
		else{
			System.out.println("tak ada NURDINA");
		}
		System.out.println("arl1" +arls);
		System.out.println("arl2" +arlS);
			
	}

}
