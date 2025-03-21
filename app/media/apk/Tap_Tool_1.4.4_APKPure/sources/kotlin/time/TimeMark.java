package kotlin.time;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
/* compiled from: TimeSource.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u001b\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\r\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lkotlin/time/TimeMark;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "()V", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "hasNotPassedNow", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "hasPassedNow", "minus", "duration", "minus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "plus", "plus-LRDsOJo", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class TimeMark {
    /* renamed from: elapsedNow-UwyO8pc */
    public abstract long mo1297elapsedNowUwyO8pc();

    /* renamed from: plus-LRDsOJo */
    public TimeMark mo1298plusLRDsOJo(long j) {
        return new AdjustedTimeMark(this, j, null);
    }

    /* renamed from: minus-LRDsOJo  reason: not valid java name */
    public TimeMark m1390minusLRDsOJo(long j) {
        return mo1298plusLRDsOJo(Duration.m1359unaryMinusUwyO8pc(j));
    }

    public final boolean hasPassedNow() {
        return !Duration.m1339isNegativeimpl(mo1297elapsedNowUwyO8pc());
    }

    public final boolean hasNotPassedNow() {
        return Duration.m1339isNegativeimpl(mo1297elapsedNowUwyO8pc());
    }
}
