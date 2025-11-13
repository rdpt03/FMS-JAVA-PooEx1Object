package fr.fms.javaoopex1;

/**
 * Represents a person with basic information such as last name, first name, age, address, and city of birth.
 * Provides multiple constructors for flexibility, as well as standard getters and setters.
 */
public class Person {
    private String lastName;
    private String firstName;
    private int age;
    private String adress;
    private City bornCity;

    /**
     * Constructs a person with full information including city of birth.
     *
     * @param lastName  the person's last name
     * @param firstName the person's first name
     * @param age       the person's age
     * @param adress    the person's address
     * @param bornCity  the city where the person was born
     */
    public Person(String lastName, String firstName, int age, String adress, City bornCity) {
        super();
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.adress = adress;
        this.bornCity = bornCity;
    }

    /**
     * Constructs a person with last name, first name, age, and address.
     *
     * @param nom     the person's last name
     * @param prenom  the person's first name
     * @param age     the person's age
     * @param adresse the person's address
     */
    public Person(String nom, String prenom, int age, String adresse) {
        super();
        this.lastName = nom;
        this.firstName = prenom;
        this.age = age;
        this.adress = adresse;
    }

    /**
     * Constructs a person with last name, first name, and age.
     *
     * @param nom    the person's last name
     * @param prenom the person's first name
     * @param age    the person's age
     */
    public Person(String nom, String prenom, int age) {
        super();
        this.lastName = nom;
        this.firstName = prenom;
        this.age = age;
    }

    /**
     * Constructs a person with only last name and first name.
     *
     * @param nom    the person's last name
     * @param prenom the person's first name
     */
    public Person(String nom, String prenom) {
        super();
        this.lastName = nom;
        this.firstName = prenom;
    }

    /**
     * Returns the last name of the person.
     *
     * @return the last name
     */
    public String getNom() {
        return lastName;
    }

    /**
     * Sets or updates the last name of the person.
     *
     * @param nom the new last name
     */
    public void setNom(String nom) {
        this.lastName = nom;
    }

    /**
     * Returns the first name of the person.
     *
     * @return the first name
     */
    public String getPrenom() {
        return firstName;
    }

    /**
     * Sets or updates the first name of the person.
     *
     * @param prenom the new first name
     */
    public void setPrenom(String prenom) {
        this.firstName = prenom;
    }

    /**
     * Returns the age of the person.
     *
     * @return the age in years
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets or updates the age of the person.
     *
     * @param age the new age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the address of the person.
     *
     * @return the address
     */
    public String getAdresse() {
        return adress;
    }

    /**
     * Sets or updates the address of the person.
     *
     * @param adresse the new address
     */
    public void setAdresse(String adresse) {
        this.adress = adresse;
    }

    /**
     * Returns the city where the person was born.
     *
     * @return the birthplace city
     */
    public City getBornCity() {
        return bornCity;
    }

    /**
     * Sets or updates the city where the person was born.
     *
     * @param bornCity the new birthplace city
     */
    public void setBornCity(City bornCity) {
        this.bornCity = bornCity;
    }

    /**
     * Returns a readable string representation of the person,
     * including last name, first name, age, address, and birthplace.
     *
     * @return a string describing the person
     */
    @Override
    public String toString() {
        return lastName + ", " + firstName + ", " + age + " ans, habitant " + adress + ", v
