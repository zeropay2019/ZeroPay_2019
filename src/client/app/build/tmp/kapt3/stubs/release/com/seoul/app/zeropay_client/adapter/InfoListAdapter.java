package com.seoul.app.zeropay_client.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B1\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/seoul/app/zeropay_client/adapter/InfoListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/seoul/app/zeropay_client/adapter/InfoListAdapter$InfoHolder;", "clickListener", "Lkotlin/Function1;", "Lcom/seoul/app/zeropay_client/model/Info;", "", "info", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Lkotlin/jvm/functions/Function1;Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "InfoHolder", "app_release"})
public final class InfoListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.seoul.app.zeropay_client.adapter.InfoListAdapter.InfoHolder> {
    private final kotlin.jvm.functions.Function1<com.seoul.app.zeropay_client.model.Info, kotlin.Unit> clickListener = null;
    private final java.util.ArrayList<com.seoul.app.zeropay_client.model.Info> info = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.seoul.app.zeropay_client.adapter.InfoListAdapter.InfoHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.seoul.app.zeropay_client.adapter.InfoListAdapter.InfoHolder holder, int position) {
    }
    
    public InfoListAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.seoul.app.zeropay_client.model.Info, kotlin.Unit> clickListener, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.seoul.app.zeropay_client.model.Info> info) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/seoul/app/zeropay_client/adapter/InfoListAdapter$InfoHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/seoul/app/zeropay_client/adapter/InfoListAdapter;Landroid/view/View;)V", "view", "bind", "", "item", "Lcom/seoul/app/zeropay_client/model/Info;", "app_release"})
    public final class InfoHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.view.View view;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.seoul.app.zeropay_client.model.Info item) {
        }
        
        public InfoHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}