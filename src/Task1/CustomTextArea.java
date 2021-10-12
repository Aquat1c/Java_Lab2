package Task1;

public class CustomTextArea extends TextArea {
    private String font;

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public CustomTextArea(int width, int height, String text, String font) {
        super(width, height, text);
        System.out.println("CustomTextArea constructor");
        this.font = font;
    }

    @Override
    public String toString() {
        return "CustomTextArea { " +
                "width = " + this.getWidth() +
                ", height = " + this.getHeight() +
                ", text = '" + this.getText() + "'" +
                ", font = '" + font + "'" +
                " }";
    }

    {
        System.out.println("CustomTextArea init block");
    }

    static {
        System.out.println("CustomTextArea static block");
    }

}
