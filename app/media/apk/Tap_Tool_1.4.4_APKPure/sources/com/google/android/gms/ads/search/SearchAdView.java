package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzccn;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class SearchAdView extends ViewGroup {
    @NotOnlyInitialized
    private final zzbds zza;

    public SearchAdView(Context context) {
        super(context);
        this.zza = new zzbds(this);
    }

    public void destroy() {
        this.zza.zza();
    }

    public AdListener getAdListener() {
        return this.zza.zzb();
    }

    public AdSize getAdSize() {
        return this.zza.zzc();
    }

    public String getAdUnitId() {
        return this.zza.zze();
    }

    public void loadAd(DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest) {
        if (!AdSize.SEARCH.equals(getAdSize())) {
            throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
        }
        this.zza.zzg(dynamicHeightSearchAdRequest.zza());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        AdSize adSize;
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzccn.zzg("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        this.zza.zzh();
    }

    public void resume() {
        this.zza.zzj();
    }

    public void setAdListener(AdListener adListener) {
        this.zza.zzk(adListener);
    }

    public void setAdSize(AdSize adSize) {
        this.zza.zzm(adSize);
    }

    public void setAdUnitId(String str) {
        this.zza.zzo(str);
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = new zzbds(this, attributeSet, false);
    }

    public void loadAd(SearchAdRequest searchAdRequest) {
        this.zza.zzg(searchAdRequest.zza());
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = new zzbds(this, attributeSet, false);
    }
}
