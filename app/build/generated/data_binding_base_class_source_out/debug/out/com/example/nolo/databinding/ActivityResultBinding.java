// Generated by view binder compiler. Do not edit!
package com.example.nolo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.nolo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityResultBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final RelativeLayout backBtn;

  @NonNull
  public final ImageButton backBtnImg;

  @NonNull
  public final ScrollView homeScrollView;

  @NonNull
  public final TextView numberResultsFound;

  @NonNull
  public final LinearLayout outsideSearchContainer;

  @NonNull
  public final ListView searchResultsList;

  @NonNull
  public final ItemSearchBarBinding searchView;

  private ActivityResultBinding(@NonNull ScrollView rootView, @NonNull RelativeLayout backBtn,
      @NonNull ImageButton backBtnImg, @NonNull ScrollView homeScrollView,
      @NonNull TextView numberResultsFound, @NonNull LinearLayout outsideSearchContainer,
      @NonNull ListView searchResultsList, @NonNull ItemSearchBarBinding searchView) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.backBtnImg = backBtnImg;
    this.homeScrollView = homeScrollView;
    this.numberResultsFound = numberResultsFound;
    this.outsideSearchContainer = outsideSearchContainer;
    this.searchResultsList = searchResultsList;
    this.searchView = searchView;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_result, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityResultBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_btn;
      RelativeLayout backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.back_btn_img;
      ImageButton backBtnImg = ViewBindings.findChildViewById(rootView, id);
      if (backBtnImg == null) {
        break missingId;
      }

      ScrollView homeScrollView = (ScrollView) rootView;

      id = R.id.number_results_found;
      TextView numberResultsFound = ViewBindings.findChildViewById(rootView, id);
      if (numberResultsFound == null) {
        break missingId;
      }

      id = R.id.outside_search_container;
      LinearLayout outsideSearchContainer = ViewBindings.findChildViewById(rootView, id);
      if (outsideSearchContainer == null) {
        break missingId;
      }

      id = R.id.search_results_list;
      ListView searchResultsList = ViewBindings.findChildViewById(rootView, id);
      if (searchResultsList == null) {
        break missingId;
      }

      id = R.id.search_view;
      View searchView = ViewBindings.findChildViewById(rootView, id);
      if (searchView == null) {
        break missingId;
      }
      ItemSearchBarBinding binding_searchView = ItemSearchBarBinding.bind(searchView);

      return new ActivityResultBinding((ScrollView) rootView, backBtn, backBtnImg, homeScrollView,
          numberResultsFound, outsideSearchContainer, searchResultsList, binding_searchView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
