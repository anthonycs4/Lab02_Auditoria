package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaim {
    private final zzaid zza = new zzaid();
    private final WindowManager zzb;
    private final zzail zzc;
    private final zzaik zzd;
    private boolean zze;
    private Surface zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzaim(Context context) {
        zzaik zzaikVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.zzb = (WindowManager) context.getSystemService("window");
        } else {
            this.zzb = null;
        }
        if (this.zzb != null) {
            if (zzaht.zza >= 17) {
                Objects.requireNonNull(context);
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager != null) {
                    zzaikVar = new zzaik(this, displayManager);
                }
            }
            this.zzd = zzaikVar;
            this.zzc = zzail.zza();
        } else {
            this.zzd = null;
            this.zzc = null;
        }
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzg = -1.0f;
        this.zzj = 1.0f;
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r10.zzh) >= r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r10.zza.zzd() >= 30) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r3 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzm() {
        /*
            r10 = this;
            int r0 = com.google.android.gms.internal.ads.zzaht.zza
            r1 = 30
            if (r0 < r1) goto L6d
            android.view.Surface r0 = r10.zzf
            if (r0 != 0) goto Lb
            goto L6d
        Lb:
            com.google.android.gms.internal.ads.zzaid r0 = r10.zza
            boolean r0 = r0.zzc()
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzaid r0 = r10.zza
            float r0 = r0.zzg()
            goto L1c
        L1a:
            float r0 = r10.zzg
        L1c:
            float r2 = r10.zzh
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L23
            return
        L23:
            r3 = 1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L58
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L58
            com.google.android.gms.internal.ads.zzaid r1 = r10.zza
            boolean r1 = r1.zzc()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzaid r1 = r10.zza
            long r6 = r1.zze()
            r8 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L4b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L4b:
            float r1 = r10.zzh
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L63
            goto L64
        L58:
            if (r6 != 0) goto L68
            com.google.android.gms.internal.ads.zzaid r2 = r10.zza
            int r2 = r2.zzd()
            if (r2 < r1) goto L63
            goto L64
        L63:
            r3 = 0
        L64:
            if (r3 == 0) goto L67
            goto L68
        L67:
            return
        L68:
            r10.zzh = r0
            r10.zzn(r5)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaim.zzm():void");
    }

    private final void zzn(boolean z) {
        Surface surface;
        if (zzaht.zza < 30 || (surface = this.zzf) == null) {
            return;
        }
        float f = 0.0f;
        if (this.zze) {
            float f2 = this.zzh;
            if (f2 != -1.0f) {
                f = this.zzj * f2;
            }
        }
        if (z || this.zzi != f) {
            this.zzi = f;
            zzp(surface, f);
        }
    }

    private final void zzo() {
        Surface surface;
        if (zzaht.zza < 30 || (surface = this.zzf) == null || this.zzi == 0.0f) {
            return;
        }
        this.zzi = 0.0f;
        zzp(surface, 0.0f);
    }

    private static void zzp(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            zzagm.zzb("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public final void zzb() {
        this.zze = true;
        zzl();
        zzn(false);
    }

    public final void zzc(Surface surface) {
        if (true == (surface instanceof zzaib)) {
            surface = null;
        }
        if (this.zzf == surface) {
            return;
        }
        zzo();
        this.zzf = surface;
        zzn(true);
    }

    public final void zzd() {
        zzl();
    }

    public final void zze(float f) {
        this.zzj = f;
        zzl();
        zzn(false);
    }

    public final void zzf(float f) {
        this.zzg = f;
        this.zza.zza();
        zzm();
    }

    public final void zzg(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzp = j2;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zzb(j * 1000);
        zzm();
    }

    public final void zzh() {
        this.zze = false;
        zzo();
    }

    public final void zzi() {
        if (this.zzb != null) {
            zzaik zzaikVar = this.zzd;
            if (zzaikVar != null) {
                zzaikVar.zzb();
            }
            zzail zzailVar = this.zzc;
            Objects.requireNonNull(zzailVar);
            zzailVar.zzc();
        }
    }

    public final long zzj(long j) {
        long j2;
        if (this.zzp != -1 && this.zza.zzc()) {
            long zzf = this.zzq + (((float) (this.zza.zzf() * (this.zzm - this.zzp))) / this.zzj);
            if (Math.abs(j - zzf) <= 20000000) {
                j = zzf;
            } else {
                zzl();
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzail zzailVar = this.zzc;
        if (zzailVar == null || this.zzk == -9223372036854775807L) {
            return j;
        }
        long j3 = zzailVar.zza;
        if (j3 == -9223372036854775807L) {
            return j;
        }
        long j4 = this.zzk;
        long j5 = j3 + (((j - j3) / j4) * j4);
        if (j <= j5) {
            j2 = j5 - j4;
        } else {
            j5 = j4 + j5;
            j2 = j5;
        }
        if (j5 - j >= j - j2) {
            j5 = j2;
        }
        return j5 - this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzq() {
        WindowManager windowManager = this.zzb;
        Objects.requireNonNull(windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / defaultDisplay.getRefreshRate());
            this.zzk = refreshRate;
            this.zzl = (refreshRate * 80) / 100;
            return;
        }
        Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    public final void zza() {
        if (this.zzb != null) {
            zzail zzailVar = this.zzc;
            Objects.requireNonNull(zzailVar);
            zzailVar.zzb();
            zzaik zzaikVar = this.zzd;
            if (zzaikVar != null) {
                zzaikVar.zza();
            }
            zzq();
        }
    }
}
