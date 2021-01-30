package hashMapping;

public class InnerClassExample {
	
	private String myMember1;

	public InnerClassExample(String member1) {
		myMember1 = member1;
	}
	
	public String getMyMember1() {
		return myMember1;
	}
	
	
	
	
public class StringExample {	
	private String myName ="Dorian";
	
	public void testStrings() {
	
		StringBuffer buffer= new StringBuffer(myName);
		StringBuilder builder= new StringBuilder(myName);
	
		buffer.append("montes");
		builder.append("montes");
	
		System.out.println(buffer.toString());
	
		for(int i=0; i<10; i++) {
			builder.append(String.valueOf(i));
		}
		System.out.println(builder.toString());
	}
}
}
