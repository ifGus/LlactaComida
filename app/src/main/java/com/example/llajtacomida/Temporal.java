package com.example.llajtacomida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class Temporal extends AppCompatActivity {

    private ViewFlipper vfCarrucel;
    private Button btnInfo, btnAcerca;
    private ImageButton btnPlates, btnRestaurants, btnPrevious, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButttons();
        setVfCarrucel();
    }

    private void setVfCarrucel(){
        vfCarrucel = (ViewFlipper) findViewById(R.id.vfCarrucel);
        iniciarAnimacion();
    }

    private void setButttons(){
        btnPrevious = (ImageButton) findViewById(R.id.btnPrevious);
        btnNext = (ImageButton) findViewById(R.id.btnNext);
        btnPlates = (ImageButton) findViewById(R.id.btnPlates);
        btnRestaurants = (ImageButton) findViewById(R.id.btnRestaurants);
        btnInfo = (Button) findViewById(R.id.btnInfo);
        btnAcerca = (Button) findViewById(R.id.btnInfo);
    }

    public void getAcctionListener(View view){
        switch (view.getId()){
            case R.id.btnPrevious:
                vfCarrucel.showPrevious();
                break;
            case R.id.btnNext:
                vfCarrucel.showNext();
                break;
            case R.id.btnPlates:
                Toast.makeText(this, "Platos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnRestaurants:
                Toast.makeText(this, "Restaurantes", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnAcerca:
                Toast.makeText(this, "Acerca", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnInfo:
                Toast.makeText(this, "Información", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "Acción desconocida", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * inicia la animacion del carrucen (Cambios automáticos
     */
    private void iniciarAnimacion(){
        vfCarrucel.setDisplayedChild(1);
        vfCarrucel.setFlipInterval(5000);
        vfCarrucel.startFlipping();
    }
}