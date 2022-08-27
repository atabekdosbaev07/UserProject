package ProjectEx.Model.Gender;

public enum Gender {

    MAN("Male"),
    WOMAN("Female");

    private String gen;


    Gender(String gender) {
        this.gen = gender;
    }


    public String getGen() {
        return gen;
    }

    @Override
    public String toString() {
        return gen + '\'';
    }
}
