package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdir {
    private final zzdmy zza;
    private final zzdlt zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdir(zzdmy zzdmyVar, zzdlt zzdltVar) {
        this.zza = zzdmyVar;
        this.zzb = zzdltVar;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        zzbay.zza();
        return zzccg.zzs(context, i);
    }

    public final View zza(final View view, final WindowManager windowManager) throws zzcim {
        zzcib zza = this.zza.zza(zzazx.zzb(), null, null);
        View view2 = (View) zza;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zza.zzab("/sendMessageToSdk", new zzblp(this) { // from class: com.google.android.gms.internal.ads.zzdil
            private final zzdir zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zze((zzcib) obj, map);
            }
        });
        zza.zzab("/hideValidatorOverlay", new zzblp(this, windowManager, view) { // from class: com.google.android.gms.internal.ads.zzdim
            private final zzdir zza;
            private final WindowManager zzb;
            private final View zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = windowManager;
                this.zzc = view;
            }

            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zzd(this.zzb, this.zzc, (zzcib) obj, map);
            }
        });
        zza.zzab("/open", new zzbma(null, null, null, null, null));
        this.zzb.zzh(new WeakReference(zza), "/loadNativeAdPolicyViolations", new zzblp(this, view, windowManager) { // from class: com.google.android.gms.internal.ads.zzdin
            private final zzdir zza;
            private final View zzb;
            private final WindowManager zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = view;
                this.zzc = windowManager;
            }

            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zzb(this.zzb, this.zzc, (zzcib) obj, map);
            }
        });
        this.zzb.zzh(new WeakReference(zza), "/showValidatorOverlay", zzdio.zza);
        return view2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(final View view, final WindowManager windowManager, final zzcib zzcibVar, final Map map) {
        int i;
        zzcibVar.zzR().zzw(new zzcjn(this, map) { // from class: com.google.android.gms.internal.ads.zzdiq
            private final zzdir zza;
            private final Map zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = map;
            }

            @Override // com.google.android.gms.internal.ads.zzcjn
            public final void zza(boolean z) {
                this.zza.zzc(this.zzb, z);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) zzbba.zzc().zzb(zzbfq.zzfp)).intValue());
        int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) zzbba.zzc().zzb(zzbfq.zzfq)).intValue());
        int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcibVar.zzaf(zzcjr.zzc(zzf, zzf2));
        try {
            zzcibVar.zzG().getSettings().setUseWideViewPort(((Boolean) zzbba.zzc().zzb(zzbfq.zzfr)).booleanValue());
            zzcibVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) zzbba.zzc().zzb(zzbfq.zzfs)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzj = com.google.android.gms.ads.internal.util.zzby.zzj();
        zzj.x = zzf3;
        zzj.y = zzf4;
        windowManager.updateViewLayout(zzcibVar.zzH(), zzj);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            if ("1".equals(str) || "2".equals(str)) {
                i = rect.bottom;
            } else {
                i = rect.top;
            }
            final int i2 = i - zzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener(view, zzcibVar, str, zzj, i2, windowManager) { // from class: com.google.android.gms.internal.ads.zzdip
                private final View zza;
                private final zzcib zzb;
                private final String zzc;
                private final WindowManager.LayoutParams zzd;
                private final int zze;
                private final WindowManager zzf;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = view;
                    this.zzb = zzcibVar;
                    this.zzc = str;
                    this.zzd = zzj;
                    this.zze = i2;
                    this.zzf = windowManager;
                }

                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = this.zza;
                    zzcib zzcibVar2 = this.zzb;
                    String str2 = this.zzc;
                    WindowManager.LayoutParams layoutParams = this.zzd;
                    int i3 = this.zze;
                    WindowManager windowManager2 = this.zzf;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || zzcibVar2.zzH().getWindowToken() == null) {
                        return;
                    }
                    if ("1".equals(str2) || "2".equals(str2)) {
                        layoutParams.y = rect2.bottom - i3;
                    } else {
                        layoutParams.y = rect2.top - i3;
                    }
                    windowManager2.updateViewLayout(zzcibVar2.zzH(), layoutParams);
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcibVar.loadUrl(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(WindowManager windowManager, View view, zzcib zzcibVar, Map map) {
        com.google.android.gms.ads.internal.util.zze.zzd("Hide native ad policy validator overlay.");
        zzcibVar.zzH().setVisibility(8);
        if (zzcibVar.zzH().getWindowToken() != null) {
            windowManager.removeView(zzcibVar.zzH());
        }
        zzcibVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcib zzcibVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }
}
