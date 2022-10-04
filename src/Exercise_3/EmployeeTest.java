/**
 * @file EmployeeTest.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package Exercise_3;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
		staff[1] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
		staff[2] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);

		// Sortable.shell_sort(staff); jika static

		int i;
		for (i = 0; i < 3; i++)
			staff[i].raiseSalary(5);
		for (i = 0; i < 3; i++)
			staff[i].print();
	}
}
