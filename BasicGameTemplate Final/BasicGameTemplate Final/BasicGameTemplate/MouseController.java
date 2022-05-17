import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseController extends MouseAdapter {
    private boolean mouseClicked = false;
    private int numOfClicks;
    private static final MouseController instance = new MouseController();
    public MouseController(){

    }

    public static MouseController getInstance(){return instance;}
    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        mouseClicked = true;
        numOfClicks = e.getClickCount();
        System.out.println(e.getClickCount());


    }


    public boolean isMouseClicked() {
        return mouseClicked;
    }

    public int getNumOfClicks(){
        return numOfClicks;
    }

    public void setMouseClicked(boolean mouseClicked) {
        this.mouseClicked = mouseClicked;
    }
}
