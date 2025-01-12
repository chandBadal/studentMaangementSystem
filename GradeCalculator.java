package Workshop8;
import java.util.List;

public class GradeCalculator {
	public static double calculateAverage(List <Integer> grades) {
		if(grades == null || grades.isEmpty()) {
			System.out.println("No grades provided!");
			return 0;
		}
		
		int total = 0;
		for(int grade : grades) {
			total += grade;
		}
		return (double) total / grades.size();
	}
	
}
