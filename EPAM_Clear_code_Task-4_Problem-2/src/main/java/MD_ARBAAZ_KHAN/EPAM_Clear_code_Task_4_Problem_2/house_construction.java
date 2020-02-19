package MD_ARBAAZ_KHAN.EPAM_Clear_code_Task_4_Problem_2;



public class house_construction {

	
	
	public int cost;

	int House_construction_cost(int x,int house_area)
	{
		
		if(x==1)
		{
			int cost = 1200 * house_area;
			return cost;
		}
		if(x==2)
		{
			int cost = 1500 * house_area;
			return cost;
		}
		if(x==3)
		{
			int cost = 1800 * house_area;
			return cost;
		}
		if(x==4)
		{
			int cost = 2500 * house_area;
			return cost;
		}
		else
		return 0;
	 
		
		
	}
}
