
public class Knapsack {

	public static void main(String[] args) {
		int [] Item= {1,2,3,4,5,6};
		int [] Weight= {20,10,9,4,2,1};
		int [] Values= {4000,3500,1800,400,1000,200};
		int MaxWeightAllowed=20;
		int sum=0;
		int flag=0;
		for(int i=0;i<Weight.length;i++)
		{
			if(Weight[i]==MaxWeightAllowed)
			{
				sum=sum+Weight[i];
			}
			else if(Weight[i]<MaxWeightAllowed)
			{
				sum=sum+Weight[i+1];
				 if(sum<MaxWeightAllowed)
				{
					flag=MaxWeightAllowed-sum;
				}
				 else if(flag!=Weight[i+1])
				 {
					 continue;
				 }
				 else
				 {
					 sum=sum+Weight[i+1];
				 }
			}
		}
	}

}
