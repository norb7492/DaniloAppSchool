package gorick.gradesprojectandroid.MVP.Presenter.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import gorick.gradesprojectandroid.MVP.Model.GradeModel;
import gorick.gradesprojectandroid.R;

/**
 * Created by sg-0036936 on 07/03/2017.
 */

public class MatterAdapter extends RecyclerView.Adapter<MatterAdapter.RecyclerViewHolder> {

    private ArrayList<GradeModel> matters;

    public MatterAdapter(ArrayList<GradeModel> matters) {
        this.matters = matters;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_grades, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.matter.setText(matters.get(position).toString());

    }

    @Override
    public int getItemCount() {
        return matters == null ? 0 : matters.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.grade) TextView matter;

        public RecyclerViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}