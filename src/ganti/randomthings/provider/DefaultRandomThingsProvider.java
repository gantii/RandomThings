package ganti.randomthings.provider;

import java.util.ArrayList;

import ganti.randomthings.models.Person;
import ganti.randomthings.models.Place;
import ganti.randomthings.models.Street;

public class DefaultRandomThingsProvider extends RandomThingsProvider {

	@Override
	public ArrayList<Place> getAllPlaces() {
		ArrayList<Place> places = new ArrayList<Place>();
		places.add(new Place("Hinwil", 8340));
		places.add(new Place("Wetzikon", 8730));
		places.add(new Place("Zuerich", 8000));
		places.add(new Place("Winti", 8200));
		places.add(new Place("Uster", 8470));
		places.add(new Place("Genf", 2300));
		places.add(new Place("Laax", 7007));
		places.add(new Place("Davos", 7025));
		places.add(new Place("Lenz", 7030));
		places.add(new Place("Scuol", 7785));
		places.add(new Place("Disentis", 5304));
		return places;
	}

	@Override
	public ArrayList<Person> getAllPersons() {
		
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Muster", "Hans"));
		persons.add(new Person("Hebling", "Felix"));
		persons.add(new Person("Hohl", "Simon"));
		persons.add(new Person("Deutwiler", "Lauch"));
		persons.add(new Person("Merz", "Rudolf"));
		persons.add(new Person("Blocher", "HansPeter"));
		persons.add(new Person("Vogt", "Ueli"));
		persons.add(new Person("Masta", "Uoep"));
		persons.add(new Person("Meier", "Max"));
		persons.add(new Person("Ragettli", "Andri"));
		persons.add(new Person("Harlaut", "Henrik"));
		persons.add(new Person("Mahler", "Kai"));
		return persons;
	}

	@Override
	public ArrayList<Street> getAllStreets() {
		ArrayList<Street> streets = new ArrayList<Street>();
		streets.add(new Street(3, "Walderstrasse"));
		streets.add(new Street(33, "Bachtelstrasse"));
		streets.add(new Street(43, "Bahnhofstrasse"));
		streets.add(new Street(77, "Duerntnerstrasse"));
		streets.add(new Street(103, "Zuerichstrasse"));
		streets.add(new Street(406, "Freedomstreet"));
		streets.add(new Street(2, "Fitzerstreet"));
		streets.add(new Street(323, "Ragettlistrasse"));
		streets.add(new Street(13, "Rennweg"));
		streets.add(new Street(23, "Sood-Ring"));
		streets.add(new Street(25, "Alpenblickstrasse"));
		streets.add(new Street(1, "Hinwilerstrasse"));
		return streets;
	}
}
