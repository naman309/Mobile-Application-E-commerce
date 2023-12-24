// Generated by view binder compiler. Do not edit!
package com.example.nolo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.nolo.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemDetailsColourBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final RelativeLayout colourBtn;

  @NonNull
  public final MaterialButton colourCircle;

  @NonNull
  public final MaterialButton colourOutline;

  private ItemDetailsColourBinding(@NonNull FrameLayout rootView, @NonNull RelativeLayout colourBtn,
      @NonNull MaterialButton colourCircle, @NonNull MaterialButton colourOutline) {
    this.rootView = rootView;
    this.colourBtn = colourBtn;
    this.colourCircle = colourCircle;
    this.colourOutline = colourOutline;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemDetailsColourBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemDetailsColourBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_details_colour, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemDetailsColourBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.colour_btn;
      RelativeLayout colourBtn = ViewBindings.findChildViewById(rootView, id);
      if (colourBtn == null) {
        break missingId;
      }

      id = R.id.colour_circle;
      MaterialButton colourCircle = ViewBindings.findChildViewById(rootView, id);
      if (colourCircle == null) {
        break missingId;
      }

      id = R.id.colour_outline;
      MaterialButton colourOutline = ViewBindings.findChildViewById(rootView, id);
      if (colourOutline == null) {
        break missingId;
      }

      return new ItemDetailsColourBinding((FrameLayout) rootView, colourBtn, colourCircle,
          colourOutline);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
