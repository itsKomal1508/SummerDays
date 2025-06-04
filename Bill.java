import java.util.*;
class Bill{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char foodType=sc.next().charAt(0);
		int quantity=sc.nextInt();
		int distance=sc.nextInt();
		float bill;
		//Validations
		if ((foodType != 'V' && foodType != 'N') || quantity < 1 || distance <= 0) {
            System.out.println("-1");
        }		
		int foodCostPerPlate=(foodType=='V')?12:15;
		int foodCost=foodCostPerPlate*quantity;
		
		//Calculate Delivery Charges
		int deliveryCharge=0;
		if (distance <= 3)
		deliveryCharge = 0;
		else if (distance <= 6)
		deliveryCharge = (distance - 3) * 1;
		else
		deliveryCharge = (3 * 1) + (distance - 6) * 2;

		System.out.println(foodCost+deliveryCharge);
	}
}