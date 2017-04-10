import static org.junit.Assert.assertEquals;
import org.junit.*;

public class SharkTest{
  Shark shark;
  Person person;

  @Before
  public void before() {
    shark = new Shark("Sheila");
    person = new Person();
  }

  @Test
  public void hasName(){
    assertEquals("Sheila", shark.getName() );
  }

  @Test
  public void bellyStartsEmpty() {
    assertEquals(0, shark.foodCount() );
  }

  @Test
  public void canEatPerson() {
    this.shark.eat(person);
    assertEquals(1, this.shark.foodCount() );
  }

  @Test
  public void cannotEatPeopleWhenBellyFull() {
    for(int i = 0; i < 10; i++){
      this.shark.eat(this.person);
    }

    assertEquals(3, this.shark.foodCount() );
  }

}