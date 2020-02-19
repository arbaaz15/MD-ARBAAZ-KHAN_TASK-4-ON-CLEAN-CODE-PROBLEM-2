package MD_ARBAAZ_KHAN.EPAM_Clear_code_Task_4_Problem_2;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the area of the House");
	    int area = sc.nextInt();
	    
	    System.out.println("Choose the type of Materials used in the house:  ");
	    System.out.print("1. using standard materials\n2. using above standard materials\n3. using high standard material\n4. using high standard material and fully \r\n" + 
	    		"automated home\n");
	    System.out.println("Enter your choice : ");
	    int x = sc.nextInt();
	    
        
        house_construction ob = new house_construction();

		int result = ob.House_construction_cost(x,area);
		
	
		System.out.println("The estimated area of the house :  $" + result);
	
	
    }


}
