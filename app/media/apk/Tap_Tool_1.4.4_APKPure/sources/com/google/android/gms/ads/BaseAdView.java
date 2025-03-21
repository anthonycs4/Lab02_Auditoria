package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.internal.ads.zzazi;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzccn;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class BaseAdView extends ViewGroup {
    @NotOnlyInitialized
    protected final zzbds zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseAdView(Context context, int i) {
        super(context);
        this.zza = new zzbds(this, i);
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

    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzu();
    }

    public ResponseInfo getResponseInfo() {
        return this.zza.zzs();
    }

    public boolean isLoading() {
        return this.zza.zzr();
    }

    public void loadAd(AdRequest adRequest) {
        this.zza.zzg(adRequest.zza());
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
        if (adListener == null) {
            this.zza.zzl(null);
            return;
        }
        if (adListener instanceof zzazi) {
            this.zza.zzl((zzazi) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zza.zzp((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zza.zzm(adSize);
    }

    public void setAdUnitId(String str) {
        this.zza.zzo(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zza.zzt(onPaidEventListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.zza = new zzbds(this, attributeSet, false, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.zza = new zzbds(this, attributeSet, false, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        this.zza = new zzbds(this, attributeSet, z, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseAdView(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.zza = new zzbds(this, attributeSet, z);
    }
}
