package me.noy.javabasics;

public enum EnumExample {

    /**
     * This is an Enum, An Enum is used to define collections of constants.
     * More precisely, an enum is a special kind of class.
     * The class alone means nothing, it needs to be defined and written in another class.
     */

    // First Constant is our Male, "Jack". Saying he is male and 16 years of Age.
    JACK("Male", 16),
    // Second is our Female, "Jill". Saying she is female and 16 years of age.
    JILL("Female", 16)
    ; // Closes the collection of constants.

    /* Here is what is behind our characters. Creating this data down here, makes us able to use a String and an Integer
       in our parameters.
     */
    private final String gender;
    private final Integer age;

    // This is our constructor, we use this to initialise our two fields.
    EnumExample(String gender, Integer age) {
        this.gender = gender;
        this.age = age;
    }

    // Our
    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
