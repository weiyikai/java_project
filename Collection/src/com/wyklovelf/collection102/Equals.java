package com.wyklovelf.collection102;

/**
 * @author wyk
 *
 */
public class Equals {
	public static void main(String[] args) {
		Equals e1 = new Equals();
		
		Equals e2 = new Equals();
		
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));//e1调用Object中的equals方法
		/*
		 * public boolean equals(Object obj){
		 * 			return (this == obj);
		 * }
		 */
		
		String s1 =  new String();
		
		String s2 = new String();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		Equals e3 = e2;
		System.out.println(e3.equals(e2));
		
		
		char []c11 = {'1','2','3'};
		
		char []c22 = {'1','2','3'};
		
		String1 s11 = new String1(c11);
		
		String1 s22 = new String1(c22);
		
		System.out.println(s11.equals(s22));
		
		
		char []c111 = {'1','1','1'};
		
		char []c222 = {'1','1','1'};
		
		String2 s111 = new String2(c111);
		
		String2 s222 = new String2(c222);
		
		System.out.println(s111.equals(s222));
	}

}

class String1{
	char[] value;
	
	//String1中重写的eauqls方法
	public boolean equals1(Object anObject) {
		if(this == anObject) {
			return true;
		}
		if(anObject instanceof String1) {
			String1 anotherObject = (String1)anObject;
			
			int n = value.length;
			
			if(n == anotherObject.value.length) {
				
				char v1[] = value;
				
				char v2[] = anotherObject.value;
				
				for (int i = 0; i < n; i++) {
					if(v1[i] != v2[i]) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}

	public String1(char[] value) {
		super();
		this.value = value;
	}
}


class String2{
	char value[];
	
	public boolean equals(Object anObject) {
		if(this == anObject) {
			return true;
		}
		
		if(anObject instanceof String2) {
			String2 anotherObject = (String2)anObject;
			
			int n = value.length;
			
			char v1[] = value;
			
			char v2[] = anotherObject.value;
			
			for (int i = 0; i < n; i++) {
				if(v1[i] != v2[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public String2(char[] value) {
		super();
		this.value = value;
	}
	
	
}
