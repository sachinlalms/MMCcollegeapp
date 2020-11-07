package com.example.marymathauser.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.marymathauser.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;


public class HomeFragment extends Fragment {

    private SliderLayout sliderLayout;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
  View view= inflater.inflate(R.layout.fragment_home, container, false);
        sliderLayout = view.findViewById(R.id.slider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(3);

        setSliderView();


  return view;


    }


    private void setSliderView() {
        for(int i=0;i<4;i++){
            DefaultSliderView sliderView  = new DefaultSliderView(getContext());
            switch (i){
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/mary-matha-college.appspot.com/o/gallery%2F%5BB%40810203f.jpg?alt=media&token=160e3d33-433d-4735-b21d-b4fd2c562691");
                    break;
                case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/mary-matha-college.appspot.com/o/gallery%2F%5BB%40d49919a.jpg?alt=media&token=0e717520-c657-4f36-baa3-a3a297cb5073");
                    break;
                case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/mary-matha-college.appspot.com/o/gallery%2F%5BB%40322764f.jpg?alt=media&token=dded2183-5cb2-4c44-8540-85925639a794");
                    break;
                    case 3:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/mary-matha-college.appspot.com/o/gallery%2F%5BB%40494d9c7.jpg?alt=media&token=3eccc400-0d15-45ce-9b33-971204c5a52e");
                    break;

            }
            sliderView.setImageScaleType(ImageView.ScaleType.FIT_XY);
            sliderLayout.addSliderView(sliderView);
        }

    }
}