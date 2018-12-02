package ganti.randomthings;

import java.util.ArrayList;
import ganti.randomthings.helper.RandomArrayListHelper;
import ganti.randomthings.provider.RandomThingsProvider;

class RandomThingsBase<T> {
	
	protected RandomThingsProvider provider;
	protected ArrayList<T> things;

	public RandomThingsBase(RandomThingsProvider provider) {
		this.provider = provider;
	}

	public T one() {
		return RandomArrayListHelper.getOneRandomEntry(things);
	}

	public ArrayList<T> many(int count) {
		return RandomArrayListHelper.getManyRandomEntrys(count, things);
	}
}
