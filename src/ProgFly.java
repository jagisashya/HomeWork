
public class ProgFly {

	public static IFly createIfly () {
		switch ((int)(Math.random()*3)) {
		case 0:
			return new bird(true, 10, "Sabia", 10, "colorido");
		case 1:
			return new Airplane(true, 500, "Nome do Piloto", "Aerolineas", "America do Sul");
		case 2:
			return new Afifon(false, 4, "Tricolor", 51.47);

		default:
			System.out.println("erro random " );;
		}
		return null;
	}
	public static void main(String[] args) {

		IFly [] iflyvector = new IFly [10];
		Fly fly; 
		
		for (int i = 0; i< iflyvector.length;i++) {
			iflyvector[i] = createIfly();
		}
		
		for (int i = 0; i< iflyvector.length;i++) {
			System.out.println("-------------------------------------------------");
			
			fly = (Fly)(iflyvector[i]);
			
			System.out.println(i + " , " + iflyvector[i].land() + " , " + fly.getVelocity());
			iflyvector[i].fly(fly.getVelocity());
		}
		
		
		
		
	}

}
