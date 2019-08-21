package com.example.practicacalificada1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtpalabra;
    TextView txt1,txt2,txtestado;

    String [] lis = new String[4];
    int i =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtpalabra=(EditText)findViewById(R.id.txtpalabra);

        txt1=(TextView)findViewById(R.id.txtres1);
        txt2=(TextView)findViewById(R.id.txtres2);
        txtestado=(TextView)findViewById(R.id.txtestado);

    }

    public void Agregar(View view ){
        String palabra=txtpalabra.getText().toString();


        lis[i]=palabra;
        i++;
        Toast.makeText(this, "Palabra Agregada", Toast.LENGTH_SHORT).show();
        if (lis.length==2){
            txtpalabra.setEnabled(false);
        }


    }
    public void Mostar(View view ){
        String vocalesacerradas="iu";

        int contadorvocalescerradas=0;
        int contadorvocalescerradas2=0;

        String palabra1=lis[0].toString();
        String palabra2=lis[1].toString();

        for (int j = 0; j <palabra1.length(); j++) {
            for (int k = 0; k < vocalesacerradas.length(); k++) {
                if (palabra1.charAt(j)==vocalesacerradas.charAt(k)) {
                    contadorvocalescerradas++;

                    txt1.setText(""+contadorvocalescerradas);

                }
            }

        }
        for (int j = 0; j < palabra2.length(); j++) {
            for (int k = 0; k < vocalesacerradas.length(); k++) {
                if (palabra2.charAt(j)==vocalesacerradas.charAt(k)) {
                    contadorvocalescerradas2++;
                    txt2.setText(""+contadorvocalescerradas2);

                }
            }
        }



        if (palabra1.equals(palabra2)) {
            txtestado.setText("Son  iguales");

        }
        else    {
            txtestado.setText(" No Son iguales");
        }
    }
}
