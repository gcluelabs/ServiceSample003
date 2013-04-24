package com.example.service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ServiceSampleActivity extends Activity implements OnClickListener {

	/**
	 * Start Button
	 */
	private Button mButton1;

	/**
	 * Stop Button
	 */
	private Button mButton2;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_service_sample);

		mButton1 = (Button) findViewById(R.id.button1);
		mButton1.setOnClickListener(this);

		mButton2 = (Button) findViewById(R.id.button2);
		mButton2.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		// Start Service
		if (view.equals(mButton1)) {
			Intent intent = new Intent(this, ServiceSampleService.class);
			startService(intent);
		} 
		// Stop Service
		else if (view.equals(mButton2)) {
			Intent intent = new Intent(this, ServiceSampleService.class);
			stopService(intent);
		}
	}
}