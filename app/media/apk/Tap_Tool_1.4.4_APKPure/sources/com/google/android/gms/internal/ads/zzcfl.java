package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcfl extends zzceb implements TextureView.SurfaceTextureListener, zzcek {
    private final zzceu zzc;
    private final zzcev zzd;
    private final boolean zze;
    private final zzcet zzf;
    private zzcea zzg;
    private Surface zzh;
    private zzcel zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzces zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private float zzv;

    public zzcfl(Context context, zzcev zzcevVar, zzceu zzceuVar, boolean z, boolean z2, zzcet zzcetVar) {
        super(context);
        this.zzm = 1;
        this.zze = z2;
        this.zzc = zzceuVar;
        this.zzd = zzcevVar;
        this.zzo = z;
        this.zzf = zzcetVar;
        setSurfaceTextureListener(this);
        zzcevVar.zza(this);
    }

    private final boolean zzR() {
        zzcel zzcelVar = this.zzi;
        return (zzcelVar == null || !zzcelVar.zzA() || this.zzl) ? false : true;
    }

    private final boolean zzS() {
        return zzR() && this.zzm != 1;
    }

    private final void zzT() {
        String str;
        if (this.zzi != null || (str = this.zzj) == null || this.zzh == null) {
            return;
        }
        if (str.startsWith("cache:")) {
            zzcgs zzs = this.zzc.zzs(this.zzj);
            if (zzs instanceof zzcha) {
                zzcel zzj = ((zzcha) zzs).zzj();
                this.zzi = zzj;
                if (!zzj.zzA()) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Precached video player has been released.");
                    return;
                }
            } else if (zzs instanceof zzcgy) {
                zzcgy zzcgyVar = (zzcgy) zzs;
                String zzE = zzE();
                ByteBuffer zzr = zzcgyVar.zzr();
                boolean zzq = zzcgyVar.zzq();
                String zzp = zzcgyVar.zzp();
                if (zzp == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Stream cache URL is null.");
                    return;
                }
                zzcel zzD = zzD();
                this.zzi = zzD;
                zzD.zzq(new Uri[]{Uri.parse(zzp)}, zzE, zzr, zzq);
            } else {
                String valueOf = String.valueOf(this.zzj);
                com.google.android.gms.ads.internal.util.zze.zzi(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                return;
            }
        } else {
            this.zzi = zzD();
            String zzE2 = zzE();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            this.zzi.zzp(uriArr, zzE2);
        }
        this.zzi.zzr(this);
        zzU(this.zzh, false);
        if (this.zzi.zzA()) {
            int zzB = this.zzi.zzB();
            this.zzm = zzB;
            if (zzB == 3) {
                zzW();
            }
        }
    }

    private final void zzU(Surface surface, boolean z) {
        zzcel zzcelVar = this.zzi;
        if (zzcelVar != null) {
            try {
                zzcelVar.zzt(surface, z);
                return;
            } catch (IOException e) {
                zzccn.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zzi("Trying to set surface before player is initialized.");
    }

    private final void zzV(float f, boolean z) {
        zzcel zzcelVar = this.zzi;
        if (zzcelVar != null) {
            try {
                zzcelVar.zzu(f, z);
                return;
            } catch (IOException e) {
                zzccn.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zzi("Trying to set volume before player is initialized.");
    }

    private final void zzW() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcez
            private final zzcfl zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzQ();
            }
        });
        zzq();
        this.zzd.zzb();
        if (this.zzq) {
            zze();
        }
    }

    private static String zzX(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    private final void zzY() {
        zzZ(this.zzr, this.zzs);
    }

    private final void zzZ(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.zzv != f) {
            this.zzv = f;
            requestLayout();
        }
    }

    private final void zzaa() {
        zzcel zzcelVar = this.zzi;
        if (zzcelVar != null) {
            zzcelVar.zzM(true);
        }
    }

    private final void zzab() {
        zzcel zzcelVar = this.zzi;
        if (zzcelVar != null) {
            zzcelVar.zzM(false);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzv;
        if (f != 0.0f && this.zzn == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzces zzcesVar = this.zzn;
        if (zzcesVar != null) {
            zzcesVar.zzc(measuredWidth, measuredHeight);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i4 = this.zzt;
            if (((i4 > 0 && i4 != measuredWidth) || ((i3 = this.zzu) > 0 && i3 != measuredHeight)) && this.zze && zzR() && this.zzi.zzC() > 0 && !this.zzi.zzD()) {
                zzV(0.0f, true);
                this.zzi.zzE(true);
                long zzC = this.zzi.zzC();
                long currentTimeMillis = com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis();
                while (zzR() && this.zzi.zzC() == zzC && com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis() - currentTimeMillis <= 250) {
                }
                this.zzi.zzE(false);
                zzq();
            }
            this.zzt = measuredWidth;
            this.zzu = measuredHeight;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzo) {
            zzces zzcesVar = new zzces(getContext());
            this.zzn = zzcesVar;
            zzcesVar.zzb(surfaceTexture, i, i2);
            this.zzn.start();
            SurfaceTexture zze = this.zzn.zze();
            if (zze != null) {
                surfaceTexture = zze;
            } else {
                this.zzn.zzd();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzT();
        } else {
            zzU(surface, true);
            if (!this.zzf.zza) {
                zzaa();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzZ(i, i2);
        } else {
            zzY();
        }
        com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcfg
            private final zzcfl zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzL();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzf();
        zzces zzcesVar = this.zzn;
        if (zzcesVar != null) {
            zzcesVar.zzd();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzab();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzU(null, true);
        }
        com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcfi
            private final zzcfl zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzJ();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzces zzcesVar = this.zzn;
        if (zzcesVar != null) {
            zzcesVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this, i, i2) { // from class: com.google.android.gms.internal.ads.zzcfh
            private final zzcfl zza;
            private final int zzb;
            private final int zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = i;
                this.zzc = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK(this.zzb, this.zzc);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this, i) { // from class: com.google.android.gms.internal.ads.zzcfj
            private final zzcfl zza;
            private final int zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzI(this.zzb);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzA(int i) {
        zzcel zzcelVar = this.zzi;
        if (zzcelVar != null) {
            zzcelVar.zzy(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzB(int i) {
        zzcel zzcelVar = this.zzi;
        if (zzcelVar != null) {
            zzcelVar.zzz(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzC() {
        com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcfb
            private final zzcfl zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzF();
            }
        });
    }

    final zzcel zzD() {
        if (this.zzf.zzm) {
            return new zzchr(this.zzc.getContext(), this.zzf, this.zzc);
        }
        return new zzcgb(this.zzc.getContext(), this.zzf, this.zzc);
    }

    final String zzE() {
        return com.google.android.gms.ads.internal.zzs.zzc().zze(this.zzc.getContext(), this.zzc.zzt().zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzF() {
        zzcea zzceaVar = this.zzg;
        if (zzceaVar != null) {
            zzceaVar.zzk();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzG(String str) {
        zzcea zzceaVar = this.zzg;
        if (zzceaVar != null) {
            zzceaVar.zzg("ExoPlayerAdapter exception", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzH(boolean z, long j) {
        this.zzc.zzv(z, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzI(int i) {
        zzcea zzceaVar = this.zzg;
        if (zzceaVar != null) {
            zzceaVar.onWindowVisibilityChanged(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzJ() {
        zzcea zzceaVar = this.zzg;
        if (zzceaVar != null) {
            zzceaVar.zzh();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzK(int i, int i2) {
        zzcea zzceaVar = this.zzg;
        if (zzceaVar != null) {
            zzceaVar.zzj(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzL() {
        zzcea zzceaVar = this.zzg;
        if (zzceaVar != null) {
            zzceaVar.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzM() {
        zzcea zzceaVar = this.zzg;
        if (zzceaVar != null) {
            zzceaVar.zzd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzN() {
        zzcea zzceaVar = this.zzg;
        if (zzceaVar != null) {
            zzceaVar.zzc();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzO(String str) {
        zzcea zzceaVar = this.zzg;
        if (zzceaVar != null) {
            zzceaVar.zzf("ExoPlayerAdapter error", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzP() {
        zzcea zzceaVar = this.zzg;
        if (zzceaVar != null) {
            zzceaVar.zze();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzQ() {
        zzcea zzceaVar = this.zzg;
        if (zzceaVar != null) {
            zzceaVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final String zza() {
        String str = true != this.zzo ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : " spherical";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzb(zzcea zzceaVar) {
        this.zzg = zzceaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzc(String str) {
        if (str != null) {
            this.zzj = str;
            this.zzk = new String[]{str};
            zzT();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzd() {
        if (zzR()) {
            this.zzi.zzv();
            if (this.zzi != null) {
                zzU(null, true);
                zzcel zzcelVar = this.zzi;
                if (zzcelVar != null) {
                    zzcelVar.zzr(null);
                    this.zzi.zzs();
                    this.zzi = null;
                }
                this.zzm = 1;
                this.zzl = false;
                this.zzp = false;
                this.zzq = false;
            }
        }
        this.zzd.zzf();
        this.zzb.zze();
        this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zze() {
        if (!zzS()) {
            this.zzq = true;
            return;
        }
        if (this.zzf.zza) {
            zzaa();
        }
        this.zzi.zzE(true);
        this.zzd.zze();
        this.zzb.zzd();
        this.zza.zza();
        com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcfe
            private final zzcfl zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzN();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzf() {
        if (zzS()) {
            if (this.zzf.zza) {
                zzab();
            }
            this.zzi.zzE(false);
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcff
                private final zzcfl zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzM();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final int zzg() {
        if (zzS()) {
            return (int) this.zzi.zzH();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final int zzh() {
        if (zzS()) {
            return (int) this.zzi.zzC();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzi(int i) {
        if (zzS()) {
            this.zzi.zzw(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzj(float f, float f2) {
        zzces zzcesVar = this.zzn;
        if (zzcesVar != null) {
            zzcesVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final int zzk() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final int zzl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final long zzm() {
        zzcel zzcelVar = this.zzi;
        if (zzcelVar != null) {
            return zzcelVar.zzI();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final long zzn() {
        zzcel zzcelVar = this.zzi;
        if (zzcelVar != null) {
            return zzcelVar.zzJ();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final long zzo() {
        zzcel zzcelVar = this.zzi;
        if (zzcelVar != null) {
            return zzcelVar.zzK();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final int zzp() {
        zzcel zzcelVar = this.zzi;
        if (zzcelVar != null) {
            return zzcelVar.zzL();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcex
    public final void zzq() {
        zzV(this.zzb.zzc(), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzr(final boolean z, final long j) {
        if (this.zzc != null) {
            zzccz.zze.execute(new Runnable(this, z, j) { // from class: com.google.android.gms.internal.ads.zzcfk
                private final zzcfl zza;
                private final boolean zzb;
                private final long zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = z;
                    this.zzc = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzH(this.zzb, this.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzs(int i) {
        if (this.zzm != i) {
            this.zzm = i;
            if (i == 3) {
                zzW();
            } else if (i != 4) {
            } else {
                if (this.zzf.zza) {
                    zzab();
                }
                this.zzd.zzf();
                this.zzb.zze();
                com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcfc
                    private final zzcfl zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzP();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzt(int i, int i2) {
        this.zzr = i;
        this.zzs = i2;
        zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzu(String str, Exception exc) {
        final String zzX = zzX(str, exc);
        String valueOf = String.valueOf(zzX);
        com.google.android.gms.ads.internal.util.zze.zzi(valueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(valueOf) : new String("ExoPlayerAdapter error: "));
        this.zzl = true;
        if (this.zzf.zza) {
            zzab();
        }
        com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this, zzX) { // from class: com.google.android.gms.internal.ads.zzcfd
            private final zzcfl zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzX;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzO(this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzv(String str, Exception exc) {
        final String zzX = zzX("onLoadException", exc);
        String valueOf = String.valueOf(zzX);
        com.google.android.gms.ads.internal.util.zze.zzi(valueOf.length() != 0 ? "ExoPlayerAdapter exception: ".concat(valueOf) : new String("ExoPlayerAdapter exception: "));
        com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this, zzX) { // from class: com.google.android.gms.internal.ads.zzcfa
            private final zzcfl zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzX;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzG(this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzw(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                zzc(str);
            }
            this.zzj = str;
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
            zzT();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzx(int i) {
        zzcel zzcelVar = this.zzi;
        if (zzcelVar != null) {
            zzcelVar.zzF(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzy(int i) {
        zzcel zzcelVar = this.zzi;
        if (zzcelVar != null) {
            zzcelVar.zzG(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzz(int i) {
        zzcel zzcelVar = this.zzi;
        if (zzcelVar != null) {
            zzcelVar.zzx(i);
        }
    }
}
