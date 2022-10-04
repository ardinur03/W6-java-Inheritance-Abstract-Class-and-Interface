/**
 * @file Sortable.java
 * @author : Muhamad Ardi Nur Insan - 211511022
 */

package Exercise_3;

abstract class Sortable {
	public abstract int compare(Sortable b);

	public void shell_sort(Sortable[] a) {
		// Shell sort body
		int n = a.length;
		Sortable temp;
		for (int gap = n / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < n; i++) {
				temp = a[i];
				int j;
				for (j = i; j >= gap && a[j - gap].compare(temp) > 0; j -= gap) {
					a[j] = a[j - gap];
				}
				a[j] = temp;
			}
		}
	}
}

/*
 * Penjelesan pada Sortable.java
 * pada class Sortable terdapat method abstract compare yang berfungsi untuk
 * mengkomperasi nilai dari temp yang dimana nilai tersebut diambil dari array
 * a.
 * selanjutnya terdapat method static shell_sort yang berfungsi untuk
 * mengurutkan nilai yang ada pada array a, kemudian nilai yang sudah diurutkan
 * nantinya akan digunakan sesuai pemanggilan method static shell_sort tersebut.
 * pengurutan nilai pada method static shell_sort menggunakan algoritma shell
 * sort
 */
