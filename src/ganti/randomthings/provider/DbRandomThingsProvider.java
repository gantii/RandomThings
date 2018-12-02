package ganti.randomthings.provider;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ganti.randomthings.models.Person;
import ganti.randomthings.models.Place;
import ganti.randomthings.models.Street;

public class DbRandomThingsProvider extends RandomThingsProvider {
	private Connection connection;
	private static final String db_url = "jdbc:mysql://localhost/classicmodels";
	private static final String user = "root";
	private static final String password = "rootroot";

	public DbRandomThingsProvider() throws SQLException, ClassNotFoundException {
		//Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(db_url, user, password);
	}

	@Override
	public void finalize() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Place> getAllPlaces() {
		ArrayList<Place> places = new ArrayList<Place>();
		try {
			Statement statement = connection.createStatement();

			ResultSet resultset = statement.executeQuery("select city, postalcode from customers where postalcode is not null");
			while (resultset.next()) {
				String postalcode = resultset.getString("postalcode");
				if(postalcode.matches("^[0-9]*$")) {
					places.add(new Place(resultset.getString("city"), Integer.parseInt(postalcode)));
				}
			}
			resultset.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return places;
	}

	@Override
	public ArrayList<Person> getAllPersons() {
		ArrayList<Person> persons = new ArrayList<Person>();
		try {
			Statement statement = connection.createStatement();

			ResultSet resultset = statement.executeQuery("select contactfirstname, contactlastname from customers");
			while (resultset.next()) {
				persons.add(
						new Person(resultset.getString("contactlastname"), resultset.getString("contactfirstname")));
			}
			resultset.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return persons;
	}

	@Override
	public ArrayList<Street> getAllStreets() {
		ArrayList<Street> streets = new ArrayList<Street>();
		try {
			Statement statement = connection.createStatement();

			ResultSet resultset = statement.executeQuery("select addressline1 from customers");
			while (resultset.next()) {
				String adressline = resultset.getString("addressline1");
				if (adressline.matches("^[0-9]{1,}.*$")) {
					int index = 0;
					do {
						adressline.charAt(index++);
					} while (Character.isDigit(adressline.charAt(index)));
					int nr = Integer.parseInt(adressline.substring(0, index));
					String strasse = adressline.substring(index).trim();
					streets.add(new Street(nr, strasse));

				} else if (adressline.matches("^.*[0-9]{1,}$")) {
					int index = adressline.length() - 1;
					do {
						adressline.charAt(index--);
					} while (Character.isDigit(adressline.charAt(index)));

					int nr = Integer.parseInt(adressline.substring(index + 1));
					String strasse = adressline.substring(0, index + 1);

					streets.add(new Street(nr, strasse));
				}
			}
			resultset.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return streets;
	}

}
