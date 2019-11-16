package week4Project;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class week4 {

	private static final int HashMap = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		
		StringBuilder idsBuilder = new StringBuilder();
			
			idsBuilder.append("-");
			String dash = idsBuilder.toString();
		
		StringBuilder namesBuilder = new StringBuilder();
		
			namesBuilder.append(" ");
			String space = namesBuilder.toString();
		
		List<String> employeeNames = new ArrayList<String>();
		
			employeeNames.add("John");
			employeeNames.add("Jacob");
			employeeNames.add("Sam");
			employeeNames.add("Beth");
			employeeNames.add("Jessica");
			employeeNames.add("Ronald");
			employeeNames.add("Remmy");
			
								
		Set<Integer> ids = new HashSet<Integer>();
				
			ids.add(11625);
			ids.add(32465);
			ids.add(98245);
			ids.add(254687);
			ids.add(56874);
			ids.add(85477);
			ids.add(976548);
			
		for (int id : ids) {	
		
				
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
			
			employeeMap.put(id, employeeNames.get(i++));
		

		
		Set<Integer> employeeID = employeeMap.keySet();
		
		for (Integer key : employeeID) {
			System.out.println(key + dash + space + employeeMap.get(key));
			
		}
		
		}
	}
}

