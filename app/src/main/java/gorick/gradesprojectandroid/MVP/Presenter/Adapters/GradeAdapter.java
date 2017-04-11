package gorick.gradesprojectandroid.MVP.Presenter.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.math.BigDecimal;

import butterknife.BindView;
import butterknife.ButterKnife;
import gorick.gradesprojectandroid.R;

/**
 * Created by sg-0036936 on 07/03/2017.
 */

public class GradeAdapter extends RecyclerView.Adapter<GradeAdapter.RecyclerViewHolder> {

    private BigDecimal[] grades;
    private Integer[] faults;
    private String[] classes;


    public GradeAdapter(BigDecimal[] grades, Integer[] faults, String[] classes) {
        this.grades = grades;
        this.faults = faults;
        this.classes = classes;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_grades, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.matter.setText(classes[position]);
        holder.grade.setText((CharSequence) grades[position]);
        holder.fault.setText(faults[position]);
    }

    @Override
    public int getItemCount() {
        return classes == null ? 0 : classes.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.grades)
        TextView grade;
        @BindView(R.id.faults)
        TextView fault;
        @BindView(R.id.classes)
        TextView matter;


        public RecyclerViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);

        }
    }
}