
package cs193a.stanford.edu.lunarlander;

import android.os.Bundle;
import android.view.View;
import stanford.androidlib.*;

public class LanderActivity extends SimpleActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lander);
    }

    public void playClick(View view) {
        LanderCanvas canvas = (LanderCanvas) findViewById(R.id.mycanvas);
        canvas.startGame();
    }

    public void stopClick(View view) {
        LanderCanvas canvas = (LanderCanvas) findViewById(R.id.mycanvas);
        canvas.stopGame();
    }
}
