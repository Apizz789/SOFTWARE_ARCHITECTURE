package lab11;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HeightSortStrategy implements SortStrategy {
	@Override
	public void customSort(List<Person> people) {Collections.sort(people, Comparator.comparing( Person::getHeight));}
}