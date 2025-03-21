package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdhy {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final zzetk zzb;
    private final zzdhe zzc;
    private final zzdgz zzd;
    private final zzdij zze;
    private final zzdir zzf;
    private final Executor zzg;
    private final Executor zzh;
    private final zzbhy zzi;
    private final zzdgw zzj;

    public zzdhy(com.google.android.gms.ads.internal.util.zzg zzgVar, zzetk zzetkVar, zzdhe zzdheVar, zzdgz zzdgzVar, zzdij zzdijVar, zzdir zzdirVar, Executor executor, Executor executor2, zzdgw zzdgwVar) {
        this.zza = zzgVar;
        this.zzb = zzetkVar;
        this.zzi = zzetkVar.zzi;
        this.zzc = zzdheVar;
        this.zzd = zzdgzVar;
        this.zze = zzdijVar;
        this.zzf = zzdirVar;
        this.zzg = executor;
        this.zzh = executor2;
        this.zzj = zzdgwVar;
    }

    public final void zza(final zzdit zzditVar) {
        this.zzg.execute(new Runnable(this, zzditVar) { // from class: com.google.android.gms.internal.ads.zzdhv
            private final zzdhy zza;
            private final zzdit zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzditVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf(this.zzb);
            }
        });
    }

    public final void zzb(zzdit zzditVar) {
        if (zzditVar == null || this.zze == null || zzditVar.zzbE() == null || !this.zzc.zzb()) {
            return;
        }
        try {
            zzditVar.zzbE().addView(this.zze.zza());
        } catch (zzcim e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzc(zzdit zzditVar) {
        if (zzditVar == null) {
            return;
        }
        Context context = zzditVar.zzbI().getContext();
        if (com.google.android.gms.ads.internal.util.zzby.zzi(context, this.zzc.zza)) {
            if (!(context instanceof Activity)) {
                com.google.android.gms.ads.internal.util.zze.zzd("Activity context is needed for policy validator.");
            } else if (this.zzf == null || zzditVar.zzbE() == null) {
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.addView(this.zzf.zza(zzditVar.zzbE(), windowManager), com.google.android.gms.ads.internal.util.zzby.zzj());
                } catch (zzcim e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
                }
            }
        }
    }

    public final boolean zzd(ViewGroup viewGroup) {
        return zzh(viewGroup, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzdit zzditVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbih zza;
        Drawable drawable;
        if (this.zzc.zze() || this.zzc.zzc()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                View zzm = zzditVar.zzm(strArr[i]);
                if (zzm != null && (zzm instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzm;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzditVar.zzbI().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.zzd.zzy() != null) {
            view = this.zzd.zzy();
            zzbhy zzbhyVar = this.zzi;
            if (zzbhyVar != null && viewGroup == null) {
                zzg(layoutParams, zzbhyVar.zze);
                view.setLayoutParams(layoutParams);
            }
        } else if (this.zzd.zzx() instanceof zzbhr) {
            zzbhr zzbhrVar = (zzbhr) this.zzd.zzx();
            if (viewGroup == null) {
                zzg(layoutParams, zzbhrVar.zzi());
            }
            View zzbhsVar = new zzbhs(context, zzbhrVar, layoutParams);
            zzbhsVar.setContentDescription((CharSequence) zzbba.zzc().zzb(zzbfq.zzce));
            view = zzbhsVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzditVar.zzbI().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzbE = zzditVar.zzbE();
                if (zzbE != null) {
                    zzbE.addView(zzaVar);
                }
            }
            zzditVar.zzi(zzditVar.zzn(), view, true);
        }
        zzfgz<String> zzfgzVar = zzdhu.zza;
        int size = zzfgzVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzm2 = zzditVar.zzm(zzfgzVar.get(i2));
            i2++;
            if (zzm2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzm2;
                break;
            }
        }
        this.zzh.execute(new Runnable(this, viewGroup2) { // from class: com.google.android.gms.internal.ads.zzdhw
            private final zzdhy zza;
            private final ViewGroup zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = viewGroup2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze(this.zzb);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzh(viewGroup2, true)) {
            if (this.zzd.zzR() != null) {
                this.zzd.zzR().zzap(new zzdhx(zzditVar, viewGroup2));
            }
        } else if (((Boolean) zzbba.zzc().zzb(zzbfq.zzgs)).booleanValue() && zzh(viewGroup2, false)) {
            if (this.zzd.zzS() != null) {
                this.zzd.zzS().zzap(new zzdhx(zzditVar, viewGroup2));
            }
        } else {
            viewGroup2.removeAllViews();
            View zzbI = zzditVar.zzbI();
            Context context2 = zzbI != null ? zzbI.getContext() : null;
            if (context2 == null || (zza = this.zzj.zza()) == null) {
                return;
            }
            try {
                IObjectWrapper zzg = zza.zzg();
                if (zzg == null || (drawable = (Drawable) ObjectWrapper.unwrap(zzg)) == null) {
                    return;
                }
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                IObjectWrapper zzo = zzditVar != null ? zzditVar.zzo() : null;
                if (zzo != null) {
                    if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeq)).booleanValue()) {
                        imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzo));
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        viewGroup2.addView(imageView);
                    }
                }
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                viewGroup2.addView(imageView);
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.zze.zzi("Could not get main image drawable");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.zzd.zzH() != null) {
            if (this.zzd.zzv() == 2 || this.zzd.zzv() == 1) {
                this.zza.zzv(this.zzb.zzf, String.valueOf(this.zzd.zzv()), z);
            } else if (this.zzd.zzv() == 6) {
                this.zza.zzv(this.zzb.zzf, "2", z);
                this.zza.zzv(this.zzb.zzf, "1", z);
            }
        }
    }

    private static void zzg(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i == 3) {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        } else {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        }
    }

    private final boolean zzh(ViewGroup viewGroup, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        View zzH = z ? this.zzd.zzH() : this.zzd.zzI();
        if (zzH == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzH.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzH.getParent()).removeView(zzH);
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzcg)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzH, layoutParams);
        return true;
    }
}
