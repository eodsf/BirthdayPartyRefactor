package scrap.heap.refactor.domain;

/**
 * Domain object to model a balloon
 */
public class Balloon {
    private final Color color;
    private final Material material;

    private Balloon(final Color color, final Material material) {
        this.color = color;
        this.material = material;
    }

    /**
     * Return the balloon's color
     *
     * @return the balloon's color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Return the balloon's material
     *
     * @return the balloon's material
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Provides a description of the Balloon entity
     *
     * @return a description of the Balloon entity
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Color : ").append(getColor().name()).append(", ");
        sb.append("Material : ").append(getMaterial().name()).append(", ");
        return sb.toString();
    }

    /**
     * Builder for the Balloon entity
     */
    public static class Builder {
        private Color color;
        private Material material;

        /**
         * Adds the color to the balloon attributes to be built
         *
         * @param color the color to set
         * @return the builder
         */
        public Builder withColor(Color color) {
            this.color = color;
            return this;
        }

        /**
         * Adds the material to the balloon attributes to be built
         *
         * @param material the material to set
         * @return the builder
         */
        public Builder withMaterial(Material material) {
            this.material = material;
            return this;
        }

        public Balloon build() {
            if (color == null || material == null) {
                //alternatively, you could choose a reasonable default(s)
                throw new UnsupportedOperationException("To build a balloon please supply a material & color");
            }
            return new Balloon(color, material);
        }
    }

    /**
     * Supported colors for our balloons
     */
    public enum Color {
        RED,
        YELLOW,
        BLUE
    }

    /**
     * Supported materials for our balloons
     */
    public enum Material {
        MYLAR,
        LATEX
    }
}
