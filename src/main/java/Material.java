import java.util.Objects;

public class Material {
    private String name;
    private String description;
    private String icon;
    private Integer maxCapacity;

    public Material(String name, String description, String icon, Integer maxCapacity) {
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Material)) return false;
        Material material = (Material) o;
        return Objects.equals(name, material.name) && Objects.equals(description, material.description) && Objects.equals(icon, material.icon) && Objects.equals(maxCapacity, material.maxCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, icon, maxCapacity);
    }

    @Override
    public String toString() {
        return "Materials{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
