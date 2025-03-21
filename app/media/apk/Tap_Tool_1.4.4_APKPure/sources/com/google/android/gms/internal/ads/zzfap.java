package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfap extends AsyncTask<Object, Void, String> {
    private zzfaq zza;
    protected final zzfah zzd;

    public zzfap(zzfah zzfahVar, byte[] bArr) {
        this.zzd = zzfahVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfaq zzfaqVar = this.zza;
        if (zzfaqVar != null) {
            zzfaqVar.zzb(this);
        }
    }

    public final void zzb(zzfaq zzfaqVar) {
        this.zza = zzfaqVar;
    }
}
