package com.seoul.app.zeropay_client.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00062\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u001e\u0010\u0016\u001a\u00020\u00062\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bJ\u001e\u0010\u0017\u001a\u00020\u00062\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\u0005`\u000bR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\u0005`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/seoul/app/zeropay_client/adapter/ShopListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/seoul/app/zeropay_client/adapter/ShopListAdapter$ShopHolder;", "clickListener", "Lkotlin/Function1;", "Lcom/seoul/app/zeropay_client/network/response/ShopListResponse;", "", "(Lkotlin/jvm/functions/Function1;)V", "shopDistance", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "shopListResponse", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateDistance", "updateMap", "ShopHolder", "app_debug"})
public final class ShopListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.seoul.app.zeropay_client.adapter.ShopListAdapter.ShopHolder> {
    private java.util.ArrayList<com.seoul.app.zeropay_client.network.response.ShopListResponse> shopListResponse;
    private java.util.ArrayList<java.lang.Double> shopDistance;
    private final kotlin.jvm.functions.Function1<com.seoul.app.zeropay_client.network.response.ShopListResponse, kotlin.Unit> clickListener = null;
    
    public final void updateMap(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.seoul.app.zeropay_client.network.response.ShopListResponse> shopListResponse) {
    }
    
    public final void updateDistance(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Double> shopDistance) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.seoul.app.zeropay_client.adapter.ShopListAdapter.ShopHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.seoul.app.zeropay_client.adapter.ShopListAdapter.ShopHolder holder, int position) {
    }
    
    public ShopListAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.seoul.app.zeropay_client.network.response.ShopListResponse, kotlin.Unit> clickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/seoul/app/zeropay_client/adapter/ShopListAdapter$ShopHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/seoul/app/zeropay_client/adapter/ShopListAdapter;Landroid/view/View;)V", "view", "bind", "", "item", "Lcom/seoul/app/zeropay_client/network/response/ShopListResponse;", "distance", "", "app_debug"})
    public final class ShopHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.view.View view;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.seoul.app.zeropay_client.network.response.ShopListResponse item, double distance) {
        }
        
        public ShopHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}