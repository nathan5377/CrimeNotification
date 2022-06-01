package edu.skku.map.crimenotification.ui.home;

import edu.skku.map.crimenotification.base.ViewState;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;


public abstract class HomeViewState implements ViewState {
    private HomeViewState() {
    }

    // $FF: synthetic method
    public HomeViewState(DefaultConstructorMarker $constructor_marker) {
        this();
    }

    public static final class Error extends HomeViewState {
        @NotNull
        private final String errorMessage;

        @NotNull
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public Error(@NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }

        @NotNull
        public final String component1() {
            return this.errorMessage;
        }

        @NotNull
        public final Error copy(@NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new Error(errorMessage);
        }

        // $FF: synthetic method
        public static Error copy$default(Error var0, String var1, int var2, Object var3) {
            if ((var2 & 1) != 0) {
                var1 = var0.errorMessage;
            }

            return var0.copy(var1);
        }

        @NotNull
        public String toString() {
            return "Error(errorMessage=" + this.errorMessage + ")";
        }

        public int hashCode() {
            String var10000 = this.errorMessage;
            return var10000 != null ? var10000.hashCode() : 0;
        }

        public boolean equals(@Nullable Object var1) {
            if (this != var1) {
                if (var1 instanceof Error) {
                    Error var2 = (Error) var1;
                    if (Intrinsics.areEqual(this.errorMessage, var2.errorMessage)) {
                        return true;
                    }
                }

                return false;
            } else {
                return true;
            }
        }
    }

    public static final class PermissionGrant extends HomeViewState {
        @NotNull
        public static final PermissionGrant INSTANCE;

        private PermissionGrant() {
            super((DefaultConstructorMarker) null);
        }

        static {
            PermissionGrant var0 = new PermissionGrant();
            INSTANCE = var0;
        }
    }
}
