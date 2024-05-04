package Week5_6;

public class MainSphere {
	
	
	public static void main(String[] args) {
		// Create a sphere with diameter 5 units
        Sphere sphere = new Sphere(5.0);

        // Print one-line description of the sphere
        System.out.println(sphere);

        // Print volume of the sphere
        System.out.println("Volume: " + sphere.calculateVolume());

        // Print surface area of the sphere
        System.out.println("Surface Area: " + sphere.calculateSurfaceArea());

	}

}