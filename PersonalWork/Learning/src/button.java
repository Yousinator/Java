//! Abstraction Example.

public abstract class button {
    private String length;
    private String width;

    public button(String Buttonlength, String width) {
        length = Buttonlength;
        this.width = width;
    }

    public abstract void redirect();
}
