package castro.rodriguez.fernando.registro_de_personas;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Princial extends AppCompatActivity {

    /// Declaramos Variables

    private EditText primernombre;
    private EditText segundonombre;
    private EditText apellido1;
    private EditText apellido2 ;
    private EditText edad;
    private Spinner ComboGenero;
    private ArrayAdapter<String>adapter;
    private String [] opc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_princial);

        //Capturamos las Cajas

        primernombre = (EditText)findViewById(R.id.txtprimernombre);
        segundonombre = (EditText)findViewById(R.id.txtsegundonombre);
        apellido1 = (EditText)findViewById(R.id.txtapellido1);
        apellido2 = (EditText)findViewById(R.id.txtapellido2);
        edad = (EditText)findViewById(R.id.txtedad);

        /// combo

        ComboGenero = (Spinner)findViewById(R.id.cmdGenero);

    }






}
