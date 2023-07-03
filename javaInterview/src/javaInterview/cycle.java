package javaInterview;

public class cycle {
    public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		sb.append(" world");
		
		StringBuilder sBuilder=new StringBuilder("hello");
		sBuilder.append("world");
		String bag="hello";
		bag+="hello";
		
		System.out.println(bag);
		System.out.println(sBuilder);
		System.out.println(sb);
	}
}
