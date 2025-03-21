package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdhu extends zzbin implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdit {
    public static final zzfgz<String> zza = zzfgz.zzl("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzflb zzf;
    private View zzg;
    private zzdgu zzi;
    private zzasj zzj;
    private zzbih zzl;
    private boolean zzm;
    private Map<String, WeakReference<View>> zzc = new HashMap();
    private IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = ModuleDescriptor.MODULE_VERSION;

    public zzdhu(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzs.zzz();
        zzcdm.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzs.zzz();
        zzcdm.zzb(frameLayout, this);
        this.zzf = zzccz.zze;
        this.zzj = new zzasj(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzr() {
        this.zzf.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdht
            private final zzdhu zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzq();
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdgu zzdguVar = this.zzi;
        if (zzdguVar != null) {
            zzdguVar.zzt();
            this.zzi.zzj(view, this.zzd, zzj(), zzk(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdgu zzdguVar = this.zzi;
        if (zzdguVar != null) {
            zzdguVar.zzp(this.zzd, zzj(), zzk(), zzdgu.zzz(this.zzd));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdgu zzdguVar = this.zzi;
        if (zzdguVar != null) {
            zzdguVar.zzp(this.zzd, zzj(), zzk(), zzdgu.zzz(this.zzd));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdgu zzdguVar = this.zzi;
        if (zzdguVar != null) {
            zzdguVar.zzk(view, motionEvent, this.zzd);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final synchronized void zzb(String str, IObjectWrapper iObjectWrapper) {
        zzi(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final FrameLayout zzbE() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final synchronized void zzbF(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zzbG(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final synchronized void zzbH(zzbih zzbihVar) {
        if (this.zzn) {
            return;
        }
        this.zzm = true;
        this.zzl = zzbihVar;
        zzdgu zzdguVar = this.zzi;
        if (zzdguVar != null) {
            zzdguVar.zzF().zzb(zzbihVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final /* bridge */ /* synthetic */ View zzbI() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final synchronized IObjectWrapper zzc(String str) {
        return ObjectWrapper.wrap(zzm(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final synchronized void zzd(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzdgu)) {
            com.google.android.gms.ads.internal.util.zze.zzi("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdgu zzdguVar = this.zzi;
        if (zzdguVar != null) {
            zzdguVar.zzh(this);
        }
        zzr();
        zzdgu zzdguVar2 = (zzdgu) unwrap;
        this.zzi = zzdguVar2;
        zzdguVar2.zzg(this);
        this.zzi.zzD(this.zzd);
        this.zzi.zzE(this.zze);
        if (this.zzm) {
            this.zzi.zzF().zzb(this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final synchronized void zze() {
        if (this.zzn) {
            return;
        }
        zzdgu zzdguVar = this.zzi;
        if (zzdguVar != null) {
            zzdguVar.zzh(this);
            this.zzi = null;
        }
        this.zzc.clear();
        this.zzd.removeAllViews();
        this.zze.removeAllViews();
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = null;
        this.zzj = null;
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) {
        this.zzi.zzr((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final zzasj zzh() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final synchronized void zzi(String str, View view, boolean z) {
        if (this.zzn) {
            return;
        }
        if (view == null) {
            this.zzc.remove(str);
            return;
        }
        this.zzc.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            if (com.google.android.gms.ads.internal.util.zzby.zza(this.zzh)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final synchronized Map<String, WeakReference<View>> zzj() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final synchronized Map<String, WeakReference<View>> zzk() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final synchronized Map<String, WeakReference<View>> zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final synchronized View zzm(String str) {
        if (this.zzn) {
            return null;
        }
        WeakReference<View> weakReference = this.zzc.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final synchronized String zzn() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final IObjectWrapper zzo() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final synchronized JSONObject zzp() {
        zzdgu zzdguVar = this.zzi;
        if (zzdguVar != null) {
            return zzdguVar.zzq(this.zzd, zzj(), zzk());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
