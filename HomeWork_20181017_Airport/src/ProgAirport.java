
public class ProgAirport {

	public static void main(String[] args) {
		Person person [] = new Person [4];
		
		person [0] = new Pilot("Piloto", "Sobre Nome", 10.5f, "AE123456");
		person [1] = new FloorAttendant("Floor", "Attendant", 20.3f, "Brasil", "Security");
		person [2] = new FlightAttendant("Flight", "Attendent", 7.1f, "Israel", "ачереой");
		person [3] = new Passenger("Jaime", "Ajz", "BR123456");
		
		for (Person vector:person){
				vector.print();
		}
		
	}

}
