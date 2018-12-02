package ganti.randomthings;

import ganti.randomthings.models.Street;
import ganti.randomthings.provider.RandomThingsProvider;

public class RandomStreets extends RandomThingsBase<Street> {

	public RandomStreets(RandomThingsProvider provider) {
		super(provider);
		things = provider.getAllStreets();
	}
}
