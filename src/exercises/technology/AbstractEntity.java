package exercises.technology;

import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractEntity {
    private int Id;


    public AbstractEntity() {
        this.Id = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    }//used to get random numbers, similar to get math object in JS;

    public int getId() {
        return this.Id;
    }
}
//abstract class is a class that similar in TS: interface; abstract class is never instantiated,
//you never intend on building an object from; eg. this exercise asks us to create and assign an id, eg. in our app,
//we're building computers and smartphones, but there are other things in the future of our application that are going to need
//ids, if we make an abstract entity that creates and assigns ids to objects and we don't make it super generic and we get it an
//abstract level, making it an abstract class, we prob never need to create something that's just an id, but there's a lot of
//things that need an id, so we can use this in our application, if we ever have to make a change we just go to one spot no matter
//how big your application gets. This is very generic. Good use case for an abstract class. eg. phone cases need ids, sim cards need
//ids, saves you from repeating yourself across app,