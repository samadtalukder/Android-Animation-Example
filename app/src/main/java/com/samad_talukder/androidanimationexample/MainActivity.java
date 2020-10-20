package com.samad_talukder.androidanimationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_show_animation;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_show_animation = findViewById(R.id.tv_show_animation);

        Button btn_slowly_fades = findViewById(R.id.btn_slowly_fades);
        Button btn_fade_out = findViewById(R.id.btn_fade_out);
        Button btn_push_down_in = findViewById(R.id.btn_push_down_in);
        Button btn_push_down_out = findViewById(R.id.btn_push_down_out);
        Button btn_push_left_in = findViewById(R.id.btn_push_left_in);
        Button btn_push_left_out = findViewById(R.id.btn_push_left_out);
        Button btn_push_right_in = findViewById(R.id.btn_push_right_in);
        Button btn_push_right_out = findViewById(R.id.btn_push_right_out);
        Button btn_push_up_in = findViewById(R.id.btn_push_up_in);
        Button btn_push_up_out = findViewById(R.id.btn_push_up_out);
        Button btn_rotation = findViewById(R.id.btn_rotation);
        Button btn_scale_from_corner = findViewById(R.id.btn_scale_from_corner);
        Button btn_scale_towards_corner = findViewById(R.id.btn_scale_towards_corner);
        Button btn_shrink_and_rotate_entrance = findViewById(R.id.btn_shrink_and_rotate_entrance);
        Button btn_shrink_and_rotate_exit = findViewById(R.id.btn_shrink_and_rotate_exit);
        Button btn_blink = findViewById(R.id.btn_blink);
        Button btn_zoom_in = findViewById(R.id.btn_zoom_in);
        Button btn_zoom_out = findViewById(R.id.btn_zoom_out);
        Button btn_fade_in = findViewById(R.id.btn_fade_in);
        Button btn_move = findViewById(R.id.btn_move);
        Button btn_slide_up = findViewById(R.id.btn_slide_up);
        Button btn_slide_down = findViewById(R.id.btn_slide_down);
        Button btn_bounce = findViewById(R.id.btn_bounce);


        btn_slowly_fades.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_slowly_fade_in);
            tv_show_animation.startAnimation(animation);
        });

        btn_fade_out.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_slowly_fade_out);
            tv_show_animation.startAnimation(animation);
        });

        btn_push_down_in.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_push_down_in);
            tv_show_animation.startAnimation(animation);
        });

        btn_push_down_out.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_push_down_out);
            tv_show_animation.startAnimation(animation);
        });

        btn_push_left_in.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_push_left_in);
            tv_show_animation.startAnimation(animation);
        });

        btn_push_left_out.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_push_left_out);
            tv_show_animation.startAnimation(animation);
        });


        btn_push_right_in.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_push_right_in);
            tv_show_animation.startAnimation(animation);
        });

        btn_push_right_out.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_push_right_out);
            tv_show_animation.startAnimation(animation);
        });

        btn_push_up_in.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_push_up_in);
            tv_show_animation.startAnimation(animation);
        });

        btn_push_up_out.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_push_up_out);
            tv_show_animation.startAnimation(animation);
        });

        btn_rotation.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_rotation);
            tv_show_animation.startAnimation(animation);
        });

        btn_scale_from_corner.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_scale_from_corner);
            tv_show_animation.startAnimation(animation);
        });

        btn_scale_towards_corner.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_scale_torwards_corner);
            tv_show_animation.startAnimation(animation);
        });

        btn_shrink_and_rotate_exit.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_shrink_and_rotate_exit);
            tv_show_animation.startAnimation(animation);
        });

        btn_shrink_and_rotate_entrance.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_shrink_and_rotate_entrance);
            tv_show_animation.startAnimation(animation);
        });

        btn_blink.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_blink);
            tv_show_animation.startAnimation(animation);
        });

        btn_zoom_in.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_zoom_in);
            tv_show_animation.startAnimation(animation);
        });

        btn_zoom_out.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_zoom_out);
            tv_show_animation.startAnimation(animation);
        });

        btn_fade_in.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_fade_in);
            tv_show_animation.startAnimation(animation);
        });

        btn_move.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_move);
            tv_show_animation.startAnimation(animation);
        });

        btn_slide_up.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_slide_up);
            tv_show_animation.startAnimation(animation);
        });

        btn_slide_down.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_slide_down);
            tv_show_animation.startAnimation(animation);
        });

        btn_bounce.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_bounce);
            tv_show_animation.startAnimation(animation);
        });
    }
}