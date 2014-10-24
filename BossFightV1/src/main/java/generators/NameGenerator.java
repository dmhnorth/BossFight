package generators;

public interface NameGenerator {

    /**
     * For getting a randomly generated string name from any source.
     * Should never return the same name twice.
     *
     *
     * @return name no longer than 30 characters long
     */
    String getUniqueName();
}
