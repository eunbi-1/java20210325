package p99.codingbat;

public class Warmup {
	public String backAround(String str) {
		  String res = "";
		  int len = str.length();
		  String last = str.substring(len-1, len);
		  
		  res = last + str + last;
		  
		  return res;
		}
}
