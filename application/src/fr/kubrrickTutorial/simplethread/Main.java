package fr.kubrrickTutorial.simplethread;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class Main extends Activity {

	private ProgressBar pb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main);

		pb = (ProgressBar) this.findViewById(R.id.progressBar);

	}



	public void startThread(View v){

		final int max = 1000000;
		pb.setMax(max);
		pb.setProgress(0);
		pb.animate();

		new Thread(new Runnable(){

			@Override
			public void run() {

				for(int i=0; i<max; i++){

					pb.setProgress(i);							

				}

			}

		}).start();

	}

}