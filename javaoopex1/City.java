package fr.fms.javaoopex1;

/**
 * Represents a city with a name, country, and number of inhabitants.
 * 
 * This class allows you to create city instances with different levels of information,
 * modify their attributes, and keep track of the total number of cities created.
 * It also provides utility methods to display the city and update its population.
 */
public class City {

    private String cityName;
    private String countryName;
    private int inhabitants;
    private static int citiesCount = 0;

    //---------constructors----------

    /**
     * Constructs a city with a specified name, country, and number of inhabitants.
     *
     * @param nVille     the name of the city
     * @param nPays      the name of the country
     * @param habitants  the number of inhabitants (must be ≥ 0)
     * @throws Exception if the number of inhabitants is negative
     */
    public City(String nVille, String nPays, int habitants) throws Exception {
        if(habitants < 0) {
            throw new Exception("La ville " + nVille + " ne peut contenir moins de 0 habitants");
        }
        this.cityName = nVille;
        this.countryName = nPays;
        this.inhabitants = habitants;
        City.citiesCount++;
    }

    /**
     * Constructs a city with a specified name and number of inhabitants.
     * The country is set to "unknown" by default.
     *
     * @param nVille     the name of the city
     * @param habitants  the number of inhabitants (must be ≥ 0)
     * @throws Exception if the number of inhabitants is negative
     */
    public City(String nVille, int habitants) throws Exception {
        if(habitants < 0) {
            throw new Exception("La ville " + nVille + " ne peut contenir moins de 0 habitants");
        }
        this.cityName = nVille;
        this.countryName = "unknown";
        this.inhabitants = habitants;
        City.citiesCount++;
    }

    /**
     * Constructs a city with a specified name and country.
     * The number of inhabitants is initialized to 0.
     *
     * @param nVille  the name of the city
     * @param country the name of the country
     * @throws Exception if the initial number of inhabitants would be invalid
     */
    public City(String nVille, String country) throws Exception {
        if(inhabitants < 0) {
            throw new Exception("La ville " + nVille + " ne peut contenir moins de 0 habitants");
        }
        this.cityName = nVille;
        this.countryName = country;
        this.inhabitants = 0;
        City.citiesCount++;
    }

    //----------------------getters and setters---------------------

    /**
     * Returns the name of the city.
     *
     * @return the city name
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets or updates the name of the city.
     *
     * @param cityName the new city name
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * Returns the name of the country the city belongs to.
     *
     * @return the country name
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets or updates the country name for the city.
     *
     * @param countryName the new country name
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * Returns the number of inhabitants of the city.
     *
     * @return the population of the city
     */
    public int getInhabitants() {
        return inhabitants;
    }

    /**
     * Updates the number of inhabitants for the city.
     *
     * @param habitants the new population (must be ≥ 0)
     * @throws Exception if the population is negative
     */
    public void setInhabitants(int habitants) throws Exception {
        if(habitants < 0) {
            throw new Exception("La ville " + this.countryName + " ne peut contenir moins de 0 habitants");
        }
        this.inhabitants = habitants;
    }

    /**
     * Adds inhabitants to the current population.
     *
     * @param inhabitantsToAdd the number of inhabitants to add
     * @throws Exception if the resulting population would be negative
     */
    public void addHabitants(int inhabitantsToAdd) throws Exception {
        this.setInhabitants(this.getInhabitants() + inhabitantsToAdd);
    }

    /**
     * Returns the total number of City instances created.
     *
     * @return the number of cities
     */
    public static int getCitiesQuantity() {
        return citiesCount;
    }

    /**
     * Displays the city information to standard output.
     */
    public void display() {
        System.out.println(this.toString());
    }

    /**
     * Returns a readable string representation of the city,
     * including its name, country, and population if greater than 0.
     *
     * @return the string representation of the city
     */
    @Override
    public String toString() {
        return "Ville de " + this.cityName + " en/au " + this.countryName +
               (this.inhabitants > 0 ? " ayant " + this.inhabitants + " habitants" : "");
    }
}
