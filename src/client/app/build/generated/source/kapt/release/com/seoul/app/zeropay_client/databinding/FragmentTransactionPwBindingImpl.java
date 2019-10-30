package com.seoul.app.zeropay_client.databinding;
import com.seoul.app.zeropay_client.R;
import com.seoul.app.zeropay_client.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTransactionPwBindingImpl extends FragmentTransactionPwBinding implements com.seoul.app.zeropay_client.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.transaction_title, 13);
        sViewsWithIds.put(R.id.parent_imageView, 14);
        sViewsWithIds.put(R.id.transaction_imageView1, 15);
        sViewsWithIds.put(R.id.transaction_imageView2, 16);
        sViewsWithIds.put(R.id.transaction_imageView3, 17);
        sViewsWithIds.put(R.id.transaction_imageView4, 18);
        sViewsWithIds.put(R.id.transaction_pw_state, 19);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTransactionPwBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentTransactionPwBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[14]
            , (com.google.android.material.button.MaterialButton) bindings[10]
            , (com.google.android.material.button.MaterialButton) bindings[12]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[18]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (com.google.android.material.button.MaterialButton) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[2]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (com.google.android.material.button.MaterialButton) bindings[9]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[13]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.resetTransactionBtn.setTag(null);
        this.transactionDeleteBtn.setTag(null);
        this.transactionNumP0.setTag(null);
        this.transactionNumP1.setTag(null);
        this.transactionNumP2.setTag(null);
        this.transactionNumP3.setTag(null);
        this.transactionNumP4.setTag(null);
        this.transactionNumP5.setTag(null);
        this.transactionNumP6.setTag(null);
        this.transactionNumP7.setTag(null);
        this.transactionNumP8.setTag(null);
        this.transactionNumP9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.seoul.app.zeropay_client.generated.callback.OnClickListener(this, 11);
        mCallback6 = new com.seoul.app.zeropay_client.generated.callback.OnClickListener(this, 6);
        mCallback2 = new com.seoul.app.zeropay_client.generated.callback.OnClickListener(this, 2);
        mCallback12 = new com.seoul.app.zeropay_client.generated.callback.OnClickListener(this, 12);
        mCallback9 = new com.seoul.app.zeropay_client.generated.callback.OnClickListener(this, 9);
        mCallback5 = new com.seoul.app.zeropay_client.generated.callback.OnClickListener(this, 5);
        mCallback1 = new com.seoul.app.zeropay_client.generated.callback.OnClickListener(this, 1);
        mCallback8 = new com.seoul.app.zeropay_client.generated.callback.OnClickListener(this, 8);
        mCallback4 = new com.seoul.app.zeropay_client.generated.callback.OnClickListener(this, 4);
        mCallback10 = new com.seoul.app.zeropay_client.generated.callback.OnClickListener(this, 10);
        mCallback7 = new com.seoul.app.zeropay_client.generated.callback.OnClickListener(this, 7);
        mCallback3 = new com.seoul.app.zeropay_client.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragment == variableId) {
            setFragment((com.seoul.app.zeropay_client.ui.TransactionPWFragment) variable);
        }
        else if (BR.tranViewModel == variableId) {
            setTranViewModel((com.seoul.app.zeropay_client.model.UserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.seoul.app.zeropay_client.ui.TransactionPWFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setTranViewModel(@Nullable com.seoul.app.zeropay_client.model.UserViewModel TranViewModel) {
        this.mTranViewModel = TranViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.tranViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTranViewModelTransactionNumList((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTranViewModelTransactionNumList(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> TranViewModelTransactionNumList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String tranViewModelTransactionNumListGetInt1 = null;
        com.seoul.app.zeropay_client.ui.TransactionPWFragment fragment = mFragment;
        java.lang.String tranViewModelTransactionNumListGetInt0 = null;
        java.lang.String tranViewModelTransactionNumListGetInt3 = null;
        java.lang.String tranViewModelTransactionNumListGetInt9 = null;
        java.lang.String tranViewModelTransactionNumListGetInt2 = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> tranViewModelTransactionNumList = null;
        java.lang.String tranViewModelTransactionNumListGetInt5 = null;
        java.lang.String tranViewModelTransactionNumListGetInt4 = null;
        java.lang.String tranViewModelTransactionNumListGetInt8 = null;
        java.util.ArrayList<java.lang.String> tranViewModelTransactionNumListGetValue = null;
        java.lang.String tranViewModelTransactionNumListGetInt7 = null;
        com.seoul.app.zeropay_client.model.UserViewModel tranViewModel = mTranViewModel;
        java.lang.String tranViewModelTransactionNumListGetInt6 = null;

        if ((dirtyFlags & 0xdL) != 0) {



                if (tranViewModel != null) {
                    // read tranViewModel.transactionNumList
                    tranViewModelTransactionNumList = tranViewModel.getTransactionNumList();
                }
                updateLiveDataRegistration(0, tranViewModelTransactionNumList);


                if (tranViewModelTransactionNumList != null) {
                    // read tranViewModel.transactionNumList.getValue()
                    tranViewModelTransactionNumListGetValue = tranViewModelTransactionNumList.getValue();
                }


                if (tranViewModelTransactionNumListGetValue != null) {
                    // read tranViewModel.transactionNumList.getValue().get(1)
                    tranViewModelTransactionNumListGetInt1 = tranViewModelTransactionNumListGetValue.get(1);
                    // read tranViewModel.transactionNumList.getValue().get(0)
                    tranViewModelTransactionNumListGetInt0 = tranViewModelTransactionNumListGetValue.get(0);
                    // read tranViewModel.transactionNumList.getValue().get(3)
                    tranViewModelTransactionNumListGetInt3 = tranViewModelTransactionNumListGetValue.get(3);
                    // read tranViewModel.transactionNumList.getValue().get(9)
                    tranViewModelTransactionNumListGetInt9 = tranViewModelTransactionNumListGetValue.get(9);
                    // read tranViewModel.transactionNumList.getValue().get(2)
                    tranViewModelTransactionNumListGetInt2 = tranViewModelTransactionNumListGetValue.get(2);
                    // read tranViewModel.transactionNumList.getValue().get(5)
                    tranViewModelTransactionNumListGetInt5 = tranViewModelTransactionNumListGetValue.get(5);
                    // read tranViewModel.transactionNumList.getValue().get(4)
                    tranViewModelTransactionNumListGetInt4 = tranViewModelTransactionNumListGetValue.get(4);
                    // read tranViewModel.transactionNumList.getValue().get(8)
                    tranViewModelTransactionNumListGetInt8 = tranViewModelTransactionNumListGetValue.get(8);
                    // read tranViewModel.transactionNumList.getValue().get(7)
                    tranViewModelTransactionNumListGetInt7 = tranViewModelTransactionNumListGetValue.get(7);
                    // read tranViewModel.transactionNumList.getValue().get(6)
                    tranViewModelTransactionNumListGetInt6 = tranViewModelTransactionNumListGetValue.get(6);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.resetTransactionBtn.setOnClickListener(mCallback10);
            this.transactionDeleteBtn.setOnClickListener(mCallback12);
            this.transactionNumP0.setOnClickListener(mCallback11);
            this.transactionNumP1.setOnClickListener(mCallback1);
            this.transactionNumP2.setOnClickListener(mCallback2);
            this.transactionNumP3.setOnClickListener(mCallback3);
            this.transactionNumP4.setOnClickListener(mCallback4);
            this.transactionNumP5.setOnClickListener(mCallback5);
            this.transactionNumP6.setOnClickListener(mCallback6);
            this.transactionNumP7.setOnClickListener(mCallback7);
            this.transactionNumP8.setOnClickListener(mCallback8);
            this.transactionNumP9.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.transactionNumP0, tranViewModelTransactionNumListGetInt9);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.transactionNumP1, tranViewModelTransactionNumListGetInt0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.transactionNumP2, tranViewModelTransactionNumListGetInt1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.transactionNumP3, tranViewModelTransactionNumListGetInt2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.transactionNumP4, tranViewModelTransactionNumListGetInt3);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.transactionNumP5, tranViewModelTransactionNumListGetInt4);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.transactionNumP6, tranViewModelTransactionNumListGetInt5);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.transactionNumP7, tranViewModelTransactionNumListGetInt6);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.transactionNumP8, tranViewModelTransactionNumListGetInt7);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.transactionNumP9, tranViewModelTransactionNumListGetInt8);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 11: {
                // localize variables for thread safety
                // tranViewModel.transactionNumList.getValue() != null
                boolean tranViewModelTransactionNumListGetValueJavaLangObjectNull = false;
                // fragment
                com.seoul.app.zeropay_client.ui.TransactionPWFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;
                // tranViewModel != null
                boolean tranViewModelJavaLangObjectNull = false;
                // tranViewModel.transactionNumList.getValue().get(9)
                java.lang.String tranViewModelTransactionNumListGetInt9 = null;
                // tranViewModel.transactionNumList.getValue()
                java.util.ArrayList<java.lang.String> tranViewModelTransactionNumListGetValue = null;
                // tranViewModel.transactionNumList
                androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> tranViewModelTransactionNumList = null;
                // tranViewModel.transactionNumList != null
                boolean tranViewModelTransactionNumListJavaLangObjectNull = false;
                // tranViewModel
                com.seoul.app.zeropay_client.model.UserViewModel tranViewModel = mTranViewModel;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    tranViewModelJavaLangObjectNull = (tranViewModel) != (null);
                    if (tranViewModelJavaLangObjectNull) {


                        tranViewModelTransactionNumList = tranViewModel.getTransactionNumList();

                        tranViewModelTransactionNumListJavaLangObjectNull = (tranViewModelTransactionNumList) != (null);
                        if (tranViewModelTransactionNumListJavaLangObjectNull) {


                            tranViewModelTransactionNumListGetValue = tranViewModelTransactionNumList.getValue();

                            tranViewModelTransactionNumListGetValueJavaLangObjectNull = (tranViewModelTransactionNumListGetValue) != (null);
                            if (tranViewModelTransactionNumListGetValueJavaLangObjectNull) {



                                tranViewModelTransactionNumListGetInt9 = tranViewModelTransactionNumListGetValue.get(9);

                                fragment.pressTransactionPW(true, tranViewModelTransactionNumListGetInt9);
                            }
                        }
                    }
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // tranViewModel.transactionNumList.getValue() != null
                boolean tranViewModelTransactionNumListGetValueJavaLangObjectNull = false;
                // fragment
                com.seoul.app.zeropay_client.ui.TransactionPWFragment fragment = mFragment;
                // tranViewModel.transactionNumList.getValue().get(5)
                java.lang.String tranViewModelTransactionNumListGetInt5 = null;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;
                // tranViewModel != null
                boolean tranViewModelJavaLangObjectNull = false;
                // tranViewModel.transactionNumList.getValue()
                java.util.ArrayList<java.lang.String> tranViewModelTransactionNumListGetValue = null;
                // tranViewModel.transactionNumList
                androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> tranViewModelTransactionNumList = null;
                // tranViewModel.transactionNumList != null
                boolean tranViewModelTransactionNumListJavaLangObjectNull = false;
                // tranViewModel
                com.seoul.app.zeropay_client.model.UserViewModel tranViewModel = mTranViewModel;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    tranViewModelJavaLangObjectNull = (tranViewModel) != (null);
                    if (tranViewModelJavaLangObjectNull) {


                        tranViewModelTransactionNumList = tranViewModel.getTransactionNumList();

                        tranViewModelTransactionNumListJavaLangObjectNull = (tranViewModelTransactionNumList) != (null);
                        if (tranViewModelTransactionNumListJavaLangObjectNull) {


                            tranViewModelTransactionNumListGetValue = tranViewModelTransactionNumList.getValue();

                            tranViewModelTransactionNumListGetValueJavaLangObjectNull = (tranViewModelTransactionNumListGetValue) != (null);
                            if (tranViewModelTransactionNumListGetValueJavaLangObjectNull) {



                                tranViewModelTransactionNumListGetInt5 = tranViewModelTransactionNumListGetValue.get(5);

                                fragment.pressTransactionPW(true, tranViewModelTransactionNumListGetInt5);
                            }
                        }
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // tranViewModel.transactionNumList.getValue() != null
                boolean tranViewModelTransactionNumListGetValueJavaLangObjectNull = false;
                // tranViewModel.transactionNumList.getValue().get(1)
                java.lang.String tranViewModelTransactionNumListGetInt1 = null;
                // fragment
                com.seoul.app.zeropay_client.ui.TransactionPWFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;
                // tranViewModel != null
                boolean tranViewModelJavaLangObjectNull = false;
                // tranViewModel.transactionNumList.getValue()
                java.util.ArrayList<java.lang.String> tranViewModelTransactionNumListGetValue = null;
                // tranViewModel.transactionNumList
                androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> tranViewModelTransactionNumList = null;
                // tranViewModel.transactionNumList != null
                boolean tranViewModelTransactionNumListJavaLangObjectNull = false;
                // tranViewModel
                com.seoul.app.zeropay_client.model.UserViewModel tranViewModel = mTranViewModel;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    tranViewModelJavaLangObjectNull = (tranViewModel) != (null);
                    if (tranViewModelJavaLangObjectNull) {


                        tranViewModelTransactionNumList = tranViewModel.getTransactionNumList();

                        tranViewModelTransactionNumListJavaLangObjectNull = (tranViewModelTransactionNumList) != (null);
                        if (tranViewModelTransactionNumListJavaLangObjectNull) {


                            tranViewModelTransactionNumListGetValue = tranViewModelTransactionNumList.getValue();

                            tranViewModelTransactionNumListGetValueJavaLangObjectNull = (tranViewModelTransactionNumListGetValue) != (null);
                            if (tranViewModelTransactionNumListGetValueJavaLangObjectNull) {



                                tranViewModelTransactionNumListGetInt1 = tranViewModelTransactionNumListGetValue.get(1);

                                fragment.pressTransactionPW(true, tranViewModelTransactionNumListGetInt1);
                            }
                        }
                    }
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // fragment
                com.seoul.app.zeropay_client.ui.TransactionPWFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {



                    fragment.deletePressed(false);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // tranViewModel.transactionNumList.getValue() != null
                boolean tranViewModelTransactionNumListGetValueJavaLangObjectNull = false;
                // fragment
                com.seoul.app.zeropay_client.ui.TransactionPWFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;
                // tranViewModel != null
                boolean tranViewModelJavaLangObjectNull = false;
                // tranViewModel.transactionNumList.getValue()
                java.util.ArrayList<java.lang.String> tranViewModelTransactionNumListGetValue = null;
                // tranViewModel.transactionNumList
                androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> tranViewModelTransactionNumList = null;
                // tranViewModel.transactionNumList != null
                boolean tranViewModelTransactionNumListJavaLangObjectNull = false;
                // tranViewModel
                com.seoul.app.zeropay_client.model.UserViewModel tranViewModel = mTranViewModel;
                // tranViewModel.transactionNumList.getValue().get(8)
                java.lang.String tranViewModelTransactionNumListGetInt8 = null;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    tranViewModelJavaLangObjectNull = (tranViewModel) != (null);
                    if (tranViewModelJavaLangObjectNull) {


                        tranViewModelTransactionNumList = tranViewModel.getTransactionNumList();

                        tranViewModelTransactionNumListJavaLangObjectNull = (tranViewModelTransactionNumList) != (null);
                        if (tranViewModelTransactionNumListJavaLangObjectNull) {


                            tranViewModelTransactionNumListGetValue = tranViewModelTransactionNumList.getValue();

                            tranViewModelTransactionNumListGetValueJavaLangObjectNull = (tranViewModelTransactionNumListGetValue) != (null);
                            if (tranViewModelTransactionNumListGetValueJavaLangObjectNull) {



                                tranViewModelTransactionNumListGetInt8 = tranViewModelTransactionNumListGetValue.get(8);

                                fragment.pressTransactionPW(true, tranViewModelTransactionNumListGetInt8);
                            }
                        }
                    }
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // tranViewModel.transactionNumList.getValue() != null
                boolean tranViewModelTransactionNumListGetValueJavaLangObjectNull = false;
                // fragment
                com.seoul.app.zeropay_client.ui.TransactionPWFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;
                // tranViewModel != null
                boolean tranViewModelJavaLangObjectNull = false;
                // tranViewModel.transactionNumList.getValue()
                java.util.ArrayList<java.lang.String> tranViewModelTransactionNumListGetValue = null;
                // tranViewModel.transactionNumList
                androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> tranViewModelTransactionNumList = null;
                // tranViewModel.transactionNumList != null
                boolean tranViewModelTransactionNumListJavaLangObjectNull = false;
                // tranViewModel.transactionNumList.getValue().get(4)
                java.lang.String tranViewModelTransactionNumListGetInt4 = null;
                // tranViewModel
                com.seoul.app.zeropay_client.model.UserViewModel tranViewModel = mTranViewModel;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    tranViewModelJavaLangObjectNull = (tranViewModel) != (null);
                    if (tranViewModelJavaLangObjectNull) {


                        tranViewModelTransactionNumList = tranViewModel.getTransactionNumList();

                        tranViewModelTransactionNumListJavaLangObjectNull = (tranViewModelTransactionNumList) != (null);
                        if (tranViewModelTransactionNumListJavaLangObjectNull) {


                            tranViewModelTransactionNumListGetValue = tranViewModelTransactionNumList.getValue();

                            tranViewModelTransactionNumListGetValueJavaLangObjectNull = (tranViewModelTransactionNumListGetValue) != (null);
                            if (tranViewModelTransactionNumListGetValueJavaLangObjectNull) {



                                tranViewModelTransactionNumListGetInt4 = tranViewModelTransactionNumListGetValue.get(4);

                                fragment.pressTransactionPW(true, tranViewModelTransactionNumListGetInt4);
                            }
                        }
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // tranViewModel.transactionNumList.getValue() != null
                boolean tranViewModelTransactionNumListGetValueJavaLangObjectNull = false;
                // fragment
                com.seoul.app.zeropay_client.ui.TransactionPWFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;
                // tranViewModel != null
                boolean tranViewModelJavaLangObjectNull = false;
                // tranViewModel.transactionNumList.getValue()
                java.util.ArrayList<java.lang.String> tranViewModelTransactionNumListGetValue = null;
                // tranViewModel.transactionNumList
                androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> tranViewModelTransactionNumList = null;
                // tranViewModel.transactionNumList.getValue().get(0)
                java.lang.String tranViewModelTransactionNumListGetInt0 = null;
                // tranViewModel.transactionNumList != null
                boolean tranViewModelTransactionNumListJavaLangObjectNull = false;
                // tranViewModel
                com.seoul.app.zeropay_client.model.UserViewModel tranViewModel = mTranViewModel;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    tranViewModelJavaLangObjectNull = (tranViewModel) != (null);
                    if (tranViewModelJavaLangObjectNull) {


                        tranViewModelTransactionNumList = tranViewModel.getTransactionNumList();

                        tranViewModelTransactionNumListJavaLangObjectNull = (tranViewModelTransactionNumList) != (null);
                        if (tranViewModelTransactionNumListJavaLangObjectNull) {


                            tranViewModelTransactionNumListGetValue = tranViewModelTransactionNumList.getValue();

                            tranViewModelTransactionNumListGetValueJavaLangObjectNull = (tranViewModelTransactionNumListGetValue) != (null);
                            if (tranViewModelTransactionNumListGetValueJavaLangObjectNull) {



                                tranViewModelTransactionNumListGetInt0 = tranViewModelTransactionNumListGetValue.get(0);

                                fragment.pressTransactionPW(true, tranViewModelTransactionNumListGetInt0);
                            }
                        }
                    }
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // tranViewModel.transactionNumList.getValue() != null
                boolean tranViewModelTransactionNumListGetValueJavaLangObjectNull = false;
                // fragment
                com.seoul.app.zeropay_client.ui.TransactionPWFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;
                // tranViewModel != null
                boolean tranViewModelJavaLangObjectNull = false;
                // tranViewModel.transactionNumList.getValue()
                java.util.ArrayList<java.lang.String> tranViewModelTransactionNumListGetValue = null;
                // tranViewModel.transactionNumList.getValue().get(7)
                java.lang.String tranViewModelTransactionNumListGetInt7 = null;
                // tranViewModel.transactionNumList
                androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> tranViewModelTransactionNumList = null;
                // tranViewModel.transactionNumList != null
                boolean tranViewModelTransactionNumListJavaLangObjectNull = false;
                // tranViewModel
                com.seoul.app.zeropay_client.model.UserViewModel tranViewModel = mTranViewModel;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    tranViewModelJavaLangObjectNull = (tranViewModel) != (null);
                    if (tranViewModelJavaLangObjectNull) {


                        tranViewModelTransactionNumList = tranViewModel.getTransactionNumList();

                        tranViewModelTransactionNumListJavaLangObjectNull = (tranViewModelTransactionNumList) != (null);
                        if (tranViewModelTransactionNumListJavaLangObjectNull) {


                            tranViewModelTransactionNumListGetValue = tranViewModelTransactionNumList.getValue();

                            tranViewModelTransactionNumListGetValueJavaLangObjectNull = (tranViewModelTransactionNumListGetValue) != (null);
                            if (tranViewModelTransactionNumListGetValueJavaLangObjectNull) {



                                tranViewModelTransactionNumListGetInt7 = tranViewModelTransactionNumListGetValue.get(7);

                                fragment.pressTransactionPW(true, tranViewModelTransactionNumListGetInt7);
                            }
                        }
                    }
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // tranViewModel.transactionNumList.getValue() != null
                boolean tranViewModelTransactionNumListGetValueJavaLangObjectNull = false;
                // tranViewModel.transactionNumList.getValue().get(3)
                java.lang.String tranViewModelTransactionNumListGetInt3 = null;
                // fragment
                com.seoul.app.zeropay_client.ui.TransactionPWFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;
                // tranViewModel != null
                boolean tranViewModelJavaLangObjectNull = false;
                // tranViewModel.transactionNumList.getValue()
                java.util.ArrayList<java.lang.String> tranViewModelTransactionNumListGetValue = null;
                // tranViewModel.transactionNumList
                androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> tranViewModelTransactionNumList = null;
                // tranViewModel.transactionNumList != null
                boolean tranViewModelTransactionNumListJavaLangObjectNull = false;
                // tranViewModel
                com.seoul.app.zeropay_client.model.UserViewModel tranViewModel = mTranViewModel;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    tranViewModelJavaLangObjectNull = (tranViewModel) != (null);
                    if (tranViewModelJavaLangObjectNull) {


                        tranViewModelTransactionNumList = tranViewModel.getTransactionNumList();

                        tranViewModelTransactionNumListJavaLangObjectNull = (tranViewModelTransactionNumList) != (null);
                        if (tranViewModelTransactionNumListJavaLangObjectNull) {


                            tranViewModelTransactionNumListGetValue = tranViewModelTransactionNumList.getValue();

                            tranViewModelTransactionNumListGetValueJavaLangObjectNull = (tranViewModelTransactionNumListGetValue) != (null);
                            if (tranViewModelTransactionNumListGetValueJavaLangObjectNull) {



                                tranViewModelTransactionNumListGetInt3 = tranViewModelTransactionNumListGetValue.get(3);

                                fragment.pressTransactionPW(true, tranViewModelTransactionNumListGetInt3);
                            }
                        }
                    }
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // tranViewModel != null
                boolean tranViewModelJavaLangObjectNull = false;
                // tranViewModel
                com.seoul.app.zeropay_client.model.UserViewModel tranViewModel = mTranViewModel;



                tranViewModelJavaLangObjectNull = (tranViewModel) != (null);
                if (tranViewModelJavaLangObjectNull) {


                    tranViewModel.shuffleList();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // tranViewModel.transactionNumList.getValue() != null
                boolean tranViewModelTransactionNumListGetValueJavaLangObjectNull = false;
                // fragment
                com.seoul.app.zeropay_client.ui.TransactionPWFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;
                // tranViewModel != null
                boolean tranViewModelJavaLangObjectNull = false;
                // tranViewModel.transactionNumList.getValue()
                java.util.ArrayList<java.lang.String> tranViewModelTransactionNumListGetValue = null;
                // tranViewModel.transactionNumList
                androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> tranViewModelTransactionNumList = null;
                // tranViewModel.transactionNumList != null
                boolean tranViewModelTransactionNumListJavaLangObjectNull = false;
                // tranViewModel
                com.seoul.app.zeropay_client.model.UserViewModel tranViewModel = mTranViewModel;
                // tranViewModel.transactionNumList.getValue().get(6)
                java.lang.String tranViewModelTransactionNumListGetInt6 = null;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    tranViewModelJavaLangObjectNull = (tranViewModel) != (null);
                    if (tranViewModelJavaLangObjectNull) {


                        tranViewModelTransactionNumList = tranViewModel.getTransactionNumList();

                        tranViewModelTransactionNumListJavaLangObjectNull = (tranViewModelTransactionNumList) != (null);
                        if (tranViewModelTransactionNumListJavaLangObjectNull) {


                            tranViewModelTransactionNumListGetValue = tranViewModelTransactionNumList.getValue();

                            tranViewModelTransactionNumListGetValueJavaLangObjectNull = (tranViewModelTransactionNumListGetValue) != (null);
                            if (tranViewModelTransactionNumListGetValueJavaLangObjectNull) {



                                tranViewModelTransactionNumListGetInt6 = tranViewModelTransactionNumListGetValue.get(6);

                                fragment.pressTransactionPW(true, tranViewModelTransactionNumListGetInt6);
                            }
                        }
                    }
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // tranViewModel.transactionNumList.getValue() != null
                boolean tranViewModelTransactionNumListGetValueJavaLangObjectNull = false;
                // fragment
                com.seoul.app.zeropay_client.ui.TransactionPWFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;
                // tranViewModel != null
                boolean tranViewModelJavaLangObjectNull = false;
                // tranViewModel.transactionNumList.getValue()
                java.util.ArrayList<java.lang.String> tranViewModelTransactionNumListGetValue = null;
                // tranViewModel.transactionNumList.getValue().get(2)
                java.lang.String tranViewModelTransactionNumListGetInt2 = null;
                // tranViewModel.transactionNumList
                androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> tranViewModelTransactionNumList = null;
                // tranViewModel.transactionNumList != null
                boolean tranViewModelTransactionNumListJavaLangObjectNull = false;
                // tranViewModel
                com.seoul.app.zeropay_client.model.UserViewModel tranViewModel = mTranViewModel;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {




                    tranViewModelJavaLangObjectNull = (tranViewModel) != (null);
                    if (tranViewModelJavaLangObjectNull) {


                        tranViewModelTransactionNumList = tranViewModel.getTransactionNumList();

                        tranViewModelTransactionNumListJavaLangObjectNull = (tranViewModelTransactionNumList) != (null);
                        if (tranViewModelTransactionNumListJavaLangObjectNull) {


                            tranViewModelTransactionNumListGetValue = tranViewModelTransactionNumList.getValue();

                            tranViewModelTransactionNumListGetValueJavaLangObjectNull = (tranViewModelTransactionNumListGetValue) != (null);
                            if (tranViewModelTransactionNumListGetValueJavaLangObjectNull) {



                                tranViewModelTransactionNumListGetInt2 = tranViewModelTransactionNumListGetValue.get(2);

                                fragment.pressTransactionPW(true, tranViewModelTransactionNumListGetInt2);
                            }
                        }
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tranViewModel.transactionNumList
        flag 1 (0x2L): fragment
        flag 2 (0x3L): tranViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}