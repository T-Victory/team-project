package models;

public class Pin {
    int id; // The name of the pin
    String owner;
    Coordinate coordinate;
    Passage passage;
    String description;
    boolean visible = true;

    // Different constructors, that's all
    public Pin(int id, String owner, Coordinate coordinate, Passage passage, String description, boolean visible) {
        this.id = id;
        this.owner = owner;
        this.coordinate = coordinate;
        this.passage = passage;
        this.description = description;
        this.visible = visible;
    }

    public Pin(int id, String owner, Coordinate coordinate, Passage passage, String description) {
        this.id = id;
        this.owner = owner;
        this.coordinate = coordinate;
        this.passage = passage;
        this.description = description;
    }

    public void setVisible(boolean visible){
        this.visible = visible;
    }

    public String getDescription(){
        return description;
    }


}
