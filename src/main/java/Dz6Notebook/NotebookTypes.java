package Dz6Notebook;
import java.util.Objects;
public class NotebookTypes {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotebookTypes that = (NotebookTypes) o;
        return Objects.equals(memory, that.memory) && Objects.equals(color, that.color) && Objects.equals(screen_diagonal, that.screen_diagonal) && Objects.equals(processor, that.processor) && Objects.equals(housing_material, that.housing_material) && Objects.equals(housing_type, that.housing_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memory, color, screen_diagonal, processor, housing_material, housing_type);
    }

    @Override
    public String toString() {
        return "NotebookTypes{" +
                "memory='" + memory + '\'' +
                ", color='" + color + '\'' +
                ", screen_diagonal='" + screen_diagonal + '\'' +
                ", processor='" + processor + '\'' +
                ", housing_material='" + housing_material + '\'' +
                ", housing_type='" + housing_type + '\'' +
                '}';
    }

    private String memory;
    private String color;
    private String screen_diagonal;
    private String processor;
    private String housing_material;
    private String housing_type;
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getScreen_diagonal() {
        return screen_diagonal;
    }

    public void setScreen_diagonal(String screen_diagonal) {
        this.screen_diagonal = screen_diagonal;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getHousing_material() {
        return housing_material;
    }

    public void setHousing_material(String housing_material) {
        this.housing_material = housing_material;
    }

    public String getHousing_type() {
        return housing_type;
    }

    public void setHousing_type(String housing_type) {
        this.housing_type = housing_type;
    }

}
