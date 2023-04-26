package Test1;
import java.util.Scanner;
public class PizzaOrderingSystem2<Pizza> {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Pizza Ordering System!");
        System.out.println("Please choose your pizza type:");
        System.out.println("1. Veg pizza");
        System.out.println("2. Non-veg pizza");

        int pizzaTypeOption = input.nextInt();

        if(pizzaTypeOption == 1) {
            // Veg pizza options
            System.out.println("Please choose your veg pizza size:");
            System.out.println("1.Deluxe Veggie: (Regular: Rs. 150 Medium: Rs. 200 Large: Rs. 325)");
            System.out.println("2.Cheese and corn: (Regular: Rs. 175 Medium: Rs. 375 Large: Rs. 475)");
            System.out.println("3.Paneer Tikka: (Regular: Rs. 160 Medium: Rs. 290 Large: Rs. 340)");
     
        } else if(pizzaTypeOption == 2) {
            // Non-veg pizza options
        	System.out.println("Please choose your Nonveg pizza size:");
            System.out.println("1.Non-Veg Supreme:Regular: Rs 190 Medium: Rs 325 Large: Rs 425) ");
            System.out.println("2.Chicken Tikka: (Regular: Rs 210 Medium: Rs 370 Large: Rs 500) ");
            System.out.println ("3 Pepper Barbecue Chicken (Regular: Rs 220 Medium: Rs 380 Large: Rs 525");
        } else {
            System.out.println("Invalid option. Please try again.");
            return;
        }

        int vegNonvegsizeOption = input.nextInt();
        String size = "";

        switch(vegNonvegsizeOption) {
            case 1:
                size = "Regular";
                break;
            case 2:
                size = "Medium";
                break;
            case 3:
                size = "Large";
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                return;
        }
        int vegNonvegpizzaTypeOption = input.nextInt();

        String pizzaType = "";
        boolean isVeg = false;
        boolean isNonveg=false;
        int RegularPrice = 0;
        int MediumPrice=0;
        int LargePrice=0;
        
        switch(vegNonvegpizzaTypeOption) {
        case 1:
            pizzaType = "Deluxe Veggie";
            isVeg = true;
            RegularPrice = 150;
            MediumPrice=200;
            LargePrice=325;
            break;
        case 2:
            pizzaType = "Cheese and Corn";
            isVeg = true;
            RegularPrice = 175;
            MediumPrice=375;
            LargePrice=475;
            
            break;
        case 3:
            pizzaType = "Paneer Tikka";
            isVeg = true;
            RegularPrice = 160;
            MediumPrice=290;
            LargePrice=340;
            break;
        case 4:
            pizzaType = "Non-Veg Supreme";
            isNonveg = true;
            RegularPrice = 190;
            MediumPrice=325;
            LargePrice=425;
            break;
        case 5:
            pizzaType = "Chicken Tikka";
            isNonveg = true;
            RegularPrice = 210;
            MediumPrice=370;
            LargePrice=500;
            break;
        case 6:
            pizzaType = "Pepper Barbecue Chicken";
            isNonveg = true;
            RegularPrice = 220;
            MediumPrice=380;
            LargePrice=525;
            break;
        default:
            System.out.println("Invalid option. Please try again.");
            return;
        }
            
        System.out.println("You have selected a " + size + " pizzaType.");
	        
    
	if(pizzaTypeOption == 1) {
		System.out.println("Please choose your pizza Topping");
	}
	}
	
       String toppings1 = "vegtoppingoption";
		private int vegtoppingoption;
        int vegtoppingOption =1;
		private Scanner input;
		private int pizzaTypeOption;
		private String toppings;
		private String size;
		private Scanner scanner;
		private String price;{
		

        if(pizzaTypeOption == 1) {
            // Veg pizza toppings
            System.out.println("Please choose your veg pizza toppings (enter 0 when done):");

            while(vegtoppingOption != 0) {
                System.out.println("1. Black olive (Rs 20)");
                System.out.println("2. Capsicum (Rs 25)");
                System.out.println("3. Paneer (Rs 35)");
                System.out.println("4. Mushroom (Rs 30)");
                System.out.println("5. Fresh tomato (Rs 10)");
               
                System.out.println("0. Done");

                vegtoppingOption = input.nextInt();

                switch(vegtoppingOption) {
                    case 1:
                        toppings1 += "Black olive, ";
                        break;
                    case 2:
                        toppings1 += "Capsicum, ";
                        break;
                    case 3:
                        toppings1 += "Paneer , ";
                        break;
                    case 4:
                        toppings1 += "Mushroom, ";
                        break;
                    case 5:
                        toppings1 += "Fresh tomato, ";
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
            
        }else if(pizzaTypeOption == 2){
            // Non-veg pizza toppings
            System.out.println("Please choose your non-veg pizza toppings (enter 0 when done):");
        }

            String toppings = "Nonvegtoppingoption";
    		int Nonvegtoppingoption = 0;
            int NonvegvegtoppingOption =1;
    		Scanner input1;{
    		
			while(Nonvegtoppingoption != 0) {
                System.out.println("1.Chicken tikka (Rs 35)");
                System.out.println("2. Barbeque chicken (Rs 45)");
                System.out.println("3. Grilled chicken (Rs 40)");
                System.out.println("4.Extra cheese: (Rs 35)");
                if(pizzaTypeOption == 2) {
	                
	            System.out.println("0. Done");

	            Nonvegtoppingoption = input.nextInt();

	            switch(Nonvegtoppingoption) {
	                case 1:
	                    toppings += "Chicken tikka, ";
	                    break;
	                case 2:
	                    toppings += "Barbeque chicken, ";
	                    break;
	                case 3:
	                    toppings += "Grilled chicken, ";
	                    break;
	                case 4:
	                    toppings += "Extra cheese, ";
	                    break;
	                  
	                    case 0:
		                    break;
	                    }
	            System.out.println("You have selected a " + size + " pizza with the following toppings:");
		        System.out.println(toppings);

		        
                if (pizzaTypeOption == 1) {
                    System.out.println("Select crust type:");
                    System.out.println("1. Thin crust");
                    System.out.println("2. Thick crust");
                    int crustTypeOption = scanner.nextInt();

                    String crustType;
                    if (crustTypeOption == 1) {
                        crustType = "Thin crust";
                    } else if (crustTypeOption == 2) {
                        crustType = "Thick crust";
                    } else {
                        System.out.println("Invalid option.");
                        
                    }

                   

                    
                    System.out.println("Order summary:");
                    
                }



		        if(toppings.contains("Extra cheese")) {
		            price += 2.0;
		        }

		        System.out.println("Your total cost is Rs" + price);
		        System.out.println("Thank you for using the Pizza Ordering System!");
		    }

	}



        
	
    		}
		}
}



