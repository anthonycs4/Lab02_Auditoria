package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzey implements zzex {
    protected static volatile zzfy zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    private double zzr;
    private double zzs;
    protected final LinkedList<MotionEvent> zzc = new LinkedList<>();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzt = false;
    protected boolean zzp = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzey(Context context) {
        try {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbK)).booleanValue()) {
                zzeb.zza();
            } else {
                zzfz.zza(zza);
            }
            this.zzq = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final void zzm() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.size() > 0) {
            Iterator<MotionEvent> it = this.zzc.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.zzc.clear();
        } else {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String zzn(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzey.zzn(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    protected abstract zzcn zza(Context context, zzce zzceVar);

    protected abstract zzcn zzb(Context context, View view, Activity activity);

    protected abstract zzcn zzc(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzd(MotionEvent motionEvent) {
        Long l;
        if (this.zzt) {
            zzm();
            this.zzt = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = 0.0d;
            this.zzr = motionEvent.getRawX();
            this.zzs = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = rawX - this.zzr;
            double d2 = rawY - this.zzs;
            this.zzk += Math.sqrt((d * d) + (d2 * d2));
            this.zzr = rawX;
            this.zzs = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.zzb = obtain;
                    this.zzc.add(obtain);
                    if (this.zzc.size() > 6) {
                        this.zzc.remove().recycle();
                    }
                    this.zzf++;
                    this.zzh = zzl(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zze += motionEvent.getHistorySize() + 1;
                    zzga zzk = zzk(motionEvent);
                    Long l2 = zzk.zzd;
                    if (l2 != null && zzk.zzg != null) {
                        this.zzi += l2.longValue() + zzk.zzg.longValue();
                    }
                    if (this.zzq != null && (l = zzk.zze) != null && zzk.zzh != null) {
                        this.zzj += l.longValue() + zzk.zzh.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzg++;
                }
            } catch (zzfp unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zze(int i, int i2, int i3) {
        MotionEvent motionEvent;
        if (this.zzb != null) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzby)).booleanValue()) {
                zzm();
            } else {
                this.zzb.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            motionEvent = MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, this.zzq.density * i2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            motionEvent = null;
        }
        this.zzb = motionEvent;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final String zzf(Context context, String str, View view, Activity activity) {
        return zzn(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final String zzg(Context context, String str, View view) {
        return zzn(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final String zzi(Context context, View view, Activity activity) {
        return zzn(context, null, 2, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final String zzj(Context context) {
        if (zzgb.zzd()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzn(context, null, 1, null, null, null);
    }

    protected abstract zzga zzk(MotionEvent motionEvent) throws zzfp;

    protected abstract long zzl(StackTraceElement[] stackTraceElementArr) throws zzfp;
}
