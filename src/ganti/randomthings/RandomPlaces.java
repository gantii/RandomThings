package ganti.randomthings;

import ganti.randomthings.models.Place;
import ganti.randomthings.provider.RandomThingsProvider;

public class RandomPlaces extends RandomThingsBase<Place> {

	public RandomPlaces(RandomThingsProvider provider) {
		super(provider);
		things = provider.getAllPlaces();
	}
}
