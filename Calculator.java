class Calculator{
    
	
	public static void main(String cal[]){
	
     int result = add(34,67);
	System.out.println(result);
	
	int total = add(12,23,31);
	System.out.println(total);
	
	}





    public static int add(int num1 ,int num2){
	int result =  num1 + num2 ;
	return result;
	}
	
	public static int add(int num1 , int num2,int num3){
	int result = num1 + num2 + num3 ;
	return result;
	}


}