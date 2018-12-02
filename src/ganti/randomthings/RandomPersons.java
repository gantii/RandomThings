package ganti.randomthings;

import ganti.randomthings.models.Person;
import ganti.randomthings.provider.RandomThingsProvider;

public class RandomPersons extends RandomThingsBase<Person> {

	public RandomPersons(RandomThingsProvider provider) {
		super(provider);
		things = provider.getAllPersons();
	}
}