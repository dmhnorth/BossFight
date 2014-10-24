package generators;

public interface NameGenerator {

    /**
     * For getting a randomly generated string name from any source.
     * Should never return the same name twice.
     *
     * @return a randomly generated name
     */
    String getUniqueName();
}
