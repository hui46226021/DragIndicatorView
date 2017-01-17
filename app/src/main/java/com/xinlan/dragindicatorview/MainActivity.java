package com.xinlan.dragindicatorview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.xinlan.dragindicator.DragIndicatorView;

public class MainActivity extends AppCompatActivity {
    private DragIndicatorView mIndiactorView;
    private DragIndicatorView mOtherView;
    private View mDismssBtn;
    private View mSecondBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIndiactorView = (DragIndicatorView) findViewById(R.id.indiactor_view);
        mOtherView = (DragIndicatorView) findViewById(R.id.indicator);

        mIndiactorView.setViewCall(new DragIndicatorView.ViewCall() {
            @Override
            public void killView() {
                Toast.makeText(MainActivity.this,"删除红点",Toast.LENGTH_SHORT).show();
            }
        });

        mDismssBtn = findViewById(R.id.close_btn);
        mDismssBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIndiactorView.dismissView();
                mOtherView.dismissView();
            }
        });

        mSecondBtn = findViewById(R.id.second_btn);
        mSecondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}//end class
