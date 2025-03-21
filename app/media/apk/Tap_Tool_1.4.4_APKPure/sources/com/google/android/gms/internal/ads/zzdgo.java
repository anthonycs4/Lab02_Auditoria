package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdgo implements Runnable {
    private final zzdhh zza;

    private zzdgo(zzdhh zzdhhVar) {
        this.zza = zzdhhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzdhh zzdhhVar) {
        return new zzdgo(zzdhhVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzu();
    }
}
