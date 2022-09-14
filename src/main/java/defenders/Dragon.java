package defenders;

import interfaces.IDefend;

public class Dragon implements IDefend {

    @Override
    public int defend() {
        return 60;
    }
}
