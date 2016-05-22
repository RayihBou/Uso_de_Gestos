package comrayihbou.github.gestos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{

    private TextView mainText1;
    private GestureDetectorCompat gestureDetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText1 = (TextView)findViewById(R.id.mainText1);
        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);

    }

    // Generacion de Methodos por Menu
    ////////////////////////Gestos Iniciados/////////////////////////

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        mainText1.setText("Click Simple Confirmado");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        mainText1.setText("Doble Click Confirmado");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        mainText1.setText("Evento Doble Click Confirmado");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        mainText1.setText("Abajo Confirmado");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        mainText1.setText("ShowPress Confirmado");


    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        mainText1.setText("SingleTapUp Confirmado");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        mainText1.setText("Scroll Confirmado");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        mainText1.setText("LongPress Confirmado");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        mainText1.setText("Fling Confirmado");
        return true;
    }

    ////////////////////////Gestos Finalizados/////////////////////////


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
