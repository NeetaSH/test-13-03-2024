import java.util.Arrays;
class Cafe{
     static String name = "Naveen";
static String foodItems[] = {null , null, null , null , null};
	 static String ownerName = "Naveen";
	 static String location = "Mudhol";
	 static int index ;
	 
	 
	 //method
	 public static boolean addFoodItems(String foodItem){
	 System.out.println("inside addFoodItems():");
	 boolean isAdded = false ;
	 if(foodItem != null){
	   foodItems[index] = foodItem;
	   index++;
	   
	   isAdded = true;
	 System.out.println("Food item added successfully");
	 
	 
	 }
	 else{
	 System.out.println("Food item can't be null");
	 }
	 System.out.println("end of addFoodItems():");
	 return isAdded;
	 
	 }
      public static void  getFoodItems(){
	  for(int index=0 ; index < foodItems.length; index++){
	  System.out.println(foodItems[index]);
	  }
	  }
   //update
     public static boolean updateFoodItem(String newFooditem , String oldFoodItem){
		 System.out.println("updateFoodItem");
		 boolean isUpdated = false ;
		 for(int index=0 ; index< foodItems.length ; index++){
			 if(foodItems[index] == oldFoodItem){
				 foodItems[index] = newFooditem;
				 isUpdated = true;
				 System.out.println("food item updated successfully");
			 }
		 }
		 
		 System.out.println("end of update Food Item");
		 return isUpdated;
		 
	 }
	 
	 public static void deleteFoodItems(String foodItem ){
		 int newIndex , oldIndex ;
		 for(newIndex=0 , oldIndex=0 ; oldIndex < foodItems.length ; oldIndex++){
			 if(foodItems[oldIndex] != foodItem){
				 foodItems[newIndex++] = foodItems[oldIndex];			 
				 }
		 }
		 
		 foodItems = Arrays.copyOf(foodItems , newIndex);
		 return ;
	 }

} 