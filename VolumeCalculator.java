import java.util.Scanner;

public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate volume:");
        System.out.println("1. Cube\n2. Sphere\n3. Cylinder\n4. Cone\n5. Cuboid");
        System.out.print("Enter the number corresponding to your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the cube: ");
                double cubeSide = scanner.nextDouble();
                double cubeVolume = Math.pow(cubeSide, 3);
                System.out.println("The volume of the cube is: " + cubeVolume);
                break;

            case 2:
                System.out.print("Enter the radius of the sphere: ");
                double sphereRadius = scanner.nextDouble();
                double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3);
                System.out.println("The volume of the sphere is: " + sphereVolume);
                break;

            case 3:
                System.out.print("Enter the radius of the cylinder: ");
                double cylinderRadius = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double cylinderHeight = scanner.nextDouble();
                double cylinderVolume = Math.PI * Math.pow(cylinderRadius, 2) * cylinderHeight;
                System.out.println("The volume of the cylinder is: " + cylinderVolume);
                break;

            case 4:
                System.out.print("Enter the radius of the cone: ");
                double coneRadius = scanner.nextDouble();
                System.out.print("Enter the height of the cone: ");
                double coneHeight = scanner.nextDouble();
                double coneVolume = (1.0 / 3.0) * Math.PI * Math.pow(coneRadius, 2) * coneHeight;
                System.out.println("The volume of the cone is: " + coneVolume);
                break;

            case 5:
                System.out.print("Enter the length of the cuboid: ");
                double cuboidLength = scanner.nextDouble();
                System.out.print("Enter the width of the cuboid: ");
                double cuboidWidth = scanner.nextDouble();
                System.out.print("Enter the height of the cuboid: ");
                double cuboidHeight = scanner.nextDouble();
                double cuboidVolume = cuboidLength * cuboidWidth * cuboidHeight;
                System.out.println("The volume of the cuboid is: " + cuboidVolume);
                break;

            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 5.");
        }
    }
}