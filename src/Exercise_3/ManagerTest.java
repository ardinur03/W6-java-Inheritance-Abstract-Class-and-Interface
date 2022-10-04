/**
 * @file ManagerTest.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package Exercise_3;

public class ManagerTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
		staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
		staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
		// Sortable.shell_sort(staff);
		int i;
		for (i = 0; i < 3; i++)
			staff[i].raiseSalary(5);
		for (i = 0; i < 3; i++)
			staff[i].print();

	}
}

/*
 * Penjelasan pada ManagerTest.java
 * pada class ManagerTest terdapat method main yang berfungsi untuk menjalankan
 * program yang telah dibuat.
 * pada method main terdapat array staff yang berisi 3 objek dari class
 * Employee.
 * selanjutnya ada proses assignment pada tiap tiap array staff tersebut, yang
 * mana pada array staff[0] meng assignment nilai yang dimana nilai tersebut
 * ditangkap oleh constructor pada class Employee.
 * kemudian pada staff[1] dan staff[2] sama proses assignment nya tetapi yang
 * membedakan hanya datanya
 */