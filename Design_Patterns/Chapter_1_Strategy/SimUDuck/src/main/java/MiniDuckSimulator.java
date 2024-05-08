import clients.Duck;
import clients.*;

import java.util.ArrayList;
import java.util.List;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<>(
          List.of(new MallardDuck(),
                  new RedheadDuck(),
                  new RubberDuck(),
                  new DecoyDuck()
          )
        );

        for (Duck d : ducks) {
            Service.duckPresentation(d);
        }

    }
}