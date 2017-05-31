package com.pedaily.yc.mescrollview.second;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by PC on 2017/5/31.
 */
public class SecGlideImageLoader extends ImageLoader {

    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        if(path!=null && path!=""){
            Glide.with(context)
                    .load((Integer) path)
                    .into(imageView);
        }
    }

}
