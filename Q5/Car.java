package Q5;

public class Car {
   private String carModel;
   private int carPlate;
   private Category category;
   public Car(String carModel, int carPlate, Category category) {
       this.carModel = carModel;
       this.carPlate = carPlate;
       this.category = category;
   }
   public int getCarPlate(){
       return carPlate;
   }
   public void displayCarDetails(){
       System.out.println("Model: " + this.carModel);
       System.out.println("Plate: " + this.carPlate);
       System.out.println("Category: " + this.category.getCategoryName());
   }
   public String getCarModel() {
       return carModel;
   }
}
