package learn.packages;
import learn.packages.animals.Dog;
import learn.packages.insects.Beetle;
import learn.packages.plants.Lily;

// To use a type in another package, even in our own project,
// we must import the type.



public class Farm {
    private Dog mitchell;
    private Beetle annoyingbug;
    private Lily tigerLily;

    public Farm() {
        mitchell = new Dog();
        annoyingbug = new Beetle();
        tigerLily = new Lily();
    }

}
