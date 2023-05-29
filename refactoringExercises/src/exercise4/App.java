package exercise4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;


public class App {

    // Manipulando atributos, de forma pública, que deveriam ser privados, como "Cursos"
    // Não deveria expor estes atributos
    // Deveria ter feito de maneira interna

    // Caso: In appropriate intimacy
    // Acoplamento

	public static void main(String[] args) {
		// Client code
		Person kent = new Person();
		Set s = new HashSet();
		s.add(new Course("MC426", false));
		s.add(new Course("MC646", true));
		kent.setCourses(s);
		Assert.assertEquals(2, kent.getCoursesQuantity());
		Course machinelearning = new Course("MC886", true);
		kent.addCourse(machinelearning);
		kent.addCourse(new Course("MC536", false));
		Assert.assertEquals(4, kent.getCoursesQuantity());
		kent.removeCourse(machinelearning);
		Assert.assertEquals(3, kent.get);

		System.out.print("Advanced courses: " + kent.getAdvancedCoursesQuantity());
	}

}