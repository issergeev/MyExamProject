package ru.samsung.itschool.spacearrays;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import static android.view.View.GONE;

public class MainActivity extends Activity {

	Switch drawSwitch;
	View mainView;
	Button clearButton, spawnCircleButton, spawnRectButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		drawSwitch = (Switch) findViewById(R.id.drawViewSwitch);
		mainView = (View) findViewById(R.id.myDraw1);
		drawSwitch.setChecked(true);
		drawSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
				if (drawSwitch.isChecked()){
					mainView.setVisibility(View.VISIBLE);
				}else
					mainView.setVisibility(GONE);
			}
		});
		clearButton = (Button) findViewById(R.id.removeAllButton);
		clearButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				MyDraw.arrayList.clear();
			}
		});
		spawnCircleButton = (Button) findViewById(R.id.spawnButton);
		spawnRectButton = (Button) findViewById(R.id.spawnButton2);
		spawnCircleButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				MyDraw.arrayList.add(new Circle((float) (Math.random()*1000),  (float) (Math.random()*1000),
						(float) (Math.random()*10)));
			}
		});

		spawnRectButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				MyDraw.arrayList.add(new Rectangle((float) (Math.random()*1000),  (float) (Math.random()*1000),
						(float) (Math.random()*60),  (float) (Math.random()*60)));
			}
		});
	}
}