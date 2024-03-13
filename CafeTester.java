class CafeTester{
  public static void main(String foodItems1[]){
  
  Hotel.addFoodItems("French Fries");
  Hotel.addFoodItems("Cheese balls");
  Hotel.addFoodItems("Sandwitch");
  Hotel.addFoodItems("MilkShake");
  Hotel.addFoodItems("Pizza");
  
 Hotel.getFoodItems();
 boolean isFoodItemAdded = Hotel.updateFoodItem("Pizza" , "burger");

   Hotel.getFoodItems();
   
   Hotel.deleteFoodItems("Sandwitch");
   
   Hotel.getFoodItems();

  }




}