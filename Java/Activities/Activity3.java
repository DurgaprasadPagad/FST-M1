
public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double seconds= 1000000000;
		
		double earthSeconds = 31557600;
		double mercurySeconds = 0.2408467;
		double venusSeconds = 0.61519726;
		double marsSeconds = 1.8808158;
		double jupiterSeconds = 11.862615;
		double saturnSeconds = 29.447498;
		double uranusSeconds = 84.016846;
		double neptuneSeconds = 164.79132;
		
		System.out.println("Age on Mercury: "+seconds/earthSeconds/mercurySeconds);
		System.out.println("Age on Venus: "+seconds/earthSeconds/venusSeconds);
		System.out.println("Age on Mars: "+seconds/earthSeconds/marsSeconds);
		System.out.println("Age on Jupiter: "+seconds/earthSeconds/jupiterSeconds);
		System.out.println("Age on saturn: "+seconds/earthSeconds/saturnSeconds);
		System.out.println("Age on Uranus: "+seconds/earthSeconds/uranusSeconds);
		System.out.println("Age on Neptune: "+seconds/earthSeconds/neptuneSeconds);
		

	}

}
