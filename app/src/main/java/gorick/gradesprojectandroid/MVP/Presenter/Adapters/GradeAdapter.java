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

public class GradeAdapter extends RecyclerView.Adapter<GradeAdapter.RecyclerViewHolder> {

    private ArrayList<GradeModel> grades;
    private ArrayList<GradeModel> faults;


    public GradeAdapter(ArrayList<GradeModel> grades, ArrayList<GradeModel> faults) {
        this.grades = grades;
        this.faults = faults;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_grades, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.grade.setText(grades.get(position).toString());
        holder.fault.setText(faults.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return grades == null ? 0 : grades.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.grade) TextView grade;
        @BindView(R.id.faults) TextView fault;


        public RecyclerViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);

        }
    }
}