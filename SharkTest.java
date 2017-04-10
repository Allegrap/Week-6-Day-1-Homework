import static org.junit.Assert.assertEquals;
import org.junit.*;

public class SharkTest{
  Shark shark;
  Person person;

  @Before
  public void before(){
    shark = new Shark("Sheila");
    person = new Person();
  }
}