package com.example.uas1;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

public class customButton extends AppCompatButton {
    private int greenBtn;
    private int pinkBtn;
    private boolean isClicked = false;

    public customButton(@NonNull Context context) {
        super(context);
        init();
    }

    public customButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public customButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        greenBtn = Color.GREEN;
        pinkBtn = Color.rgb(255, 120, 196);
        setBackgroundColor(greenBtn);
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked) {
                    setBackgroundColor(greenBtn);
                    isClicked = false;
                } else {
                    setBackgroundColor(pinkBtn);
                    isClicked = true;
                }
            }
        });
    }
}
