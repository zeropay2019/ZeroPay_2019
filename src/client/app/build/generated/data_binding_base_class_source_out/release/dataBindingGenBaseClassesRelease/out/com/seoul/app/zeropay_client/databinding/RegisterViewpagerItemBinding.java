package com.seoul.app.zeropay_client.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.seoul.app.zeropay_client.network.response.UserCardResponse;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RegisterViewpagerItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView cardBrandImageView;

  @NonNull
  public final ConstraintLayout cardFormLayout;

  @NonNull
  public final CardView cardMain;

  @NonNull
  public final TextView cardPayType;

  @NonNull
  public final TextView cardPaymentMethodNumTextView;

  @Bindable
  protected UserCardResponse mCardModel;

  protected RegisterViewpagerItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView cardBrandImageView, ConstraintLayout cardFormLayout, CardView cardMain,
      TextView cardPayType, TextView cardPaymentMethodNumTextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardBrandImageView = cardBrandImageView;
    this.cardFormLayout = cardFormLayout;
    this.cardMain = cardMain;
    this.cardPayType = cardPayType;
    this.cardPaymentMethodNumTextView = cardPaymentMethodNumTextView;
  }

  public abstract void setCardModel(@Nullable UserCardResponse cardModel);

  @Nullable
  public UserCardResponse getCardModel() {
    return mCardModel;
  }

  @NonNull
  public static RegisterViewpagerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.register_viewpager_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RegisterViewpagerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RegisterViewpagerItemBinding>inflateInternal(inflater, com.seoul.app.zeropay_client.R.layout.register_viewpager_item, root, attachToRoot, component);
  }

  @NonNull
  public static RegisterViewpagerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.register_viewpager_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RegisterViewpagerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RegisterViewpagerItemBinding>inflateInternal(inflater, com.seoul.app.zeropay_client.R.layout.register_viewpager_item, null, false, component);
  }

  public static RegisterViewpagerItemBinding bind(@NonNull View view) {
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
  public static RegisterViewpagerItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (RegisterViewpagerItemBinding)bind(component, view, com.seoul.app.zeropay_client.R.layout.register_viewpager_item);
  }
}
