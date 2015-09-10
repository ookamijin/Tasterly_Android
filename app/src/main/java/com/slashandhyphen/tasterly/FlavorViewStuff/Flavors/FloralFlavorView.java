package com.slashandhyphen.tasterly.FlavorViewStuff.Flavors;

import android.content.Context;

import com.slashandhyphen.tasterly.FlavorViewStuff.FlavorView;
import com.slashandhyphen.tasterly.R;

/**
 * Created by ookamijin on 8/27/2015.
 *
 * Extension of FlavorView for adding flavor-specific assets and possibly behavior/functionality
 */
public class FloralFlavorView  extends FlavorView {
    public FloralFlavorView(Context context) {
        super(context);
        icon.setBackgroundResource(R.drawable.flavor_icon_floral);
        label.setText("Floral");
    }
}