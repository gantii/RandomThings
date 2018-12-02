package ganti.randomthings.provider;

import java.util.ArrayList;
import ganti.randomthings.models.*;

public abstract class RandomThingsProvider {

	public abstract ArrayList<Place> getAllPlaces();

	public abstract ArrayList<Person> getAllPersons();

	public abstract ArrayList<Street> getAllStreets();
}
