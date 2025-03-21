package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyi;
import com.google.android.gms.internal.ads.zzfym;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfym<MessageType extends zzfym<MessageType, BuilderType>, BuilderType extends zzfyi<MessageType, BuilderType>> extends zzfwt<MessageType, BuilderType> {
    private static final Map<Object, zzfym<?, ?>> zzb = new ConcurrentHashMap();
    protected zzgaz zzc = zzgaz.zza();
    protected int zzd = -1;

    private static <T extends zzfym<T, ?>> T zza(T t) throws zzfyy {
        if (t == null || t.zzat()) {
            return t;
        }
        zzfyy zzfyyVar = new zzfyy(new zzgax(t).getMessage());
        zzfyyVar.zza(t);
        throw zzfyyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzaA(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzfyr zzaB() {
        return zzfyn.zzd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzfyr zzaC(zzfyr zzfyrVar) {
        int size = zzfyrVar.size();
        return zzfyrVar.zzf(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzfyu zzaD() {
        return zzfzj.zzd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzfyv<E> zzaE() {
        return zzgad.zzd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzfyv<E> zzaF(zzfyv<E> zzfyvVar) {
        int size = zzfyvVar.size();
        return zzfyvVar.zze(size == 0 ? 10 : size + size);
    }

    static <T extends zzfym<T, ?>> T zzaG(T t, byte[] bArr, int i, int i2, zzfxy zzfxyVar) throws zzfyy {
        T t2 = (T) t.zzb(4, null, null);
        try {
            zzgak zzb2 = zzgac.zza().zzb(t2.getClass());
            zzb2.zzi(t2, bArr, 0, i2, new zzfww(zzfxyVar));
            zzb2.zzj(t2);
            if (t2.zza == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (zzfyy e) {
            e = e;
            if (e.zzc()) {
                e = new zzfyy(e);
            }
            e.zza(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzfyy) {
                throw ((zzfyy) e2.getCause());
            }
            zzfyy zzfyyVar = new zzfyy(e2);
            zzfyyVar.zza(t2);
            throw zzfyyVar;
        } catch (IndexOutOfBoundsException unused) {
            zzfyy zzd = zzfyy.zzd();
            zzd.zza(t2);
            throw zzd;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzfym<T, ?>> T zzaH(T t, zzfxj zzfxjVar) throws zzfyy {
        zzfxy zza = zzfxy.zza();
        try {
            zzfxo zzp = zzfxjVar.zzp();
            T t2 = (T) t.zzb(4, null, null);
            try {
                try {
                    zzgak zzb2 = zzgac.zza().zzb(t2.getClass());
                    zzb2.zzf(t2, zzfxp.zza(zzp), zza);
                    zzb2.zzj(t2);
                    try {
                        zzp.zzb(0);
                        zza(t2);
                        zza(t2);
                        return t2;
                    } catch (zzfyy e) {
                        e.zza(t2);
                        throw e;
                    }
                } catch (zzfyy e2) {
                    e = e2;
                    if (e.zzc()) {
                        e = new zzfyy(e);
                    }
                    e.zza(t2);
                    throw e;
                }
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzfyy) {
                    throw ((zzfyy) e3.getCause());
                }
                zzfyy zzfyyVar = new zzfyy(e3);
                zzfyyVar.zza(t2);
                throw zzfyyVar;
            } catch (RuntimeException e4) {
                if (e4.getCause() instanceof zzfyy) {
                    throw ((zzfyy) e4.getCause());
                }
                throw e4;
            }
        } catch (zzfyy e5) {
            throw e5;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzfym<T, ?>> T zzaI(T t, zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        try {
            zzfxo zzp = zzfxjVar.zzp();
            T t2 = (T) t.zzb(4, null, null);
            try {
                try {
                    zzgak zzb2 = zzgac.zza().zzb(t2.getClass());
                    zzb2.zzf(t2, zzfxp.zza(zzp), zzfxyVar);
                    zzb2.zzj(t2);
                    try {
                        zzp.zzb(0);
                        zza(t2);
                        return t2;
                    } catch (zzfyy e) {
                        e.zza(t2);
                        throw e;
                    }
                } catch (RuntimeException e2) {
                    if (e2.getCause() instanceof zzfyy) {
                        throw ((zzfyy) e2.getCause());
                    }
                    throw e2;
                }
            } catch (zzfyy e3) {
                e = e3;
                if (e.zzc()) {
                    e = new zzfyy(e);
                }
                e.zza(t2);
                throw e;
            } catch (IOException e4) {
                if (e4.getCause() instanceof zzfyy) {
                    throw ((zzfyy) e4.getCause());
                }
                zzfyy zzfyyVar = new zzfyy(e4);
                zzfyyVar.zza(t2);
                throw zzfyyVar;
            }
        } catch (zzfyy e5) {
            throw e5;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzfym<T, ?>> T zzaJ(T t, byte[] bArr) throws zzfyy {
        T t2 = (T) zzaG(t, bArr, 0, bArr.length, zzfxy.zza());
        zza(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzfym<T, ?>> T zzaK(T t, byte[] bArr, zzfxy zzfxyVar) throws zzfyy {
        T t2 = (T) zzaG(t, bArr, 0, bArr.length, zzfxyVar);
        zza(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzfym> T zzax(Class<T> cls) {
        Map<Object, zzfym<?, ?>> map = zzb;
        zzfym<?, ?> zzfymVar = map.get(cls);
        if (zzfymVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfymVar = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzfymVar == null) {
            zzfymVar = (zzfym) ((zzfym) zzgbi.zzc(cls)).zzb(6, null, null);
            if (zzfymVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzfymVar);
        }
        return zzfymVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzfym> void zzay(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zzaz(zzfzu zzfzuVar, String str, Object[] objArr) {
        return new zzgae(zzfzuVar, str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzgac.zza().zzb(getClass()).zzb(this, (zzfym) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzc = zzgac.zza().zzb(getClass()).zzc(this);
        this.zza = zzc;
        return zzc;
    }

    public final String toString() {
        return zzfzw.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfzu
    public final /* bridge */ /* synthetic */ zzfzt zzaL() {
        zzfyi zzfyiVar = (zzfyi) zzb(5, null, null);
        zzfyiVar.zzai(this);
        return zzfyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzu
    public final /* bridge */ /* synthetic */ zzfzt zzaM() {
        return (zzfyi) zzb(5, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfwt
    public final int zzap() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfwt
    public final void zzaq(int i) {
        this.zzd = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends zzfym<MessageType, BuilderType>, BuilderType extends zzfyi<MessageType, BuilderType>> BuilderType zzas() {
        return (BuilderType) zzb(5, null, null);
    }

    public final BuilderType zzau() {
        BuilderType buildertype = (BuilderType) zzb(5, null, null);
        buildertype.zzai(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzfzu
    public final void zzav(zzfxt zzfxtVar) throws IOException {
        zzgac.zza().zzb(getClass()).zzn(this, zzfxu.zza(zzfxtVar));
    }

    @Override // com.google.android.gms.internal.ads.zzfzu
    public final int zzaw() {
        int i = this.zzd;
        if (i == -1) {
            int zze = zzgac.zza().zzb(getClass()).zze(this);
            this.zzd = zze;
            return zze;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final /* bridge */ /* synthetic */ zzfzu zzbe() {
        return (zzfym) zzb(6, null, null);
    }

    public final boolean zzat() {
        Boolean bool = Boolean.TRUE;
        byte byteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgac.zza().zzb(getClass()).zzk(this);
        zzb(2, true != zzk ? null : this, null);
        return zzk;
    }
}
