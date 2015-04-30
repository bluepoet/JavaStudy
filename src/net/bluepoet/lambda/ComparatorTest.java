package net.bluepoet.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
	public static void main(String[] args) {
		List<Person> personList = Person.createShortList();

		Collections.sort(personList, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getSurName().compareTo(p2.getSurName());
			}
		});

		for (Person p : personList) {
			System.out.println(p.getSurName());
		}

		Collections.sort(personList, (Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName()));

		for (Person p : personList) {
			System.out.println(p.getSurName());
		}

		Collections.sort(personList, (Person p1, Person p2) -> p2.getSurName().compareTo(p1.getSurName()));

		for (Person p : personList) {
			System.out.println(p.getSurName());
		}
	}
}
