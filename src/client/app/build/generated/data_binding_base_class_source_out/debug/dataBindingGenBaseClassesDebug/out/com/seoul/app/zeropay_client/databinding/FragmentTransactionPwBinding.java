package com.seoul.app.zeropay_client.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.seoul.app.zeropay_client.model.UserViewModel;
import com.seoul.app.zeropay_client.ui.TransactionPWFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentTransactionPwBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout parentImageView;

  @NonNull
  public final MaterialButton resetTransactionBtn;

  @NonNull
  public final MaterialButton transactionDeleteBtn;

  @NonNull
  public final ImageView transactionImageView1;

  @NonNull
  public final ImageView transactionImageView2;

  @NonNull
  public final ImageView transactionImageView3;

  @NonNull
  public final ImageView transactionImageView4;

  @NonNull
  public final MaterialButton transactionNumP0;

  @NonNull
  public final MaterialButton transactionNumP1;

  @NonNull
  public final MaterialButton transactionNumP2;

  @NonNull
  public final MaterialButton transactionNumP3;

  @NonNull
  public final MaterialButton transactionNumP4;

  @NonNull
  public final MaterialButton transactionNumP5;

  @NonNull
  public final MaterialButton transactionNumP6;

  @NonNull
  public final MaterialButton transactionNumP7;

  @NonNull
  public final MaterialButton transactionNumP8;

  @NonNull
  public final MaterialButton transactionNumP9;

  @NonNull
  public final TextView transactionPwState;

  @NonNull
  public final TextView transactionTitle;

  @Bindable
  protected UserViewModel mTranViewModel;

  @Bindable
  protected TransactionPWFragment mFragment;

  protected FragmentTransactionPwBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout parentImageView, MaterialButton resetTransactionBtn,
      MaterialButton transactionDeleteBtn, ImageView transactionImageView1,
      ImageView transactionImageView2, ImageView transactionImageView3,
      ImageView transactionImageView4, MaterialButton transactionNumP0,
      MaterialButton transactionNumP1, MaterialButton transactionNumP2,
      MaterialButton transactionNumP3, MaterialButton transactionNumP4,
      MaterialButton transactionNumP5, MaterialButton transactionNumP6,
      MaterialButton transactionNumP7, MaterialButton transactionNumP8,
      MaterialButton transactionNumP9, TextView transactionPwState, TextView transactionTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.parentImageView = parentImageView;
    this.resetTransactionBtn = resetTransactionBtn;
    this.transactionDeleteBtn = transactionDeleteBtn;
    this.transactionImageView1 = transactionImageView1;
    this.transactionImageView2 = transactionImageView2;
    this.transactionImageView3 = transactionImageView3;
    this.transactionImageView4 = transactionImageView4;
    this.transactionNumP0 = transactionNumP0;
    this.transactionNumP1 = transactionNumP1;
    this.transactionNumP2 = transactionNumP2;
    this.transactionNumP3 = transactionNumP3;
    this.transactionNumP4 = transactionNumP4;
    this.transactionNumP5 = transactionNumP5;
    this.transactionNumP6 = transactionNumP6;
    this.transactionNumP7 = transactionNumP7;
    this.transactionNumP8 = transactionNumP8;
    this.transactionNumP9 = transactionNumP9;
    this.transactionPwState = transactionPwState;
    this.transactionTitle = transactionTitle;
  }

  public abstract void setTranViewModel(@Nullable UserViewModel tranViewModel);

  @Nullable
  public UserViewModel getTranViewModel() {
    return mTranViewModel;
  }

  public abstract void setFragment(@Nullable TransactionPWFragment fragment);

  @Nullable
  public TransactionPWFragment getFragment() {
    return mFragment;
  }

  @NonNull
  public static FragmentTransactionPwBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_transaction_pw, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTransactionPwBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentTransactionPwBinding>inflateInternal(inflater, com.seoul.app.zeropay_client.R.layout.fragment_transaction_pw, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTransactionPwBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_transaction_pw, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTransactionPwBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentTransactionPwBinding>inflateInternal(inflater, com.seoul.app.zeropay_client.R.layout.fragment_transaction_pw, null, false, component);
  }

  public static FragmentTransactionPwBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentTransactionPwBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentTransactionPwBinding)bind(component, view, com.seoul.app.zeropay_client.R.layout.fragment_transaction_pw);
  }
}
