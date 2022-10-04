/**
 * @file Manager.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package Exercise_3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employee {
	public Manager(String n, double s, int d, int m, int y) {
		super(n, s, d, m, y);
		secretaryName = "";
	}

	public void raiseSalary(double byPercent) {
		// add 1/2% bonus for every year of service
		GregorianCalendar todaysDate = new GregorianCalendar();
		int currentYear = todaysDate.get(Calendar.YEAR);
		double bonus = 0.5 * (currentYear - hireYear());
		super.raiseSalary(byPercent + bonus);
	}

	public String getSecretaryName() {
		return secretaryName;
	}

	private String secretaryName;
}
/*
 * 
 * Penjelasan pada Manager.java
 * pada class Manager extends Employee berarti class Manager merupakan turunan
 * dari class Employee
 * sehingga class Manager dapat mengakses semua method dan variabel yang ada
 * pada class Employee
 * didalam class ini terdapat method Manager yang merupakan constructor dari
 * class Manager
 * didalam class Manager ini terdapat method raiseSalary yang merupakan method
 * override yang sama dengan method raiseSalary pada class Employee
 * method raiseSalary pada class Manager ini memiliki fungsi yang sama dengan
 * method raiseSalary pada class Employee
 * namun pada method raiseSalary pada class Manager ini terdapat tambahan fungsi
 * yaitu menambahkan bonus 0.5% untuk setiap tahun kerja
 * kemudian didalam class Manager ini terdapat method getSecretaryName yang
 * merupakan method getter untuk variabel secretaryName
 * 
 */