// Generated by view binder compiler. Do not edit!
package com.ezper.native160421030.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ezper.native160421030.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentGameBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button btnSubmit;

  @NonNull
  public final EditText txtAnswer;

  @NonNull
  public final TextView txtRand;

  @NonNull
  public final TextView txtTurn;

  private FragmentGameBinding(@NonNull FrameLayout rootView, @NonNull Button btnSubmit,
      @NonNull EditText txtAnswer, @NonNull TextView txtRand, @NonNull TextView txtTurn) {
    this.rootView = rootView;
    this.btnSubmit = btnSubmit;
    this.txtAnswer = txtAnswer;
    this.txtRand = txtRand;
    this.txtTurn = txtTurn;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentGameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_game, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentGameBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSubmit;
      Button btnSubmit = ViewBindings.findChildViewById(rootView, id);
      if (btnSubmit == null) {
        break missingId;
      }

      id = R.id.txtAnswer;
      EditText txtAnswer = ViewBindings.findChildViewById(rootView, id);
      if (txtAnswer == null) {
        break missingId;
      }

      id = R.id.txtRand;
      TextView txtRand = ViewBindings.findChildViewById(rootView, id);
      if (txtRand == null) {
        break missingId;
      }

      id = R.id.txtTurn;
      TextView txtTurn = ViewBindings.findChildViewById(rootView, id);
      if (txtTurn == null) {
        break missingId;
      }

      return new FragmentGameBinding((FrameLayout) rootView, btnSubmit, txtAnswer, txtRand,
          txtTurn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
