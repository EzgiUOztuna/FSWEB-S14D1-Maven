import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.*;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(ResultAnalyzer.class)
public class MainTest {

    private Circle circle;
    private Cylinder cylinder;
    private Rectangle rectangle;
    private Cuboid cuboid;
    private Employee employee;

    private HRManager hrManager;
    private JuniorDeveloper juniorDeveloper;
    private MidDeveloper midDeveloper;
    private SeniorDeveloper seniorDeveloper;

    @BeforeEach
    void setUp() {
        circle = new Circle(2);
        cylinder = new Cylinder(2,2);
        rectangle = new Rectangle(1,2);
        cuboid = new Cuboid(1, 2, 3);
        employee = new Employee(1, "Jane Doe", 20000);
        hrManager = new HRManager(1, "John Doe", 120000);
        juniorDeveloper = new JuniorDeveloper(1, "Junior Doe", 45000);
        midDeveloper = new MidDeveloper(1, "Mid Doe", 60000);
        seniorDeveloper = new SeniorDeveloper(1, "Senior Doe", 100000);
    }

    @DisplayName("Circle sınıf değişkenleri doğru access modifier a sahip mi ?")
    @Test
    public void testCircleAccessModifiers() throws NoSuchFieldException {
        Field radiusField = circle.getClass().getDeclaredField("radius");
        assertEquals(radiusField.getModifiers(), 2);
    }

    @DisplayName("Circle sınıf değişkenleri doğru type a sahip mi ?")
    @Test
    public void testCircleTypes() throws NoSuchFieldException {
        assertThat(circle.getRadius(), instanceOf(Number.class));
    }

    @DisplayName("getArea methodu Circle sınıfında doğru çalışıyor mu?")
    @Test
    public void testGetArea() throws NoSuchFieldException {
        assertTrue(String.format("%.2f", circle.getArea()).contains("12"));
    }

    @DisplayName("Circle sınıf değişkenleri doğru access modifier a sahip mi ?")
    @Test
    public void testCylinderAccessModifiers() throws NoSuchFieldException {
        Field heightField = cylinder.getClass().getDeclaredField("height");
        assertEquals(heightField.getModifiers(), 2);
    }

    @DisplayName("Cylinder sınıfı ve değişkenleri doğru type a sahip mi ?")
    @Test
    public void testCylinderTypes() throws NoSuchFieldException {
        assertThat(cylinder, instanceOf(Circle.class));
        assertThat(cylinder.getHeight(), instanceOf(Number.class));
    }

    @DisplayName("getVolume methodu doğru çalışıyor mu?")
    @Test
    public void testGetVolume() throws NoSuchFieldException {
        assertTrue(String.format("%.2f", cylinder.getVolume()).contains("25"));
    }

    @DisplayName("Rectangle sınıf değişkenleri doğru access modifier a sahip mi ?")
    @Test
    public void testRectangleAccessModifiers() throws NoSuchFieldException {
        Field widthField = rectangle.getClass().getDeclaredField("width");
        assertEquals(widthField.getModifiers(), 2);
        Field lengthField = rectangle.getClass().getDeclaredField("length");
        assertEquals(lengthField.getModifiers(), 2);
    }

    @DisplayName("Rectangle sınıf değişkenleri doğru type a sahip mi ?")
    @Test
    public void testRectangleTypes() throws NoSuchFieldException {
        assertThat(rectangle.getWidth(), instanceOf(Number.class));
        assertThat(rectangle.getLength(), instanceOf(Number.class));
    }

    @DisplayName("getArea methodu Rectangle sınıfında doğru çalışıyor mu?")
    @Test
    public void testGetAreaRectangle() throws NoSuchFieldException {
        assertEquals(String.format("%.2f", rectangle.getArea()), "2.00");
    }

    @DisplayName("Cuboid sınıf değişkenleri doğru access modifier a sahip mi ?")
    @Test
    public void testCuboidAccessModifiers() throws NoSuchFieldException {
        Field widthField = cuboid.getClass().getDeclaredField("height");
        assertEquals(widthField.getModifiers(), 2);
    }

    @DisplayName("Cuboid sınıf değişkenleri doğru type a sahip mi ?")
    @Test
    public void testCuboidTypes() throws NoSuchFieldException {
        assertThat(cuboid, instanceOf(Rectangle.class));
        assertThat(cuboid.getHeight(), instanceOf(Number.class));
    }

    @DisplayName("getVolume methodu Cuboid sınıfında doğru çalışıyor mu?")
    @Test
    public void testGetVolumeRectangle() throws NoSuchFieldException {
        assertEquals(String.format("%.2f", cuboid.getVolume()), "6.00");
    }

    @DisplayName("Employee sınıf değişkenleri doğru access modifier a sahip mi ?")
    @Test
    public void testEmployeeAccessModifiers() throws NoSuchFieldException {
        Field idField = employee.getClass().getDeclaredField("id");
        assertEquals(idField.getModifiers(), 2);
        Field nameField = employee.getClass().getDeclaredField("name");
        assertEquals(nameField.getModifiers(), 2);
        Field salaryField = employee.getClass().getDeclaredField("salary");
        assertEquals(salaryField.getModifiers(), 2);
    }

    @DisplayName("Employee sınıf değişkenleri doğru type a sahip mi ?")
    @Test
    public void testEmployeeTypes() throws NoSuchFieldException {
        assertThat(employee.getId(), instanceOf(Number.class));
        assertThat(employee.getName(), instanceOf(String.class));
        assertThat(employee.getSalary(), instanceOf(Number.class));
    }

    @DisplayName("Employee sınıfından doğru türeyen sınıflar var mı ?")
    @Test
    public void testEmployeeSubClasses() throws NoSuchFieldException {
        assertThat(hrManager, instanceOf(Employee.class));
        assertThat(juniorDeveloper, instanceOf(Employee.class));
        assertThat(midDeveloper, instanceOf(Employee.class));
        assertThat(seniorDeveloper, instanceOf(Employee.class));
    }



}
