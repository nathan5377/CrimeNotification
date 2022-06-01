package edu.skku.map.crimenotification.ui.register;

import edu.skku.map.crimenotification.base.ViewState;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public abstract class RegisterViewState implements ViewState {
   private RegisterViewState() {
   }

   // $FF: synthetic method
   public RegisterViewState(DefaultConstructorMarker $constructor_marker) {
      this();
   }


   public static final class RouteHome extends RegisterViewState {
      @NotNull
      public static final RouteHome INSTANCE;

      private RouteHome() {
         super((DefaultConstructorMarker)null);
      }

      static {
         RouteHome var0 = new RouteHome();
         INSTANCE = var0;
      }
   }


   public static final class Error extends RegisterViewState {
      @NotNull
      private final String message;

      @NotNull
      public final String getMessage() {
         return this.message;
      }

      public Error(@NotNull String message) {
         Intrinsics.checkNotNullParameter(message, "message");
         this.message = message;
      }

      @NotNull
      public final String component1() {
         return this.message;
      }

      @NotNull
      public final Error copy(@NotNull String message) {
         Intrinsics.checkNotNullParameter(message, "message");
         return new Error(message);
      }

      // $FF: synthetic method
      public static Error copy$default(Error var0, String var1, int var2, Object var3) {
         if ((var2 & 1) != 0) {
            var1 = var0.message;
         }

         return var0.copy(var1);
      }

      @NotNull
      public String toString() {
         return "Error(message=" + this.message + ")";
      }

      public int hashCode() {
         String var10000 = this.message;
         return var10000 != null ? var10000.hashCode() : 0;
      }

      public boolean equals(@Nullable Object var1) {
         if (this != var1) {
            if (var1 instanceof Error) {
               Error var2 = (Error)var1;
               if (Intrinsics.areEqual(this.message, var2.message)) {
                  return true;
               }
            }

            return false;
         } else {
            return true;
         }
      }
   }

   public static final class EnableInput extends RegisterViewState {
      private final boolean isEnable;

      public final boolean isEnable() {
         return this.isEnable;
      }

      public EnableInput(boolean isEnable) {
         super((DefaultConstructorMarker)null);
         this.isEnable = isEnable;
      }

      public final boolean component1() {
         return this.isEnable;
      }

      @NotNull
      public final EnableInput copy(boolean isEnable) {
         return new EnableInput(isEnable);
      }

      // $FF: synthetic method
      public static EnableInput copy$default(EnableInput var0, boolean var1, int var2, Object var3) {
         if ((var2 & 1) != 0) {
            var1 = var0.isEnable;
         }

         return var0.copy(var1);
      }

      @NotNull
      public String toString() {
         return "EnableInput(isEnable=" + this.isEnable + ")";
      }

      public int hashCode() {
         byte var10000;
         if (this.isEnable) {
            var10000 = 1;
         } else {
            var10000 = 0;
         }

         return var10000;
      }

      public boolean equals(@Nullable Object var1) {
         if (this != var1) {
            if (var1 instanceof EnableInput) {
               EnableInput var2 = (EnableInput)var1;
               if (this.isEnable == var2.isEnable) {
                  return true;
               }
            }

            return false;
         } else {
            return true;
         }
      }
   }
   public static final class ShowProgress extends RegisterViewState {
      @NotNull
      public static final ShowProgress INSTANCE;

      private ShowProgress() {
         super((DefaultConstructorMarker)null);
      }

      static {
         ShowProgress var0 = new ShowProgress();
         INSTANCE = var0;
      }
   }
   public static final class HideProgress extends RegisterViewState {
      @NotNull
      public static final HideProgress INSTANCE;

      private HideProgress() {
         super((DefaultConstructorMarker)null);
      }

      static {
         HideProgress var0 = new HideProgress();
         INSTANCE = var0;
      }
   }
}
