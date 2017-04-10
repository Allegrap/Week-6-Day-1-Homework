public class Shark{
  private String name;
  private Person[] belly;

  public Shark(String name){
    this.name = name;
    this.belly = new Person[3];
  }

  public String getName(){
    return this.name;
  }

  public int foodCount(){
    int count = 0;
    for(Person person : this.belly){
      if(person != null){
        count++;
      }
    }
    return count;
  }
}