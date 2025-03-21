package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcei extends FrameLayout implements zzcea {
    private final zzceu zza;
    private final FrameLayout zzb;
    private final View zzc;
    private final zzbgf zzd;
    private final zzcew zze;
    private final long zzf;
    private final zzceb zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcei(Context context, zzceu zzceuVar, int i, boolean z, zzbgf zzbgfVar, zzcet zzcetVar) {
        super(context);
        zzceb zzcdzVar;
        this.zza = zzceuVar;
        this.zzd = zzbgfVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzb = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzceuVar.zzk());
        zzcec zzcecVar = zzceuVar.zzk().zza;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) {
            zzcev zzcevVar = new zzcev(context, zzceuVar.zzt(), zzceuVar.zzm(), zzbgfVar, zzceuVar.zzi());
            if (i != 2) {
                zzcdzVar = new zzcdz(context, zzceuVar, z, zzcem.zza(zzceuVar), zzcetVar, new zzcev(context, zzceuVar.zzt(), zzceuVar.zzm(), zzbgfVar, zzceuVar.zzi()));
            } else {
                zzcdzVar = new zzcfl(context, zzcevVar, zzceuVar, z, zzcem.zza(zzceuVar), zzcetVar);
            }
        } else {
            zzcdzVar = null;
        }
        this.zzg = zzcdzVar;
        View view = new View(context);
        this.zzc = view;
        view.setBackgroundColor(0);
        if (zzcdzVar != null) {
            frameLayout.addView(zzcdzVar, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzA)).booleanValue()) {
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.bringChildToFront(view);
            }
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzx)).booleanValue()) {
                zzC();
            }
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) zzbba.zzc().zzb(zzbfq.zzC)).longValue();
        boolean booleanValue = ((Boolean) zzbba.zzc().zzb(zzbfq.zzz)).booleanValue();
        this.zzk = booleanValue;
        if (zzbgfVar != null) {
            zzbgfVar.zzd("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.zze = new zzcew(this);
        if (zzcdzVar != null) {
            zzcdzVar.zzb(this);
        }
        if (zzcdzVar == null) {
            zzf("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    private final boolean zzH() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzI(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zza.zze("onVideoEvent", hashMap);
    }

    private final void zzJ() {
        if (this.zza.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zza.zzj().getWindow().clearFlags(128);
        this.zzi = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.zze.zza();
            zzceb zzcebVar = this.zzg;
            if (zzcebVar != null) {
                zzccz.zze.execute(zzced.zza(zzcebVar));
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zze.zzb();
        } else {
            this.zze.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.zzcee
            private final zzcei zza;
            private final boolean zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzF(this.zzb);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcea
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zze.zzb();
            z = true;
        } else {
            this.zze.zza();
            this.zzm = this.zzl;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzr.zza.post(new zzceh(this, z));
    }

    public final void zzA(int i) {
        this.zzg.zzB(i);
    }

    public final void zzB(MotionEvent motionEvent) {
        zzceb zzcebVar = this.zzg;
        if (zzcebVar == null) {
            return;
        }
        zzcebVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzC() {
        zzceb zzcebVar = this.zzg;
        if (zzcebVar == null) {
            return;
        }
        TextView textView = new TextView(zzcebVar.getContext());
        String valueOf = String.valueOf(this.zzg.zza());
        textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
        textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        this.zzb.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzb.bringChildToFront(textView);
    }

    public final void zzD() {
        this.zze.zza();
        zzceb zzcebVar = this.zzg;
        if (zzcebVar != null) {
            zzcebVar.zzd();
        }
        zzJ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzE() {
        zzceb zzcebVar = this.zzg;
        if (zzcebVar == null) {
            return;
        }
        long zzh = zzcebVar.zzh();
        if (this.zzl == zzh || zzh <= 0) {
            return;
        }
        float f = ((float) zzh) / 1000.0f;
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbj)).booleanValue()) {
            zzI("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.zzg.zzo()), "qoeCachedBytes", String.valueOf(this.zzg.zzn()), "qoeLoadedBytes", String.valueOf(this.zzg.zzm()), "droppedFrames", String.valueOf(this.zzg.zzp()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis()));
        } else {
            zzI("timeupdate", "time", String.valueOf(f));
        }
        this.zzl = zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzF(boolean z) {
        zzI("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zza() {
        this.zze.zzb();
        com.google.android.gms.ads.internal.util.zzr.zza.post(new zzcef(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzb() {
        zzceb zzcebVar = this.zzg;
        if (zzcebVar != null && this.zzm == 0) {
            zzI("canplaythrough", "duration", String.valueOf(zzcebVar.zzg() / 1000.0f), "videoWidth", String.valueOf(this.zzg.zzk()), "videoHeight", String.valueOf(this.zzg.zzl()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzc() {
        if (this.zza.zzj() != null && !this.zzi) {
            boolean z = (this.zza.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                this.zza.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzd() {
        zzI("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zze() {
        zzI("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzf(String str, String str2) {
        zzI("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzg(String str, String str2) {
        zzI("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzH()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzb.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzb.bringChildToFront(this.zzq);
        }
        this.zze.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzr.zza.post(new zzceg(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzi() {
        if (this.zzh && zzH()) {
            this.zzb.removeView(this.zzq);
        }
        if (this.zzp == null) {
            return;
        }
        long elapsedRealtime = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime() - elapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Spinner frame grab took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (elapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.zze.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbgf zzbgfVar = this.zzd;
            if (zzbgfVar != null) {
                zzbgfVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzj(int i, int i2) {
        if (this.zzk) {
            int max = Math.max(i / ((Integer) zzbba.zzc().zzb(zzbfq.zzB)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzbba.zzc().zzb(zzbfq.zzB)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzk() {
        this.zzc.setVisibility(4);
    }

    public final void zzl(int i) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzA)).booleanValue()) {
            this.zzb.setBackgroundColor(i);
            this.zzc.setBackgroundColor(i);
        }
    }

    public final void zzm(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb = new StringBuilder(75);
            sb.append("Set video bounds to x:");
            sb.append(i);
            sb.append(";y:");
            sb.append(i2);
            sb.append(";w:");
            sb.append(i3);
            sb.append(";h:");
            sb.append(i4);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzb.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzn(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzo(float f, float f2) {
        zzceb zzcebVar = this.zzg;
        if (zzcebVar != null) {
            zzcebVar.zzj(f, f2);
        }
    }

    public final void zzp() {
        if (this.zzg == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.zzn)) {
            this.zzg.zzw(this.zzn, this.zzo);
        } else {
            zzI("no_src", new String[0]);
        }
    }

    public final void zzq() {
        zzceb zzcebVar = this.zzg;
        if (zzcebVar == null) {
            return;
        }
        zzcebVar.zzf();
    }

    public final void zzr() {
        zzceb zzcebVar = this.zzg;
        if (zzcebVar == null) {
            return;
        }
        zzcebVar.zze();
    }

    public final void zzs(int i) {
        zzceb zzcebVar = this.zzg;
        if (zzcebVar == null) {
            return;
        }
        zzcebVar.zzi(i);
    }

    public final void zzt() {
        zzceb zzcebVar = this.zzg;
        if (zzcebVar == null) {
            return;
        }
        zzcebVar.zzb.zza(true);
        zzcebVar.zzq();
    }

    public final void zzu() {
        zzceb zzcebVar = this.zzg;
        if (zzcebVar == null) {
            return;
        }
        zzcebVar.zzb.zza(false);
        zzcebVar.zzq();
    }

    public final void zzv(float f) {
        zzceb zzcebVar = this.zzg;
        if (zzcebVar == null) {
            return;
        }
        zzcebVar.zzb.zzb(f);
        zzcebVar.zzq();
    }

    public final void zzw(int i) {
        this.zzg.zzx(i);
    }

    public final void zzx(int i) {
        this.zzg.zzy(i);
    }

    public final void zzy(int i) {
        this.zzg.zzz(i);
    }

    public final void zzz(int i) {
        this.zzg.zzA(i);
    }
}
