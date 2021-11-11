class DanielTravaglia{
    private String name;
    private String surname;

    public DanielTravaglia(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Ciao, my name is " + this.name + ", and my surname is " + this.surname;
    }
}