package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
				
char[]chars = unfunkifiedText.toCharArray();

for(int i = 0; i<chars.length;i++) {
	if(i%2 != 0 && i!=0) {
	char temp = Character.toUpperCase(chars[i]);
	chars[i] = temp;
}
	else {
		char temp = Character.toLowerCase(chars[i]);
		chars[i] = temp;
	}
}

StringBuilder builder = new StringBuilder();
for(int i=0;i<chars.length;i++) {
	
	builder.append(chars[i]);
	
}

System.out.println(builder.toString());
		return builder.toString();
	}

    
    
}
