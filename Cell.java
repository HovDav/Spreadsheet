
enum Color {
    red, green, blue, white
}

public class Cell {
    private String value;
    private Color color;

    public Cell () {
        this.value = "0";
        this.color = Color.white;
    }
    public Cell (String value) {
        this.value = value;
        this.color = Color.white;
    }
    public Cell (String value, Color color) {
        this.value = value;
        this.color = color;
    }
    public void setValue (String value) {
        this.value = value;
    }
    public void setColor (Color color) {
        this.color = color;
    }
    public String getValue () {
        return value;
    }
    public Color getColor () {
        return color;
    }
    public int toInt () {
        return Integer.parseInt(value);
    }
    public double toDouble () {
        return  Double.parseDouble(value);
    }
    public Date toDate () {
        Date myDate = new Date();
        return myDate;
    }
    public void reset () {
        this.value = "0";
        this.color = Color.white;
    }
}
