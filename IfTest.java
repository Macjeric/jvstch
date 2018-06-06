class IfTest{
	public static void main(String [] args){
		int i, n;
		float weight[] = {25.8F,50.7F,84.5F,66.5F,37.5F,50.4F,100.7F,25.5F};
		float height [] ={140.8F,170.9F,150.5F,200.8F,215.5F,250.8F,150.2F,44.8F};
	   int count = 0;
	    int count1 = 0;
	    int count2 = 0;
	   //




       for(i=0; i<=7; i++){
			if(weight[i]<50.0 && height[i]>170.0){
				count1 = count1 +1;
			}
			count = count+ 1;
		}
		count2 = count - count1;
				System.out.println("Number of Persons with....");
				System.out.println("Weight<50 and height>170 = "+count1);
				System.out.println("Others = "+count2);
		}
	}


