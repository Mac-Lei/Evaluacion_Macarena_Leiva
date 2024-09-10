package com.mac.macarena_leiva;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {
    private List<Task> tasks;

    public TaskAdapter(List<Task> tasks) {
        this.tasks = tasks;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.task_item, parent, false);
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task task = tasks.get(position);
        holder.nameTextView.setText(task.getName());
        holder.priorityTextView.setText(task.getPriority());
        holder.progressTextView.setText("Progreso: " + task.getProgress() + "%");
        holder.importanceTextView.setText("Importancia: " + task.getImportance());
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    public static class TaskViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView priorityTextView;
        TextView progressTextView;
        TextView importanceTextView;

        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.task_name);
            priorityTextView = itemView.findViewById(R.id.task_priority);
            progressTextView = itemView.findViewById(R.id.task_progress);
            importanceTextView = itemView.findViewById(R.id.task_importance);
        }
    }
}
