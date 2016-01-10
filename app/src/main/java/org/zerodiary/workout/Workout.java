package org.zerodiary.workout;

/**
 * Created by peter on 16-1-4.
 */
public class Workout {
    private String name;
    private String description;

    public Workout(String name,String description){
        this.name = name;
        this.description = description;
    }

    public static final Workout[] workOuts = {
            new Workout("The test one","1. hahahah \n2. wawawawawa \n3.lalalalalal "),
            new Workout("The test two","2. ooouuo \n3.sadfjlsajfl"),
            new Workout("The test three","23 oooudsduo \n3.sadfjlsajfl")
    };

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public String toString(){
        return this.name;
    }

}
