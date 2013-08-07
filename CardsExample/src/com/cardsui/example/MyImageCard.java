package com.cardsui.example;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.fima.cardsui.objects.Card;

public class MyImageCard extends Card {

	public MyImageCard(String title, int image){
		super(title, image);
	}
	
	public MyImageCard(String title, Bitmap bp){
		super(title, bp);
	}
	@Override
	public View getCardContent(Context context) {
		View view = LayoutInflater.from(context).inflate(R.layout.card_picture, null);

		((TextView) view.findViewById(R.id.title)).setText(title);
		
		if (bp==null) {
			((ImageView) view.findViewById(R.id.imageView1)).setImageResource(image);
		} else {
			((ImageView) view.findViewById(R.id.imageView1)).setImageBitmap(bp);
		}
		
		
		
		return view;
	}

	
	
	
}
