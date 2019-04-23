package Server;

public class CalLogic {
	
	
	
	
	public  static String run(String command) {
		String calResult = "";

			String content = command;
			if (content.contains("+")) {
				String[] string = content.split("\\+");
				String frist = string[0];
				String next = string[1];
				double result = Double.valueOf(frist)+Double.valueOf(next);
				calResult =  String.valueOf(result);
			} else if (content.contains("-")) {
				String[] string = content.split("-");
				String frist = string[0];
				String next = string[1];
				double result = Double.valueOf(frist)-Double.valueOf(next);
				calResult =  String.valueOf(result);
			} else if (content.contains("*")) {
				String[] string = content.split("\\*");
				String frist = string[0];
				String next = string[1];
				double result = Double.valueOf(frist)*Double.valueOf(next);
				calResult =  String.valueOf(result);
			} else if (content.contains("/")) {
				String[] string = content.split("\\/");
				String frist = string[0];
				String next = string[1];
				double result = Double.valueOf(frist)/Double.valueOf(next);
				calResult =  String.valueOf(result);
			} else if (content.contains("%")) {
				String[] string = content.split("\\%");
				String frist = string[0];
				String next = string[1];
				double result = Double.valueOf(frist)%Double.valueOf(next);
				calResult =  String.valueOf(result);
			}
		return calResult;
		
	}

}
