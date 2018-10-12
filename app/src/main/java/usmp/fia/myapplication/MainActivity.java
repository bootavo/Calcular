package usmp.fia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mNumber;

    TextView mPlus;
    TextView mPrice;
    TextView mCost;

    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNumber = (EditText) findViewById(R.id.et_number);

        btnCalculate = (Button) findViewById(R.id.btn_calculate);
        btnCalculate.setOnClickListener(this);

        mPlus = (TextView) findViewById(R.id.tv_plus);
        mPlus.setOnClickListener(this);

        mPrice = (TextView) findViewById(R.id.tv_price);
        mCost = (TextView) findViewById(R.id.tv_cost);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_calculate:
                Log.d("HOLA", "BOTON");

                if (mNumber.getText().toString() == null || mNumber.getText().toString().isEmpty()){
                    Toast.makeText(this, "Debe ingresar un numero", Toast.LENGTH_SHORT).show();
                }else {
                    double sueldo = Double.parseDouble(mNumber.getText().toString());

                    double plus = sueldo + ( sueldo * 0.10 );
                    mPlus.setText(""+plus);

                    double price = sueldo + ( sueldo * 0.05 );
                    mPrice.setText(""+price);

                    double cost = plus + price + sueldo;
                    mCost.setText(""+cost);
                }

                break;
            case R.id.tv_plus:
                Log.d("HOLA", "PLUS");
                break;

        }

    }
}
