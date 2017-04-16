package art.communicationsbetweentwofragments;


import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements Communicator{

TextView mTvAct;
    FragmentB fB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getFragmentManager();
        fB= (FragmentB) manager.findFragmentById(R.id.fragB);
    }


    @Override
    public void pass(int data) {

        fB.change(data);
    }
}
