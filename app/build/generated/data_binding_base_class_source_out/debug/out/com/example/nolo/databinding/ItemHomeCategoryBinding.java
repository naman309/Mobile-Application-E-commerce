// Generated by view binder compiler. Do not edit!
package com.example.nolo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.nolo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemHomeCategoryBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageButton categoryBtn;

  @NonNull
  public final ImageView categoryImg;

  @NonNull
  public final TextView categoryLabel;

  private ItemHomeCategoryBinding(@NonNull FrameLayout rootView, @NonNull ImageButton categoryBtn,
      @NonNull ImageView categoryImg, @NonNull TextView categoryLabel) {
    this.rootView = rootView;
    this.categoryBtn = categoryBtn;
    this.categoryImg = categoryImg;
    this.categoryLabel = categoryLabel;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemHomeCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemHomeCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_home_category, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemHomeCategoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.category_btn;
      ImageButton categoryBtn = ViewBindings.findChildViewById(rootView, id);
      if (categoryBtn == null) {
        break missingId;
      }

      id = R.id.category_img;
      ImageView categoryImg = ViewBindings.findChildViewById(rootView, id);
      if (categoryImg == null) {
        break missingId;
      }

      id = R.id.category_label;
      TextView categoryLabel = ViewBindings.findChildViewById(rootView, id);
      if (categoryLabel == null) {
        break missingId;
      }

      return new ItemHomeCategoryBinding((FrameLayout) rootView, categoryBtn, categoryImg,
          categoryLabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}