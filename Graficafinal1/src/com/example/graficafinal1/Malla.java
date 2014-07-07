package com.example.graficafinal1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Malla extends Activity implements OnClickListener {
	ImageView imagen;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_malla);
		imagen = (ImageView)findViewById(R.id.malla);
		imagen.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.malla, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		
		switch(v.getId()){
		case R.id.malla:
			Animation miAcercamiento = AnimationUtils.loadAnimation(this, R.anim.acercar);
			miAcercamiento.reset();
			imagen.startAnimation(miAcercamiento);
		break;
		
	}}
		public void retroceder(View v){
			Intent i = new Intent(this, MainActivity.class);
			startActivity(i);	
		}

	
}
