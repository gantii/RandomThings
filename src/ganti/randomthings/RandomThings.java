package ganti.randomthings;

import ganti.randomthings.provider.RandomThingsProvider;

public class RandomThings {
	private static RandomThings instance;
	private RandomThingsProvider provider;
	private RandomPlaces randomPlaces;
	private RandomPersons randomPersons;
	private RandomStreets randomStreets;

	private RandomThings(RandomThingsProvider provider) {
		randomPlaces = new RandomPlaces(provider);
		randomPersons = new RandomPersons(provider);
		randomStreets = new RandomStreets(provider);
	}

	public static RandomThings give(RandomThingsProvider provider) throws Exception {
		if (instance != null) {
			throw new Exception();
		} else {
			instance = new RandomThings(provider);

		}
		return instance;
	}

	public RandomPlaces place() {
		return randomPlaces;
	}

	public RandomPersons person() {
		return randomPersons;
	}

	public RandomStreets street() {
		return randomStreets;
	}
}
