import java.awt.*;

/**
 * Created by Ecoste on 1/23/2017.
 */
public class Cytoplasm extends GameObject{

    Cytoplasm(Micro_Sim processing) {
        super(processing);
    }

    Cytoplasm(Micro_Sim processing, GameObject parent) {
        super(processing);
        SetParent(parent);
    }

    Cytoplasm(Micro_Sim processing, Point startingPosition) {
        super(processing);
        position = startingPosition;
    }

    public void Update() {
        processing.fill(processing.color(0, 255, 0));
        processing.rect(position.x, position.y, 5, 5);
    }

    public void Start() {

    }
}
