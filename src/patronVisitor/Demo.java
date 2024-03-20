package patronVisitor;

public class Demo {

    /*
    En este ejemplo, queremos exportar un grupo de formas geométricas a XML. La idea es que no queremos cambiar
    directamente el código de las formas o, al menos, debemos intentar mantener los cambios al mínimo.
    Al fin y al cabo, el patrón Visitor establece una infraestructura que nos permite añadir cualquier comportamiento a
    la jerarquía de formas sin cambiar el código existente de esas clases.
     */
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}

