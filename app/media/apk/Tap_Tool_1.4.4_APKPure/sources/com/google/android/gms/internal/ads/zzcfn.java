package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcfn implements zzaqn {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> zzc = new AtomicReference<>();
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzaqm zzh;
    private final zzaqt<? super zzcfn> zzi;
    private zzaqg zzj;
    private HttpURLConnection zzk;
    private InputStream zzl;
    private boolean zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final SSLSocketFactory zzd = new zzcfm(this);
    private final Set<Socket> zzs = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfn(String str, zzaqt<? super zzcfn> zzaqtVar, int i, int i2, int i3) {
        zzaqu.zzf(str);
        this.zzg = str;
        this.zzi = zzaqtVar;
        this.zzh = new zzaqm();
        this.zze = i;
        this.zzf = i2;
        this.zzr = i3;
    }

    private final void zzi() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Unexpected error while disconnecting", e);
            }
            this.zzk = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x010c, code lost:
        if (r6 != 0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x029e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0263 A[Catch: IOException -> 0x02bf, TryCatch #3 {IOException -> 0x02bf, blocks: (B:3:0x000e, B:4:0x001e, B:6:0x0024, B:8:0x002e, B:9:0x0036, B:10:0x004e, B:12:0x0054, B:24:0x00c0, B:37:0x00f6, B:96:0x0258, B:98:0x0263, B:100:0x0274, B:102:0x027c, B:104:0x028a, B:106:0x0294, B:107:0x0297, B:105:0x028f, B:109:0x029e, B:110:0x02a5, B:19:0x007c, B:21:0x0096, B:23:0x00bb, B:111:0x02a6, B:112:0x02be), top: B:126:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzaqe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zza(com.google.android.gms.internal.ads.zzaqg r24) throws com.google.android.gms.internal.ads.zzaqk {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfn.zza(com.google.android.gms.internal.ads.zzaqg):long");
    }

    @Override // com.google.android.gms.internal.ads.zzaqe
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    public final Map<String, List<String>> zze() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(int i) {
        this.zzr = i;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqe
    public final void zzd() throws zzaqk {
        try {
            if (this.zzl != null) {
                HttpURLConnection httpURLConnection = this.zzk;
                long j = this.zzo;
                if (j != -1) {
                    j -= this.zzq;
                }
                if (zzarj.zza == 19 || zzarj.zza == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j <= 2048) {
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.zzl.close();
                } catch (IOException e) {
                    throw new zzaqk(e, this.zzj, 3);
                }
            }
        } finally {
            this.zzl = null;
            zzi();
            if (this.zzm) {
                this.zzm = false;
            }
            this.zzs.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqe
    public final int zzb(byte[] bArr, int i, int i2) throws zzaqk {
        try {
            if (this.zzp != this.zzn) {
                byte[] andSet = zzc.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j = this.zzp;
                    long j2 = this.zzn;
                    if (j != j2) {
                        int read = this.zzl.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.zzp += read;
                            zzaqt<? super zzcfn> zzaqtVar = this.zzi;
                            if (zzaqtVar != null) {
                                ((zzcgb) zzaqtVar).zzS(this, read);
                            }
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        zzc.set(andSet);
                        break;
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzo;
            if (j3 != -1) {
                long j4 = j3 - this.zzq;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.zzl.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzo == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzq += read2;
            zzaqt<? super zzcfn> zzaqtVar2 = this.zzi;
            if (zzaqtVar2 != null) {
                ((zzcgb) zzaqtVar2).zzS(this, read2);
                return read2;
            }
            return read2;
        } catch (IOException e) {
            throw new zzaqk(e, this.zzj, 2);
        }
    }
}
