package edu.skku.map.crimenotification.ui.adapter.viewholder;

import android.util.Log;

import androidx.recyclerview.widget.RecyclerView;

import edu.skku.map.crimenotification.data.model.DistanceCriminal;
import edu.skku.map.crimenotification.databinding.ItemCriminalListBinding;

import org.jetbrains.annotations.NotNull;

public final class CriminalViewHolder extends RecyclerView.ViewHolder {
    private final ItemCriminalListBinding binding;

    public final void bind(@NotNull DistanceCriminal item) {
        Log.d("결과", item.getName());
        this.binding.setItem(item);
    }

    public CriminalViewHolder(@NotNull ItemCriminalListBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
