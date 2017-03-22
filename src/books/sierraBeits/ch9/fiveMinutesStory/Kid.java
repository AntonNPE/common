package books.sierraBeits.ch9.fiveMinutesStory;

import java.util.ArrayList;


public class Kid extends Parent {

    public Kid(ArrayList list) {
        super(list);

        for (int i = 0; i < 10; i++) {
            list.add("Kids Hi" );
            System.out.println("Kids ocnstructor" + list.size());
        }

    }
}
