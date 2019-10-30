package com.seoul.app.zeropay_client.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0016\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0007J\b\u0010!\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006#"}, d2 = {"Lcom/seoul/app/zeropay_client/ui/TransactionPWFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/seoul/app/zeropay_client/databinding/FragmentTransactionPwBinding;", "checkPasswordList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "userPasswordViewModel", "Lcom/seoul/app/zeropay_client/model/UserViewModel;", "view", "Landroid/view/ViewGroup;", "getView", "()Landroid/view/ViewGroup;", "setView", "(Landroid/view/ViewGroup;)V", "checkPassword", "", "passwords", "", "deletePressed", "", "buttonState", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "savedInstanceState", "Landroid/os/Bundle;", "pressTransactionPW", "number", "resetPassword", "Companion", "app_debug"})
public final class TransactionPWFragment extends androidx.fragment.app.Fragment {
    private com.seoul.app.zeropay_client.databinding.FragmentTransactionPwBinding binding;
    private com.seoul.app.zeropay_client.model.UserViewModel userPasswordViewModel;
    @org.jetbrains.annotations.NotNull()
    public android.view.ViewGroup view;
    private java.util.ArrayList<java.lang.String> checkPasswordList;
    private static final int PASSWORD_LENGTH = 4;
    private static final int PASSWORD_KIND = 2;
    public static final com.seoul.app.zeropay_client.ui.TransactionPWFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewGroup getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void pressTransactionPW(boolean buttonState, @org.jetbrains.annotations.NotNull()
    java.lang.String number) {
    }
    
    public final void deletePressed(boolean buttonState) {
    }
    
    private final boolean checkPassword(java.util.List<java.lang.String> passwords) {
        return false;
    }
    
    private final void resetPassword() {
    }
    
    public TransactionPWFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/seoul/app/zeropay_client/ui/TransactionPWFragment$Companion;", "", "()V", "PASSWORD_KIND", "", "PASSWORD_LENGTH", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}