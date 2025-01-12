package Workshop8;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to the student Management System!");
		
		Student student = new Student("Badal", 20);
		student.displayInfo();
		
		
		List <Integer> grades = List.of(87, 90, 55, 76, 88);
		double average = GradeCalculator.calculateAverage(grades);
		System.out.println("Average Grade: " + average);
	}

}
