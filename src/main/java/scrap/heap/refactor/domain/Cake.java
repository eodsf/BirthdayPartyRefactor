package scrap.heap.refactor.domain;

/**
 * Domain object to model a cake
 */
public class Cake {
    private final Flavor flavor;
    private final FrostingFlavor frostingFlavor;
    private final Shape shape;
    private final Color color;
    private final Size size;

    private Cake(final Flavor flavor, final FrostingFlavor frostingFlavor, final Shape shape, final Color color, final Size size) {
        this.flavor = flavor;
        this.frostingFlavor = frostingFlavor;
        this.shape = shape;
        this.color = color;
        this.size = size;
    }

    public Flavor getFlavor() {
        return flavor;
    }

    public FrostingFlavor getFrostingFlavor() {
        return frostingFlavor;
    }

    public Shape getShape() {
        return shape;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    /**
     * Provides a description of the Cake entity
     *
     * @return a description of the Cake entity
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Flavor : ").append(getFlavor().name()).append(", ");
        sb.append("Frosting flavor : ").append(getFrostingFlavor().name()).append(", ");
        sb.append("Shape : ").append(getShape().name()).append(", ");
        sb.append("Size : ").append(getSize().name()).append(", ");
        sb.append("Color : ").append(getColor().name());
        return sb.toString();
    }

    /**
     * Builder for the Cake entity
     */
    public static class Builder {
        private Flavor flavor;
        private FrostingFlavor frostingFlavor;
        private Shape shape;
        private Color color;
        private Size size;

        /**
         * Adds the flavor to the cake attributes to be built
         *
         * @param flavor the flavor to set
         * @return the builder
         */
        public Builder withFlavor(Flavor flavor) {
            this.flavor = flavor;
            return this;
        }

        /**
         * Adds the frostingFlavor to the cake attributes to be built
         *
         * @param frostingFlavor the frosting flavor to set
         * @return the builder
         */
        public Builder withFrostingFlavor(FrostingFlavor frostingFlavor) {
            this.frostingFlavor = frostingFlavor;
            return this;
        }

        /**
         * Adds the shape to the cake attributes to be built
         *
         * @param shape the shape to set
         * @return the builder
         */
        public Builder withShape(Shape shape) {
            this.shape = shape;
            return this;
        }

        /**
         * Adds the color to the cake attributes to be built
         *
         * @param color the color to set
         * @return the builder
         */
        public Builder withColor(Color color) {
            this.color = color;
            return this;
        }

        /**
         * Adds the size to the cake attributes to be built
         *
         * @param size the size to set
         * @return the builder
         */
        public Builder withSize(Size size) {
            this.size = size;
            return this;
        }

        public Cake build() {
            if (flavor == null || frostingFlavor == null || shape == null || color == null || size == null) {
                //alternatively, you could choose a reasonable default(s)
                throw new UnsupportedOperationException("To build a cake please supply all attributes");
            }
            return new Cake(flavor, frostingFlavor, shape, color, size);
        }
    }

    /**
     * Supported cake flavors
     */
    public enum Flavor {
        VANILLA,
        CHOCOLATE
    }

    /**
     * Supported cake frosting flavors
     */
    public enum FrostingFlavor {
        VANILLA,
        CHOCOLATE
    }

    /**
     * Supported cake shapes
     */
    public enum Shape {
        SQUARE,
        CIRCLE
    }

    /**
     * Supported cake colors
     */
    public enum Color {
        YELLOW,
        BROWN
    }

    /**
     * Supported cake sizes
     */
    public enum Size {
        SMALL,
        MED,
        LARGE
    }
}
