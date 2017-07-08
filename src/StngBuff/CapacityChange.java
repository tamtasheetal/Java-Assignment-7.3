package StngBuff;
//This java file is inside package named StngBuff inside src folder.

public class CapacityChange    
{
	public static void main(String[] args)    
//main function declaration. 
	{
      //This will show the capacity is changing in StringBuffer.
		StringBuffer sampleBuffer = new StringBuffer("");    
      //Here this will Create an empty StringBuffer.
		System.out.println("Empty StringBuffer :-");    
		System.out.println("Length -> "+sampleBuffer.length());    
		System.out.println("Capacity -> "+sampleBuffer.capacity());    
		sampleBuffer.append("This is the append file and :-");
		System.out.println("After appending the word \"This is the append file and\" :");
		System.out.println("Length -> "+sampleBuffer.length());    
		System.out.println("Capacity -> "+sampleBuffer.capacity());
		sampleBuffer.append("");
		System.out.println("After appending the word \"this file\" :");
		System.out.println("Length  -> "+sampleBuffer.length());    
		System.out.println("Capacity -> "+sampleBuffer.capacity());    
		
		System.out.println("\n");   
		
          //This will show the capacity is changing in StringBuilder
				StringBuilder sampleBuilder = new StringBuilder("");    
          //Here this will Create an empty StringBuilder.
				System.out.println("Empty StringBuilder : ");   
				System.out.println("Length -> "+sampleBuilder.length());    
				System.out.println("Capacity -> "+sampleBuilder.capacity());    
				sampleBuilder.append("This is the append file and :-");
				System.out.println("After appending the word \"This is the append file and\" :");
				System.out.println("Length -> "+sampleBuilder.length());    
				System.out.println("Capacity -> "+sampleBuilder.capacity());   
				sampleBuilder.append("");
				System.out.println("After appending the word \"this file\" :");
				System.out.println("Length -> "+sampleBuilder.length());    
				System.out.println("Capacity -> "+sampleBuilder.capacity());    
				
				
	}    

}   