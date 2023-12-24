// Generated by view binder compiler. Do not edit!
package com.example.nolo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.nolo.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMapBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView address;

  @NonNull
  public final ImageButton backBtn;

  @NonNull
  public final MaterialButton branchBtn;

  @NonNull
  public final RecyclerView coloursList;

  @NonNull
  public final FrameLayout mapContainer;

  @NonNull
  public final TextView modalHeader;

  @NonNull
  public final TextView price;

  @NonNull
  public final TextView title;

  private ActivityMapBinding(@NonNull LinearLayout rootView, @NonNull TextView address,
      @NonNull ImageButton backBtn, @NonNull MaterialButton branchBtn,
      @NonNull RecyclerView coloursList, @NonNull FrameLayout mapContainer,
      @NonNull TextView modalHeader, @NonNull TextView price, @NonNull TextView title) {
    this.rootView = rootView;
    this.address = address;
    this.backBtn = backBtn;
    this.branchBtn = branchBtn;
    this.coloursList = coloursList;
    this.mapContainer = mapContainer;
    this.modalHeader = modalHeader;
    this.price = price;
    this.title = title;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMapBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_map, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMapBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address;
      TextView address = ViewBindings.findChildViewById(rootView, id);
      if (address == null) {
        break missingId;
      }

      id = R.id.back_btn;
      ImageButton backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.branch_btn;
      MaterialButton branchBtn = ViewBindings.findChildViewById(rootView, id);
      if (branchBtn == null) {
        break missingId;
      }

      id = R.id.colours_list;
      RecyclerView coloursList = ViewBindings.findChildViewById(rootView, id);
      if (coloursList == null) {
        break missingId;
      }

      id = R.id.map_container;
      FrameLayout mapContainer = ViewBindings.findChildViewById(rootView, id);
      if (mapContainer == null) {
        break missingId;
      }

      id = R.id.modal_header;
      TextView modalHeader = ViewBindings.findChildViewById(rootView, id);
      if (modalHeader == null) {
        break missingId;
      }

      id = R.id.price;
      TextView price = ViewBindings.findChildViewById(rootView, id);
      if (price == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new ActivityMapBinding((LinearLayout) rootView, address, backBtn, branchBtn,
          coloursList, mapContainer, modalHeader, price, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
