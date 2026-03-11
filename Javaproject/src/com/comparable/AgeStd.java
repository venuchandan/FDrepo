package com.comparable;

public class AgeStd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		import java.util.Comparator;

		public class AgeCompare implements Comparator<Student> {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.age == o2.age) {
					return 0;
				} else if (o1.age > o2.age) {
					return -1;
				} else {
					return 0;
				}

			}

		}
	}

}
