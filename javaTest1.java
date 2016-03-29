


public class javaTest1
{

	public static void main(String [] args) {
		
		int NUM_LEDS = 240;
		int[] specSegments = new int[7];

		int x = NUM_LEDS-((NUM_LEDS/7)*7);
		System.out.println(x);
		int xHalf = x/2;

		int ledTemp = xHalf;

		for (int i=0;i<7;i++) {
			specSegments[i] = temp;
			System.out.println(i + " " + temp);
			temp = temp + NUM_LEDS/7;
		}
		specSegments[0] = 0;
		System.out.println(NUM_LEDS-temp);
	}

}