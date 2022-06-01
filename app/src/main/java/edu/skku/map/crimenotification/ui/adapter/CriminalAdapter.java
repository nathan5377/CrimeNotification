package edu.skku.map.crimenotification.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import edu.skku.map.crimenotification.R;
import edu.skku.map.crimenotification.data.model.DistanceCriminal;
import edu.skku.map.crimenotification.databinding.ItemCriminalListBinding;
import edu.skku.map.crimenotification.ui.adapter.viewholder.CriminalViewHolder;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public final class CriminalAdapter extends RecyclerView.Adapter<CriminalViewHolder> {
    private final List<DistanceCriminal> criminalList = new ArrayList<>();

    @NonNull
    @Override
    public CriminalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemCriminalListBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_criminal_list, parent, false);
        return new CriminalViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CriminalViewHolder holder, int position) {
        holder.bind((DistanceCriminal) criminalList.get(position));
    }

    @Override
    public int getItemCount() {
        return criminalList.size();
    }

    public final void renewAll(@NotNull List<DistanceCriminal> list) {
        this.criminalList.clear();
        this.criminalList.addAll(list);
        this.notifyDataSetChanged();
    }

    public final void clear() {
        this.criminalList.clear();
        this.notifyDataSetChanged();
    }
}
