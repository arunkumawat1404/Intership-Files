class Average
{
	public void average(int... number)

	{
        int sum=0;
        int count=0;
        for(int num:number){
            sum += num;
            count++;
        }
        double averagesum = sum/count;
        System.out.println("Average " + averagesum);
		
	}
 
}
public class MethodOverloadingVargs {
    public static void main(String[] args) {
        Average a1 = new Average();
        a1.average(1, 2 ,3);
        a1.average(1 ,2 , 3 , 4 , 5);

    }
    
}
