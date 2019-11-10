package dbconnection;
import phone.Phone;
import phonerepository.Phonerepository;

public class Dbconnection {

	public static void main(String[] args) {
		
	
	Phone phone = Phonerepository.getPhoneById(3);
		
		System.out.print(phone.getId() +"  ");
		System.out.print(phone.getOwner()+"  ");
		System.out.print(phone.getModel()+"  ");
		System.out.print(phone.getColor()+"  ");
	
	}
}
