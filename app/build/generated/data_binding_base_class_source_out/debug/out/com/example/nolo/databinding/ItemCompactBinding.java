// Generated by view binder compiler. Do not edit!
package com.example.nolo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.nolo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemCompactBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout itemClickable;

  @NonNull
  public final ImageView itemImg;

  @NonNull
  public final TextView itemPrice;

  @NonNull
  public final TextView itemTitle;

  private ItemCompactBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout itemClickable,
      @NonNull ImageView itemImg, @NonNull TextView itemPrice, @NonNull TextView itemTitle) {
    this.rootView = rootView;
    this.itemClickable = itemClickable;
    this.itemImg = itemImg;
    this.itemPrice = itemPrice;
    this.itemTitle = itemTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCompactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCompactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_compact, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCompactBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout itemClickable = (LinearLayout) rootView;

      id = R.id.item_img;
      ImageView itemImg = ViewBindings.findChildViewById(rootView, id);
      if (itemImg == null) {
        break missingId;
      }

      id = R.id.item_price;
      TextView itemPrice = ViewBindings.findChildViewById(rootView, id);
      if (itemPrice == null) {
        break missingId;
      }

      id = R.id.item_title;
      TextView itemTitle = ViewBindings.findChildViewById(rootView, id);
      if (itemTitle == null) {
        break missingId;
      }

      return new ItemCompactBinding((LinearLayout) rootView, itemClickable, itemImg, itemPrice,
          itemTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
