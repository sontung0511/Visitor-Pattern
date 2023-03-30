import java.util.ArrayList;
import java.util.List;

class ObjectStructure {

    private List<Element> elements;

    public ObjectStructure() {
        elements = new ArrayList<>();
    }

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void rent(Element element) {
        RentVisitor rentVisitor = new RentVisitor();
        element.accept(rentVisitor);
    }

    public void returnItem(Element element) {
        ReturnVisitor returnVisitor = new ReturnVisitor();
        element.accept(returnVisitor);
    }

    public void display(Element element) {
        DisplayVisitor displayVisitor = new DisplayVisitor();
        element.accept(displayVisitor);
    }
}
