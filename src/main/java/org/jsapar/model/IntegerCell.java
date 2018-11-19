package org.jsapar.model;

/**
 * Integer cell that contains integer values of any length; Byte, Short, Integer and Long.
 *
 */
public final class IntegerCell extends NumberCell implements Comparable<IntegerCell>{

    private static final long serialVersionUID = -6131249480571994885L;

    /**
     * @param name The name of the cell
     * @param value The value
     */
    public IntegerCell(String name, Integer value) {
	super(name, value, CellType.INTEGER);
    }

    /**
     * @param name The name of the cell
     * @param value The value
     */
    public IntegerCell(String name, Long value) {
	super(name, value, CellType.INTEGER);
    }

    /**
     * @param name The name of the cell
     * @param value The value
     */
    public IntegerCell(String name, Short value) {
        super(name, value, CellType.INTEGER);
    }

    /**
     * @param name The name of the cell
     * @param value The value
     */
    public IntegerCell(String name, Byte value) {
        super(name, value, CellType.INTEGER);
    }



    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(IntegerCell right){
    	final Long leftValue = this.getValue().longValue();
    	final Long rightValue = right.getValue().longValue();
    	return leftValue.compareTo(rightValue);
    }

    @Override
    public int compareValueTo(Cell<Number> right) {
        if(right instanceof IntegerCell)
            return Integer.compare(getValue().intValue(), right.getValue().intValue());
        return super.compareValueTo(right);
    }

    /**
     * @param name The name of the empty cell.
     * @return A new Empty cell of supplied name.
     */
    public static Cell emptyOf(String name) {
        return new EmptyCell(name, CellType.INTEGER);
    }

}
