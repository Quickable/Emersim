package Emersim.Map;

interface Graphic {
    /*
     * Interface to be implemented by all graphic objects on the map
     */

    void remove();

    void rename(String newName);

    String getName();
}
