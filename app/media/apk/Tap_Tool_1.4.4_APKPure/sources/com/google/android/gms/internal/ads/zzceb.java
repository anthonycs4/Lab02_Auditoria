package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzceb extends TextureView implements zzcex {
    protected final zzceo zza;
    protected final zzcey zzb;

    public zzceb(Context context) {
        super(context);
        this.zza = new zzceo();
        this.zzb = new zzcey(context, this);
    }

    public void zzA(int i) {
    }

    public void zzB(int i) {
    }

    public abstract String zza();

    public abstract void zzb(zzcea zzceaVar);

    public abstract void zzc(String str);

    public abstract void zzd();

    public abstract void zze();

    public abstract void zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract void zzi(int i);

    public abstract void zzj(float f, float f2);

    public abstract int zzk();

    public abstract int zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract int zzp();

    public abstract void zzq();

    public void zzw(String str, String[] strArr) {
        zzc(str);
    }

    public void zzx(int i) {
    }

    public void zzy(int i) {
    }

    public void zzz(int i) {
    }
}
